package com.nihongo.simonini;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*
            INTRO

       */

        //  Declare a new thread to do a preference check
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //  Initialize SharedPreferences
                SharedPreferences getPrefs = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());

                //  Create a new boolean and preference and set it to true
                boolean isFirstStart = getPrefs.getBoolean("firstStart", true);

                //  If the activity has never started before...
                if (isFirstStart) {

                    //  Launch app intro
                    Intent i = new Intent(MainActivity.this, Intro.class);
                    startActivity(i);

                    //  Make a new preferences editor
                    SharedPreferences.Editor e = getPrefs.edit();

                    //  Edit preference to make it false because we don't want this to run again
                    e.putBoolean("firstStart", false);

                    //  Apply changes
                    e.apply();
                }
            }
        });

        // Start the thread
        t.start();


        /*
            ANIMALS
         */
        TextView animals = (TextView) findViewById(R.id.animals);

        animals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(openActivityI);
            }
        });

        /*
            ANIMALS
         */
        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(openActivityI);
            }
        });

        /*
            EXPRESSIONS
         */
        TextView expressions = (TextView) findViewById(R.id.expressions);

        expressions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, ExpressionsActivity.class);
                startActivity(openActivityI);
            }
        });

        /*
            FAMILY
         */
        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(openActivityI);
            }
        });

        /*
            NUMBERS
         */
        TextView numbers = (TextView) findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(openActivityI);
            }
        });

        /*
            ABOUT
         */
        TextView about = (TextView) findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Intent to open another activity
                Intent openActivityI = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(openActivityI);
            }
        });





    }


    }

