package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log .v("bichito", "La aplicacion acaba de iniciar oncreate");
        btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(x);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "gracias por usar", Toast.LENGTH_SHORT).show();
        Log.v("Bichito", "La aplicacion inicio en onstrat");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Bichito", "La aplicacion inicio en onResume");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Bichito", "La aplicacion inicio en onPause");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Bichito", "La aplicacion inicio en onStop");

    }



}
