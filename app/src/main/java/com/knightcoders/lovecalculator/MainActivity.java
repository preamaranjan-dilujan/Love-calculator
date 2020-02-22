package com.knightcoders.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name1;
    EditText name2;
    TextView textView;
    Button cal;
    CountingCharacters countingCharacters = new CountingCharacters();
    Shorting shorting = new Shorting();
    FinalCal finalCal = new FinalCal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.txt_name1);
        name2 = findViewById(R.id.txt_name2);
        textView = findViewById(R.id.textView);
        cal = findViewById(R.id.btn_cal);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = name1.getText().toString().toLowerCase();
                String str2 = name2.getText().toString().toLowerCase();



                //String countChars = countingCharacters.countChars(str1,str2);
                //String shorted = shorting.shortenNumber(countChars);
                textView.setText(finalCal.calculate(str1,str2));

            }
        });

    }

}
