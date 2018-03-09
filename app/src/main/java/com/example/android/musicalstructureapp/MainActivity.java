package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView rockTextView;
    TextView hipHopTextView;
    TextView partyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockTextView = findViewById(R.id.tv_rock_list);
        hipHopTextView = findViewById(R.id.tv_hip_hop_list);
        partyTextView = findViewById(R.id.tv_party_list);
        rockTextView.setOnClickListener(this);
        hipHopTextView.setOnClickListener(this);
        partyTextView.setOnClickListener(this);
    }

    //set a click listener for each text view.
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_rock_list:
                //start rock activity.
                Intent rockIntent = new Intent(this, RockActivity.class);
                this.startActivity(rockIntent);
                break;
            //start hip hop activity.
            case R.id.tv_hip_hop_list:
                Intent hipHopIntent = new Intent(this, HipHopActivity.class);
                this.startActivity(hipHopIntent);
                break;
            //start party activity.
            case R.id.tv_party_list:
                Intent partyIntent = new Intent(this, PartyActivity.class);
                this.startActivity(partyIntent);
                break;
        }
    }
}



