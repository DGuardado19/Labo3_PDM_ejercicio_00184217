package com.dguardado19.labo3web;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.dguardado19.labo3web.utils.AppConstant;

public class MainActivity extends AppCompatActivity {
    private static final String TAG  = MainActivity.class.getSimpleName();
    private Button mboton, mllamar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mboton= findViewById(R.id.Boton);
        mboton.setOnClickListener(v->{
            Intent mIntent=new Intent(MainActivity.this,Main2Activity.class);
            mIntent.putExtra(AppConstant.TEXT_KEY, "Hola, NuevaActividad");
            startActivity(mIntent);
        });
        mllamar= findViewById(R.id.Botonllamar);
        mllamar.setOnClickListener(v->{
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT,"");
            startActivity(mIntent);
        });
    }


}
