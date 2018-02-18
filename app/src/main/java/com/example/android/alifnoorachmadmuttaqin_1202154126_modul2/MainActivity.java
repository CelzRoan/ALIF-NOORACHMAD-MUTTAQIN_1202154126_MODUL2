package com.example.android.alifnoorachmadmuttaqin_1202154126_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickOrder(View view){
        if (((RadioButton) findViewById(R.id.rdinein)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        } else if (((RadioButton) findViewById(R.id.rtakeaway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Pilih Salah Satu", Toast.LENGTH_SHORT).show();
        }
    }
}
