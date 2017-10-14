package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

//        In this project, from the Udacity's Court Counter, I have created a game of Oca(Goose).
//        In the Layout I capture the click with the onclick option of each button and I invoke a method.
//        You do the sum and win it before it reaches 64, it should be with a die of six and random, but that's not what the project asked for.
//        I use full screen landscape and do not allow it to be rotated in the AndroidManifest.
//        Layout is a combination of Linearlayouts with weight.

public class MainActivity extends AppCompatActivity {
    ImageView photo1, photo2;

    int[] photoId = {R.drawable.winner, R.drawable.photo01, R.drawable.photo02, R.drawable.photo03, R.drawable.photo04, R.drawable.photo05, R.drawable.photo06, R.drawable.photo07, R.drawable.photo08, R.drawable.photo09, R.drawable.photo10, R.drawable.photo11, R.drawable.photo12, R.drawable.photo13, R.drawable.photo14, R.drawable.photo15, R.drawable.photo16, R.drawable.photo17, R.drawable.photo18, R.drawable.photo19, R.drawable.photo20, R.drawable.photo21, R.drawable.photo22, R.drawable.photo23, R.drawable.photo24, R.drawable.photo25, R.drawable.photo26, R.drawable.photo27, R.drawable.photo28, R.drawable.photo29, R.drawable.photo30, R.drawable.photo31, R.drawable.photo32, R.drawable.photo33, R.drawable.photo34, R.drawable.photo35, R.drawable.photo36, R.drawable.photo37, R.drawable.photo38, R.drawable.photo39, R.drawable.photo40, R.drawable.photo41, R.drawable.photo42, R.drawable.photo43, R.drawable.photo44, R.drawable.photo45, R.drawable.photo46, R.drawable.photo47, R.drawable.photo48, R.drawable.photo49, R.drawable.photo50, R.drawable.photo51, R.drawable.photo52, R.drawable.photo53, R.drawable.photo54, R.drawable.photo55, R.drawable.photo56, R.drawable.photo57, R.drawable.photo58, R.drawable.photo59, R.drawable.photo60, R.drawable.photo61, R.drawable.photo62};


    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addFourForTeamA(View v) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);

    }


    public void addSixForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }


    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }


    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addFourForTeamB(View v) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);

    }


    public void addFiveForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);

    }


    public void addSixForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void winLoser() {
        if (scoreTeamA >= 62) {


            scoreTeamA = 0;
            scoreTeamB = 0;
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(0));
            photo1 = (ImageView) findViewById(R.id.imageView1);
            photo1.setImageResource(R.drawable.photowin);
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
            scoreView2.setText(String.valueOf(0));
            photo2 = (ImageView) findViewById(R.id.imageView2);
            photo2.setImageResource(R.drawable.photoloser);

        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(0));
            photo1 = (ImageView) findViewById(R.id.imageView1);
            photo1.setImageResource(R.drawable.photoloser);
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
            scoreView2.setText(String.valueOf(0));
            photo2 = (ImageView) findViewById(R.id.imageView2);
            photo2.setImageResource(R.drawable.photowin);

        }
    }


    public void displayForTeamA(int scoreA) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
        photo1 = (ImageView) findViewById(R.id.imageView1);
        if (scoreTeamA < 62) {

            photo1.setImageResource(photoId[scoreTeamA]);
        } else {
            winLoser();
        }

    }

    public void displayForTeamB(int scoreB) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
        photo2 = (ImageView) findViewById(R.id.imageView2);
        if (scoreTeamB < 62) {

            photo2.setImageResource(photoId[scoreTeamB]);
        } else {
            winLoser();
        }

    }
}