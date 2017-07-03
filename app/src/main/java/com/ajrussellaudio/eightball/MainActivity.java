package com.ajrussellaudio.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText) findViewById(R.id.question);
        shakeButton = (Button) findViewById(R.id.shake_button);
        answerText = (TextView) findViewById(R.id.answerText);
    }

    public void onShakeButtonClicked(View button) {
        String question = questionEditText.getText().toString();
        Log.d("EightBall", question);
    }
}
