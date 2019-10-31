package com.example.CiclosVida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainCicloVida";
    protected Integer score = 0;
    protected TextView txt;
    protected Button bt, btRestart;
    protected EditText etNombre;

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "METODO ONCREATE");

        txt = findViewById(R.id.texto);
        bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumauno(v);
            }
        });

    }

     */

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "METODO ONCREATE");

        txt = findViewById(R.id.texto);
        bt = findViewById(R.id.bt);
        btRestart = findViewById(R.id.btRestart);
        etNombre = findViewById(R.id.etNombre);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumauno(v);
            }
        });

        btRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reinicar(v);
            }
        });

        if (estado != null){
            score = estado.getInt("numero");
            txt.setText(String.valueOf(score));

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle guardaEstado){
        super.onSaveInstanceState(guardaEstado);
        guardaEstado.putInt("numero", score);
    }
/*
    @Override
    protected void onRestoreInstanceState(Bundle saveInstancestate){
        super.onRestoreInstanceState(saveInstancestate);
        score = saveInstancestate.getInt("numero");
        txt.setText(String.valueOf(score));
    }

 */
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "METODO ONSTART");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "METODO ONRESUME");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "METODO ONPAUSE");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "METODO ONSTOP");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "METODO ONRESTART");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "METODO ONDESTROY");
    }

    public void sumauno(View view){
        score++;
        txt.setText(String.valueOf(score));
    }

    public void reinicar(View view){
        score = 0;
        txt.setText(String.valueOf(score));
    }
}
