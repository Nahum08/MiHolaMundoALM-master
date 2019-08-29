package com.hpblue.myfirstaplicactionadm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView txt=null;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i( "vitacora","paso por el metodo onCreate" );
        // instancear los controles
        txt = findViewById(R.id.txt1);
        btn = findViewById(R.id.btn1);

        txt.setText("texto de ejecucion");

        // onclick del boton
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("se presiono el boton");

                // mensaje para mostrar al final de la aplicacion
                // paramatros: contexto, mensaje. duracion, mostrar
                Toast.makeText(getApplicationContext(),"se pesiono el boton",Toast.LENGTH_SHORT).show();

                // abrir otra actividad. o instanciar otra actividad
                Intent intent = new Intent(getApplicationContext(),ActivitySecond.class);
                startActivity(intent);


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "vitacora","paso por el metodo onStart" );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( "vitacora","paso por el metodo onResume" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "vitacora","paso por el metodo onPause" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "vitacora","paso por el metodo onDestroy" );

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i( "vitacora","paso por el metodo onRestart" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "vitacora","paso por el metodo onStop" );

    }



}
