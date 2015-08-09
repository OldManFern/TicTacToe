package com.plebianstudios.tictactoe;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    Button btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        btnStart =(Button)findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTicTacToe();
            }
        });


    }

    public void startTicTacToe(){
        Intent intent = new Intent(this,TicTacToe.class);
        startActivity(intent);

    }


}
