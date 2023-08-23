package com.example.cosa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class see extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_inicio);

    }

    public void onClickdevuelta(View view){
        Intent intent = new Intent(this,see.class);
        startActivity(intent);

    }

}
