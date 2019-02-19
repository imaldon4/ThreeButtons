package com.example.threebuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.threebuttons.extra.MESSAGE";
    private TextView mTextViewPassageOne;
    private TextView mTextViewPassageTwo;
    private TextView mTextViewPassageThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewPassageOne = findViewById(R.id.passage_text_one);
        mTextViewPassageTwo = findViewById(R.id.passage_text_two);
        mTextViewPassageThree = findViewById(R.id.passage_text_three);
    }

    public void FirstPassage(View view) {
        Intent intent = new Intent(this, PassageActivity.class);
        String message = mTextViewPassageOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void SecondPassage(View view) {
        Intent intent = new Intent(this, PassageActivity.class);
        String message = mTextViewPassageTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void ThirdPassage(View view) {
        Intent intent = new Intent(this, PassageActivity.class);
        String message = mTextViewPassageThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
