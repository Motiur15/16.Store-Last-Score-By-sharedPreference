package com.example.loadscorebysharedpreferences;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView scoreTextView;
    Button increaseButton, decreaseButton;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        scoreTextView = (TextView) findViewById(R.id.textViewId);
        increaseButton = (Button) findViewById(R.id.increaseButtonId);
        decreaseButton = (Button) findViewById(R.id.decreaseButtonId);
        if(loadScore()!=0)
        {
            scoreTextView.setText("Score:"+loadScore());
        }

        increaseButton.setOnClickListener(this);
        decreaseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.increaseButtonId) {
            score = score + 10;
            scoreTextView.setText("Score:" + score);
            saveScore(score);
        }

        if (view.getId() == R.id.decreaseButtonId) {
            score = score-10;
            scoreTextView.setText("Score:" + score);
            saveScore(score);
        }
    }


    private void saveScore(int score) {

        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("lastScore",score);
        editor.commit();


    }

    private int loadScore(){
        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", MODE_PRIVATE);
        int loadLastScore=sharedPreferences.getInt("lastScore",0);
        return loadLastScore;// now going to oncreate and call loadScore()

    }


}
