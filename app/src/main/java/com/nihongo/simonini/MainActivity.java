package com.nihongo.simonini;

import android.content.Intent;
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

        /*Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });*/

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





    }


    }

