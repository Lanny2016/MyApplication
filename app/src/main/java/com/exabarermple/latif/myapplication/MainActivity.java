package com.exabarermple.latif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int TotalscoreForTeamA = 0;
    private int TotalscoreForTeamB = 0;
    private int AddedScoreForA;
    private int AddedScoreForB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    /**
     * display method for Team A score textView
     */
    public void displayTeamAScore(int score) {
        TextView TeamATextView = (TextView) findViewById ( R.id.teamATextView );
        TeamATextView.setText ( String.valueOf ( score ) );
    }

    // add 6 point to scoreForTeamA
    //     calls displayTeamAScore method
    public void AddSixPointForTeamA(View view) {
        AddedScoreForA = 6;
        TotalscoreForTeamA += AddedScoreForA;
        displayTeamAScore ( TotalscoreForTeamA );
    }
    // add 3 point to scoreForTeamA
    //     calls displayTeamAScore method

    public void AddThreePointForTeamA(View view) {
        AddedScoreForA = 3;
        TotalscoreForTeamA += AddedScoreForA;
        displayTeamAScore ( TotalscoreForTeamA );
    }

    // add 2 point to scoreForTeamA
    //     calls displayTeamAScore method
    public void AddTwoPointForTeamA(View view) {
        AddedScoreForA = 2;
        TotalscoreForTeamA += AddedScoreForA;
        displayTeamAScore ( TotalscoreForTeamA );
    }

    // add 1 point to scoreForTeamA
    //     calls displayTeamAScore method
    public void AddOnePointForTeamA(View view) {
        AddedScoreForA = 1;
        TotalscoreForTeamA += AddedScoreForA;
        displayTeamAScore ( TotalscoreForTeamA );
    }

    // restore the value of last addition
    public void restoreAValue(View view) {
        int restoreValueA = TotalscoreForTeamA - AddedScoreForA;
        TotalscoreForTeamA = restoreValueA;
        displayTeamAScore ( restoreValueA );
    }

    /**
     * display method for Team B score textView
     */
    public void displayTeamBscore(int score) {
        TextView TeamBTextView = (TextView) findViewById ( R.id.teamBTextView );
        TeamBTextView.setText ( String.valueOf ( score ) );
    }

    // add 6 point to scoreForTeamB
    // calls displayTeamAScore method
    public void AddSixPointForTeamB(View view) {
        AddedScoreForB = 6;
        TotalscoreForTeamB += AddedScoreForB;
        displayTeamBscore ( TotalscoreForTeamB );
    }
    // add 3 point to scoreForTeamB
    // calls displayTeamAScore method

    public void AddThreePointForTeamB(View view) {
        AddedScoreForB = 3;
        TotalscoreForTeamB += AddedScoreForB;
        displayTeamBscore ( TotalscoreForTeamB );
    }

    // add 2 point to scoreForTeamB
    // calls displayTeamAScore method
    public void AddTwoPointForTeamB(View view) {
        AddedScoreForB = 2;
        TotalscoreForTeamB += AddedScoreForB;
        displayTeamBscore ( TotalscoreForTeamB );
    }

    // add 1 point to scoreForTeamB
    // calls displayTeamAScore method
    public void AddOnePointForTeamB(View view) {
        AddedScoreForB = 1;
        TotalscoreForTeamB += AddedScoreForB;
        displayTeamBscore ( TotalscoreForTeamB );
    }

    // restore the value of last addition
    public void restoreBValue(View view) {
        int restoreValueB = TotalscoreForTeamB - AddedScoreForB;
        TotalscoreForTeamB = restoreValueB;
        displayTeamBscore ( restoreValueB );
    }

    // Reset button method
    public void resetScore(View view) {

        TotalscoreForTeamA = 0;
        TotalscoreForTeamB = 0;
        displayTeamAScore ( TotalscoreForTeamA );
        displayTeamBscore ( TotalscoreForTeamB );
    }

}
