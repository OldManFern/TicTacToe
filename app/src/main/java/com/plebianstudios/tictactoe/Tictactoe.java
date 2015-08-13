package com.plebianstudios.tictactoe;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class Tictactoe extends AppCompatActivity {


    Button btnTopLeft;
    Button btnTopCenter;
    Button btnTopRight;
    Button btnMidLeft;
    Button btnMidCenter;
    Button btnMidRight;
    Button btnBotLeft;
    Button btnBotCenter;
    Button btnBotRight;

    TextView txtOutMessages;

    boolean Xturn;

    int winConditionOne;//when when winCondistions are 0 it means they current mean nothing
    int winConditionTwo;//when set to 1 they are currently representing a X and when they are
    int winConditionThree;//a 2 they are representing a O during the check process.




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictactoe);

        btnTopLeft = (Button) findViewById(R.id.btnTopLeft);
        btnTopCenter = (Button) findViewById(R.id.btnTopCenter);
        btnTopRight = (Button) findViewById(R.id.btnTopRight);
        btnMidLeft = (Button) findViewById(R.id.btnMidLeft);
        btnMidCenter = (Button) findViewById(R.id.btnMidCenter);
        btnMidRight = (Button) findViewById(R.id.btnMidRight);
        btnBotLeft = (Button) findViewById(R.id.btnBotLeft);
        btnBotCenter = (Button) findViewById(R.id.btnBotCenter);
        btnBotRight = (Button) findViewById(R.id.btnBotRight);
        txtOutMessages = (TextView) findViewById(R.id.outputMessages);
        Xturn = false;

        winConditionOne = 0;
        winConditionTwo = 0;
        winConditionThree = 0;


        btnTopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnTopLeft.setText("O");
                    btnTopLeft.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnTopLeft.setText("X");
                    btnTopLeft.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }

                checkTopRow();
                checkLeftColumn();
                checkDiagonalLTtoRB();



            }
        });
        btnTopCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnTopCenter.setText("O");
                    btnTopCenter.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnTopCenter.setText("X");
                    btnTopCenter.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }

                checkTopRow();
                checkCenterColumn();



            }
        });
        btnTopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnTopRight.setText("O");
                    btnTopRight.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnTopRight.setText("X");
                    btnTopRight.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }

                checkTopRow();
                checkRightColumn();
                checkDiagnoalLBtoRT();


            }
        });
        btnMidLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnMidLeft.setText("O");
                    btnMidLeft.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnMidLeft.setText("X");
                    btnMidLeft.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }

                checkMidRow();
                checkLeftColumn();


            }
        });
        btnMidCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnMidCenter.setText("O");
                    btnMidCenter.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnMidCenter.setText("X");
                    btnMidCenter.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }

                checkMidRow();
                checkCenterColumn();
                checkDiagnoalLBtoRT();
                checkDiagonalLTtoRB();



            }
        });
        btnMidRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnMidRight.setText("O");
                    btnMidRight.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnMidRight.setText("X");
                    btnMidRight.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }
                checkMidRow();
                checkRightColumn();

            }
        });
        btnBotLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnBotLeft.setText("O");
                    btnBotLeft.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnBotLeft.setText("X");
                    btnBotLeft.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }
                checkBotRow();
                checkLeftColumn();
                checkDiagnoalLBtoRT();


            }
        });
        btnBotCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnBotCenter.setText("O");
                    btnBotCenter.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnBotCenter.setText("X");
                    btnBotCenter.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }
                checkBotRow();
                checkCenterColumn();


            }
        });
        btnBotRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Xturn){
                    btnBotRight.setText("O");
                    btnBotRight.setBackgroundColor(Color.rgb(0, 191, 255));
                    Xturn=true;
                }
                else{
                    btnBotRight.setText("X");
                    btnBotRight.setBackgroundColor(Color.rgb(250, 0, 0));
                    Xturn=false;
                }
                checkBotRow();
                checkRightColumn();
                checkDiagonalLTtoRB();



            }
        });
    }

    public void checkTopRow() {
        if (btnTopLeft.getText() == "X") {
            winConditionOne = 1;
        }
        else if (btnTopLeft.getText() == "O"){
            winConditionOne=2;

        }
        if (btnTopCenter.getText() == "X") {
            winConditionTwo = 1;
        }
        else if(btnTopCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnTopRight.getText() == "X") {
            winConditionThree = 1;
        }
        else if (btnTopRight.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkMidRow() {
        if (btnMidLeft.getText() == "X") {
            winConditionOne = 1;
        }
        else if (btnMidLeft.getText() == "O"){
            winConditionOne=2;
        }
        if (btnMidCenter.getText() == "X") {
            winConditionTwo = 1;
        }
        else if(btnMidCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnMidRight.getText() == "X") {
            winConditionThree = 1;
        }
        else if (btnMidRight.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkBotRow() {
        if (btnBotLeft.getText() == "X") {
            winConditionOne = 1;
        }
        else if (btnBotLeft.getText() == "O"){
            winConditionOne=2;
        }
        if (btnBotCenter.getText() == "X") {
            winConditionTwo = 1;
        }
        else if(btnBotCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnBotRight.getText() == "X") {
            winConditionThree = 1;
        }
        else if(btnBotRight.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkLeftColumn() {
        if (btnTopLeft.getText() == "X") {
            winConditionOne = 1;
        }
        else if (btnTopLeft.getText()=="O"){
            winConditionOne=2;

        }
        if (btnMidLeft.getText() == "X") {
            winConditionTwo = 1;
        }
        else if(btnMidLeft.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnBotLeft.getText() == "X" ) {
            winConditionThree = 1;
        }
        else if (btnBotLeft.getText() == "O") {
            winConditionThree = 2;
        }
        isThereAWinner();
    }

    public void checkCenterColumn() {
        if (btnTopCenter.getText() == "X" ) {
            winConditionOne = 1;
        }
        else if(btnTopCenter.getText() == "O"){
            winConditionOne=2;
        }
        if (btnMidCenter.getText() == "X") {
            winConditionTwo = 1;
        }
        else if (btnMidCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnBotCenter.getText() == "X") {
            winConditionThree = 1;
        }
        else if (btnBotCenter.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkRightColumn() {
        if (btnTopRight.getText() == "X") {
            winConditionOne = 1;
        } else if (btnTopRight.getText() == "O") {
            winConditionOne = 2;
        }
        if (btnMidRight.getText() == "X") {
            winConditionTwo = 1;
        }
        else if (btnMidRight.getText() == "O"){
            winConditionTwo = 2;
        }
        if (btnBotRight.getText() == "X" ) {
            winConditionThree = 1;
        }
        else if(btnBotRight.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkDiagonalLTtoRB() {
        if (btnTopLeft.getText() == "X") {
            winConditionOne = 1;
        }
        else if (btnTopLeft.getText() == "O"){
            winConditionOne=2;
        }
        if (btnMidCenter.getText() == "X" ) {
            winConditionTwo = 1;
        }
        else if(btnMidCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnBotRight.getText() == "X" ) {
            winConditionThree = 1;
        }
        else if (btnBotRight.getText() == "O"){
            winConditionThree=2;
        }
        isThereAWinner();
    }

    public void checkDiagnoalLBtoRT() {
        if (btnBotLeft.getText() == "X" ) {
            winConditionOne = 1;
        }
        else if (btnBotLeft.getText() == "O") {
            winConditionOne=2;
        }
        if (btnMidCenter.getText() == "X") {
            winConditionTwo = 1;
        }
        else if (btnMidCenter.getText() == "O"){
            winConditionTwo=2;
        }
        if (btnTopRight.getText() == "X") {
            winConditionThree = 1;
        }
        else if (btnTopRight.getText() == "O"){
            winConditionThree=2;
        }

        isThereAWinner();

    }

    public void isThereAWinner(){
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (!Xturn) {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = 0;
            winConditionTwo = 0;
            winConditionThree = 0;
        }
    }


}