package com.example.emilio.testapplication;

import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    static String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Application is Running!");

        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        // This assigns button4 to a different page on the app
        Button button4 = (Button) (findViewById(R.id.button4));
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });

        Button button3 = (Button) (findViewById(R.id.button3));
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NeedsActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    // These assign buttons 1-3 to a website
    public void pressTheButton(View view) {
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void button2 (View view) {
        Intent button2 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.servicenetwork.com/olg/mor/Donate.aspx?FormId=F4E19933-8092-4ABE-A0EC-296338E693E9"));
        startActivity(button2);
    }
    /*
    public void button3 (View view) {
        Intent button3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"));
        startActivity(button3);
    }
    */
}

