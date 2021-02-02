package com.justinclicks.numbertowordsexample;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.justinclicks.numbertowords.NumberToWordConverterLakhFormat;
import com.justinclicks.numbertowords.NumberToWordConverterMillionFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inwords = findViewById(R.id.inwords);

        int number = 560000;
        StringBuffer in_words;

        NumberToWordConverterLakhFormat instance = new NumberToWordConverterLakhFormat();
        NumberToWordConverterMillionFormat millionFormat=new NumberToWordConverterMillionFormat();


        //instance.convert(number);
       // millionFormat.convert(number);
        Toast.makeText(this, "Converted " + number + " to word is " + NumberToWordConverterLakhFormat.convert(number), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Converted " + number + " to word is " + NumberToWordConverterMillionFormat.convert(number), Toast.LENGTH_LONG).show();

    }
}