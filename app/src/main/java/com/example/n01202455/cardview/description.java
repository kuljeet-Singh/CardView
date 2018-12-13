package com.example.n01202455.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import static com.example.n01202455.cardview.R.layout.activity_description;

public class description extends AppCompatActivity implements View.OnClickListener {

    private CardView roadCardView, waterCardView, airCardView, railCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        roadCardView = findViewById(R.id.roadways);
        railCardView = findViewById(R.id.railways);
        airCardView = findViewById(R.id.airways);
        waterCardView = findViewById(R.id.waterways);

        roadCardView.setOnClickListener(this);
        railCardView.setOnClickListener(this);
        airCardView.setOnClickListener(this);
        waterCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId())
        {
            case R.id.roadways:
            {
                intent = new Intent(this, bhej_item.class);
                startActivity(intent);
                break;
            }

            case R.id.waterways:
            {
                intent = new Intent(this, bhej_item.class);
                startActivity(intent);
                break;
            }

            case R.id.airways:
            {
                intent = new Intent(this, bhej_item.class);
                startActivity(intent);
                break;
            }

            case R.id.railways:
            {
                intent = new Intent(this, bhej_item.class);
                startActivity(intent);
                break;
            }
        }
    }
}
