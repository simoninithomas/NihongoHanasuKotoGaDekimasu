package com.nihongo.simonini;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.nihongo.simonini.R.id.numbers;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

         /*
            UDACITY (implicit intent)
         */
        Button udacity = (Button) findViewById(R.id.course);

        udacity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Url of the udacity's course
                String url = "https://www.udacity.com/course/android-basics-multi-screen-apps--ud839";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Verify that the intent will resolve properly
                if(intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                }
            }
        });

         /*
            MY WEBSITE (implicit intent)
         */
        Button website = (Button) findViewById(R.id.website);

        website.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Url of the udacity's course
                String url = "http://www.simoninithomas.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Verify that the intent will resolve properly
                if(intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                }
            }
        });

         /*
            CONTACT (implicit intent)
         */
        Button contact = (Button) findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: simonini_thomas@outlook.fr"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Email from Nihongo wo Hanasu koto ga dekimasu app");

                // Verify that the intent will resolve properly
                if(intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                }
            }
        });

    }
}
