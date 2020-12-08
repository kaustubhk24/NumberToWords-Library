package com.justinclicks.numbertowordsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.justinclicks.numbertowords.NumberToWords;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inwords =findViewById(R.id.inwords);

        int number=2356;
        StringBuffer in_words;


        NumberToWords instance=new NumberToWords();

        if(number>0)
        {
            instance.startPrint(number);
            in_words = new StringBuffer();

            for (String s : instance.output) {
                in_words.append(s);
                in_words.append(" ");
            }
            inwords.setText(in_words);

        }



    }
}