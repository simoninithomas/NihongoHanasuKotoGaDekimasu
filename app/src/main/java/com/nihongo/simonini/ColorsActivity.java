package com.nihongo.simonini;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    // This variable contains the MediaPlayer we want to play.
    private MediaPlayer mMediaPlayer;

    // Global variable for the audio managers that I can initalize it once
    // during the lifetime activity.
    // Handles audio focus when playing a sound file
    private AudioManager mAudioManager;

    // mOnAudioFocusChangeListener is a global variable because we need to
    // pass the listener as an input every time we request audio focus
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
            // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
            // our app is allowed to continue playing sound but at a lower volume. We'll treat
            // both cases the same way because our app is playing short sound files.
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {

                // Pause playback and reset player to the start of the file.
                mMediaPlayer.pause();
                // We wrote 0 because it's better if we gain audio focus back
                // it would be better to the user to hear the word from the beginning
                mMediaPlayer.seekTo(0);
            }

            // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
            else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mMediaPlayer.start();
            }

            // The AUDIOFOCUS_LOSS case means we've lost audio focus and
            // Stop playback and clean up resources
            else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();


    }

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Initialise AudioManager by calling getSystemService
        // and passing in the audio service constant
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("あか", "Aki", "Red", R.drawable.ic_red, R.raw.aki));
        words.add(new Word("きいろ", "Kiiro", "Yellow", R.drawable.ic_yellow, R.raw.kiiro));
        words.add(new Word("あお", "Ao", "Blue", R.drawable.ic_blue, R.raw.ao));
        words.add(new Word("みどり色", "Midori iro", "Green", R.drawable.ic_green, R.raw.midori_iro));
        words.add(new Word("むらさき色", "Murasaki iro", "Purple", R.drawable.ic_purple, R.raw.murasaki_iro));
        words.add(new Word("オレンジ色", "Orenji iro", "Orange", R.drawable.ic_orange, R.raw.orenji_iro));
        words.add(new Word("ピンク", "Pinku", "Pink", R.drawable.ic_pink, R.raw.pinku));
        words.add(new Word("黒", "Kuro", "Black", R.drawable.ic_black, R.raw.kuro));
        words.add(new Word("白", "Shiro", "White", R.drawable.ic_white, R.raw.shiro));
        words.add(new Word("茶色", "Cha iro", "Brown", R.drawable.ic_brown, R.raw.cha_iro));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(ColorsActivity.this, words, R.color.colors);


        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                // Get the position of the element
                Word word = words.get(position);

                // Release the media player if it currently exists
                // because we are about to play a different sound file.
                releaseMediaPlayer();


                // Request audio focus before setting up the media player
                // to play the sound

                // Request audio focus so in order to play the audio file. The app needs to play a
                // short audio file, so we will request audio focus with a short amount of time
                // with AUDIOFOCUS_GAIN_TRANSIENT.
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        // Music stream type
                        AudioManager.STREAM_MUSIC,
                        // Request permanent focus
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                // If result == AUDIOFOCUS_REQUEST_GRANTED we successfully gained audio focus
                // and can proceed with playing audio in your app
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.

                    mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getSoundResourceId());
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so we can stop
                    // and release media player once the sounds has finished playing
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);

                }
            }
        });


    }





}



