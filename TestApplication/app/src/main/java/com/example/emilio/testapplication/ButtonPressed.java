package com.example.emilio.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ButtonPressed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_pressed);

        Button button5 = (Button) (findViewById(R.id.button5));
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(ButtonPressed.this, MainActivity.class));
            }
        });

    }
}
