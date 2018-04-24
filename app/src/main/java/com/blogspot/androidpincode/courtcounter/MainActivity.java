package com.blogspot.androidpincode.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreePointsForTeamA(View view) {
        displayForTeamA(3);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoPointsForTeamA(View view) {
        displayForTeamA(2);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOnePointForTeamA(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
