package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class Game extends AppCompatActivity {

    Button PaperButton;
    Button RockButton;
    Button ScissorsButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        PaperButton = (Button)findViewById(R.id.button_paper);
        RockButton = (Button)findViewById(R.id.button_rock);
        ScissorsButton = (Button)findViewById(R.id.button_scissors);
        answerText = (TextView)findViewById(R.id.answer_text);

        PaperButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                RockPaperScissors game = new RockPaperScissors();
                WeaponType computerChoice = game.computerChoice();
                String result = game.compareWeapons(WeaponType.PAPER, computerChoice);
                Log.d("Game", "I did it mom!");
                answerText.setText(result);

            }
        });

        RockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                RockPaperScissors game = new RockPaperScissors();
                WeaponType computerChoice = game.computerChoice();
                String result = game.compareWeapons(WeaponType.ROCK, computerChoice);
                answerText.setText(result);

            }
        });

        ScissorsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                RockPaperScissors game = new RockPaperScissors();
                WeaponType computerChoice = game.computerChoice();
                String result = game.compareWeapons(WeaponType.SCISSORS, computerChoice);
                answerText.setText(result);

            }
        });



        }



    }


