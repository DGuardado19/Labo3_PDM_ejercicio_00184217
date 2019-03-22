package com.dguardado19.labo3web;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dguardado19.labo3web.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {
    private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mtext =findViewById(R.id.TextVi);
        Intent mIntent = getIntent();

        if(mIntent!=null){
            mtext.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));
        }

    }
}
