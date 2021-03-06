package com.example.android.alifnoorachmadmuttaqin_1202154126_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        Spinner spinner = findViewById(R.id.spinner_table);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView){
    }
    public void onClickOrder(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
