package com.rohit.com.androidtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButtonShowText;
    EditText mEdittext;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButtonShowText = findViewById(R.id.button);
        mEdittext = findViewById(R.id.editText);
        mTextView = findViewById(R.id.textView);

        mButtonShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEdittext.getText().toString();
                mTextView.setText(name);
            }
        });

    }

}
