package com.example.office.aula01;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("created", "Main activity foi criada");

    }

    public void changeText(View view) {
        ((TextView) findViewById(R.id.txtUsuario)).setText("Usuário alterado blabla");

        ((Button) findViewById(R.id.trocar)).setVisibility(View.INVISIBLE);
    }

    public void mudaParaSol(View view) {

        Integer id = ((RadioGroup) findViewById(R.id.radioGroup)).getCheckedRadioButtonId();

        ((ImageView) findViewById(R.id.image)).setImageResource(R.drawable.sol);
    }

    public void mudaParaLua(View view) {
        ((ImageView) findViewById(R.id.image)).setImageResource(R.drawable.lua);
    }

}
