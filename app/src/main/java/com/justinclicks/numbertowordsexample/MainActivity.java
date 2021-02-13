package com.justinclicks.numbertowordsexample;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.justinclicks.numbertowords.NumberToWordConverterLakhFormat;
import com.justinclicks.numbertowords.NumberToWordConverterMillionFormat;


public class MainActivity extends AppCompatActivity {

    EditText mInput;
    TextView mLakhAnswer,mMillionAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachViews();

        CallingonTextChange();






    }

    public void updateFields()
    {
        try {

            int number = Integer.parseInt(mInput.getText().toString());

            //Making Class Instances

            NumberToWordConverterLakhFormat lakhFormat = new NumberToWordConverterLakhFormat();
            NumberToWordConverterMillionFormat millionFormat = new NumberToWordConverterMillionFormat();

            //Adding answer in TextViews

            mLakhAnswer.setText(lakhFormat.convert(number));
            mMillionAnswer.setText(millionFormat.convert(number));

            //instance.convert(number); returns string for number in word


        } catch (NumberFormatException e) {
            mLakhAnswer.setText("");
            mMillionAnswer.setText("");
        }

    }

    public void CallingonTextChange()
    {
        mInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                updateFields();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateFields();
            }

            @Override
            public void afterTextChanged(Editable s) {
                updateFields();
            }
        });
    }
    public void attachViews()
    {
        mInput=findViewById(R.id.input);
        mLakhAnswer=findViewById(R.id.lakhanswer);
        mMillionAnswer=findViewById(R.id.millionanswer);
    }
}