package com.example.asombrado_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYear = 2003;
        int birthMonth = 3;
        int birthDay = 18;

        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 26;

        int ageInYears, ageInMonth, ageInDays;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentDay -= 1;
        }

        if(birthDay > currentDay){
            currentDay += 30;
            currentMonth -= 1;
        }


        ageInYears = currentYear - birthYear;
        ageInMonth = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My precise age is \n"+
                String.valueOf(ageInYears)+
                " Years, \n"+
                String.valueOf(ageInMonth)+
                " Months, \n"+
                String.valueOf(ageInDays)+
                " Days.");


    }
}