package com.blogspot.androidpincode.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Track the score for Team A
    int scoreTeamA = 0;

    // Track the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for Team A and Team B.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }

}
