package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set onClickListener on the rock list text view
        TextView rockTextView = findViewById(R.id.tv_rock_list);
        rockTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        //Set onClickListener on the hip hop list text view
        TextView hipHopTextView = findViewById(R.id.tv_hip_hop_list);
        hipHopTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hipHopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(hipHopIntent);
            }
        });

        //Set onClickListener on the party list text view
        TextView partyTextView = findViewById(R.id.tv_party_list);
        partyTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);
                startActivity(partyIntent);
            }
        });
    }
}
