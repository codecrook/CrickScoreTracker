package io.codecrook.crickscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, scoreTeamB = 0;
    int numberOfBallsTeamA = 0, numberOfBallsTeamB = 0;
    int wicketsTeamA = 0, wicketsTeamB = 0;
    double numberOfOversTeamA = 0.0, numberOfOversTeamB = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds one run to Team-A score
     * @param view
     */
    public void addOneForTeamA(View view) {
        if (numberOfBallsTeamA < 120 && wicketsTeamA < 10) {

            scoreTeamA = scoreTeamA + 1;

        } else {
            numberOfOversTeamA = 0;
            numberOfBallsTeamA = 0;
            numberOfOversTeamA = 0;
            wicketsTeamA = 0;
        }
        displayForTeamA(scoreTeamA, wicketsTeamA, numberOfOversTeamA);
    }

    /**
     * Adds four runs to Team-A Score
     * @param view
     */
    public void addFourForTeamA(View view) {

        if (numberOfBallsTeamA < 120 && wicketsTeamA < 10) {

            scoreTeamA = scoreTeamA + 4;
        } else {
            numberOfOversTeamA = 0;
            numberOfBallsTeamA = 0;
            numberOfOversTeamA = 0;
            wicketsTeamA = 0;
        }
        displayForTeamA(scoreTeamA, wicketsTeamA, numberOfOversTeamA);
    }

    /**
     * Adds six runs to TEAM-A Score
     * @param view
     */
    public void addSixForTeamA(View view) {

        if (numberOfBallsTeamA < 120 && wicketsTeamA < 10) {

            scoreTeamA = scoreTeamA + 6;

        } else {
            numberOfOversTeamA = 0;
            numberOfBallsTeamA = 0;
            numberOfOversTeamA = 0;
            wicketsTeamA = 0;
        }
        displayForTeamA(scoreTeamA, wicketsTeamA, numberOfOversTeamA);
    }

    /**
     * Adds one ball to the Team-A played numberOfBalls
     * Calculates over from numberOfBalls
     * @param view
     */
    public void addOneBallForTeamA(View view) {

        if (numberOfBallsTeamA < 120 && wicketsTeamA < 10) {

            numberOfBallsTeamA = numberOfBallsTeamA + 1;
            numberOfOversTeamA = ((numberOfBallsTeamA / 6) + (double)(numberOfBallsTeamA % 6) / 10);

        } else {
            numberOfOversTeamA = 0;
            numberOfBallsTeamA = 0;
            numberOfOversTeamA = 0;
            wicketsTeamA = 0;
        }
        displayForTeamA(scoreTeamA, wicketsTeamA, numberOfOversTeamA);
    }

    /**
     * Adds one wicket to Team-A wickets
     * @param view
     */
    public void addOneWicketForTeamA(View view) {

        if (numberOfBallsTeamA < 120 && wicketsTeamA < 10) {

            wicketsTeamA = wicketsTeamA + 1;

        } else {
            numberOfOversTeamA = 0;
            numberOfBallsTeamA = 0;
            numberOfOversTeamA = 0;
            wicketsTeamA = 0;
        }
        displayForTeamA(scoreTeamA, wicketsTeamA, numberOfOversTeamA);
    }

    /**
     * Adds one run to Team-B runs
     * @param view
     */
    public void addOneForTeamB(View view) {

        if (numberOfBallsTeamB < 120 && wicketsTeamB < 10) {

            scoreTeamB = scoreTeamB + 1;

        } else {
            numberOfOversTeamB = 0;
            numberOfBallsTeamB = 0;
            numberOfOversTeamB = 0;
            wicketsTeamB = 0;
        }
        displayForTeamB(scoreTeamB, wicketsTeamB, numberOfOversTeamB);
    }

    /**
     * Adds four runs to Team-B runs
     * @param view
     */
    public void addFourForTeamB(View view) {

        if (numberOfBallsTeamB < 120 && wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 4;
        } else {
            numberOfOversTeamB = 0;
            numberOfBallsTeamB = 0;
            numberOfOversTeamB = 0;
            wicketsTeamB = 0;
        }
        displayForTeamB(scoreTeamB, wicketsTeamB, numberOfOversTeamB);
    }

    /**
     * Adds six runs to Team-B runs
     * @param view
     */
    public void addSixForTeamB(View view) {

        if (numberOfBallsTeamB < 120 && wicketsTeamB < 10) {

            scoreTeamB = scoreTeamB + 6;

        } else {
            numberOfOversTeamB = 0;
            numberOfBallsTeamB = 0;
            numberOfOversTeamB = 0;
            wicketsTeamB = 0;
        }
        displayForTeamB(scoreTeamB, wicketsTeamB, numberOfOversTeamB);
    }

    /**
     * Adds one ball to Team-B numberOfBalls
     * Calculates numberOfOvers from numberOfBalls
     * @param view
     */
    public void addOneBallForTeamB(View view) {
        if (numberOfBallsTeamB < 120 && wicketsTeamB < 10) {

            numberOfBallsTeamB = numberOfBallsTeamB + 1;
            numberOfOversTeamB =  ((numberOfBallsTeamB / 6) + (double)(numberOfBallsTeamB % 6) / 10);

        } else {
            numberOfOversTeamB = 0;
            numberOfBallsTeamB = 0;
            numberOfOversTeamB = 0;
            wicketsTeamB = 0;
        }
        displayForTeamB(scoreTeamB, wicketsTeamB, numberOfOversTeamB);
    }

    /**
     * Adds one wicket to Team-B wickets
     * @param view
     */
    public void addOneWicketForTeamB(View view) {

        if (numberOfBallsTeamB < 120 && wicketsTeamB < 10) {

            wicketsTeamB = wicketsTeamB + 1;

        } else {
            numberOfOversTeamB = 0;
            numberOfBallsTeamB = 0;
            numberOfOversTeamB = 0;
            wicketsTeamB = 0;
        }
        displayForTeamB(scoreTeamB, wicketsTeamB, numberOfOversTeamB);
    }

    /**
     * Displays the given score, wickets and overs for Team A.
     */

    public void displayForTeamA(int score, int wickets, double overs) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        TextView wicketView = (TextView) findViewById(R.id.team_a_wicket);
        TextView overView = (TextView) findViewById(R.id.team_a_over);

        scoreView.setText(String.valueOf(score));
        wicketView.setText(String.valueOf(wickets));
        overView.setText(String.valueOf(overs));
    }

    /**
     * Displays the given score, wickets and overs for Team B.
     */

    public void displayForTeamB(int score, int wickets, double overs) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        TextView wicketView = (TextView) findViewById(R.id.team_b_wicket);
        TextView overView = (TextView) findViewById(R.id.team_b_over);

        scoreView.setText(String.valueOf(score));
        wicketView.setText(String.valueOf(wickets));
        overView.setText(String.valueOf(overs));
    }
}
