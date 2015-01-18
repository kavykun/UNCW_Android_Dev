package com.example.kavy.quizactivity2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button; //import Button widget to use for buttons
import android.widget.Toast;


public class QuizActivity extends Activity {

    private Button mTrueButton; //declaring instance of a button
    private Button mFalseButton; //declaring instance of a button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_bottom); //create new instance of true button. Give it a string Id
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.correct_toast, Toast.LENGTH_SHORT).show(); //choose the instance of the activity to create the toast
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_bottom); //create new instance of false button. Give it a string Id.
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.incorrect_toast, Toast.LENGTH_SHORT).show(); //choose the instance of the activity to create the toast
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }
}
