package com.nihongo.simonini;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(AppIntroFragment.newInstance("こんにちは!", "This app will help you to learn some japanese words and expressions", R.drawable.ic_arrow_forward_white, ResourcesCompat.getColor(getResources(), R.color.colorAccent, null)));
        addSlide(AppIntroFragment.newInstance("聴く", "Tap to listen the pronunciation", R.drawable.ic_arrow_forward_white, ResourcesCompat.getColor(getResources(), R.color.colorAccent, null)));
        addSlide(AppIntroFragment.newInstance("楽しそう!", "", R.drawable.ic_arrow_forward_white, ResourcesCompat.getColor(getResources(), R.color.colorAccent, null)));

        /*OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));
*/
        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    /*@Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }*/

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent openActivityI = new Intent(Intro.this, MainActivity.class);
        startActivity(openActivityI);

    }

      /*@Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }*/
}