package com.example.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForTeamA(0);
        displayGoalForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
    }

    /**
     * Increase the goal score for Team A by 1 point.
     *
     * @param view
     */
    public void addGoalForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    /**
     * Increase the foul count for Team A by 1 points.
     *
     * @param view
     */
    public void addFoulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Increase the goal score for Team B by 1 point.
     *
     * @param view
     */
    public void addGoalForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }

    /**
     * Increase the foul count for Team B by 1 points.
     *
     * @param view
     */
    public void addFoulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Reset the goal score and foul count for both teams back to 0.
     *
     * @param view
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the goal score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul count for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_a_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul count for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_b_count);
        scoreView.setText(String.valueOf(score));
    }
}