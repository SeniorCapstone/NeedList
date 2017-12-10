package com.example.emilio.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class NeedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needs);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("list");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String list = dataSnapshot.getValue(String.class);

                //output to TextView
                setContentView(R.layout.activity_needs);
                TextView textView = (TextView) findViewById(R.id.textView1);
                textView.setText("List: " + list);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                setContentView(R.layout.activity_needs);
                TextView textView = (TextView) findViewById(R.id.textView1);
                textView.setText("Failed to read value");

            }


        });





    }





}
