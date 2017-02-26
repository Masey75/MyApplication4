package ru.maseymail.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout LinearLayout2 = (LinearLayout) findViewById(R.id.LinearLayout2);
        LinearLayout2.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams par = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams parview = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        parview.setMargins((int) getResources().getDimension(R.dimen.margin), (int) getResources().getDimension(R.dimen.margin), (int) getResources().getDimension(R.dimen.margin), 0);
        LinearLayout2.setBackgroundResource(R.color.colorGreen);
        LinearLayout2.setWeightSum(1);
        LinearLayout2.setLayoutParams(par);

        TextView textView5 = new TextView(this);
        textView5.setBackgroundResource(R.color.colorWhite);
        textView5.setLayoutParams(parview);
        textView5.setText("Some text");
        textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(android.R.drawable.sym_def_app_icon, 0, 0, 0);
        textView5.setGravity(1);
        LinearLayout2.addView(textView5);

        TextView textView6 = new TextView(this);
        textView6.setBackgroundResource(R.color.colorWhite);
        textView6.setLayoutParams(parview);
        textView6.setText("Some text");
        textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(android.R.drawable.sym_def_app_icon, 0, 0, 0);
        textView6.setGravity(1);
        LinearLayout2.addView(textView6);

        TextView textView7 = new TextView(this);
        textView7.setBackgroundResource(R.color.colorWhite);
        textView7.setLayoutParams(parview);
        textView7.setText("Some text");
        textView7.setCompoundDrawablesRelativeWithIntrinsicBounds(android.R.drawable.sym_def_app_icon, 0, 0, 0);
        textView7.setGravity(1);
        LinearLayout2.addView(textView7);

        TextView textView8 = new TextView(this);
        textView8.setBackgroundResource(R.color.colorWhite);
        textView8.setLayoutParams(parview);
        textView8.setText("Some text");
        textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(android.R.drawable.sym_def_app_icon, 0, 0, 0);
        LinearLayout2.addView(textView8);
    }
}


