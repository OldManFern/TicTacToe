package com.plebianstudios.tictactoe;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    Button btnTopLeft = (Button) findViewById(R.id.btnTopLeft);
    Button btnTopCenter = (Button) findViewById(R.id.btnTopCenter);
    Button btnTopRight = (Button) findViewById(R.id.btnTopRight);
    Button btnMidLeft = (Button) findViewById(R.id.btnMidLeft);
    Button btnMidCenter = (Button) findViewById(R.id.btnMidCenter);
    Button btnMidRight = (Button) findViewById(R.id.btnMidRight);
    Button btnBotLeft = (Button) findViewById(R.id.btnBotLeft);
    Button btnBotCenter = (Button) findViewById(R.id.btnBotCenter);
    Button btnBotRight = (Button) findViewById(R.id.btnBotRight);

    TextView txtOutMessages = (TextView) findViewById(R.id.outputMessages);

    boolean Xturn = false;
    boolean winner = false;
    boolean winConditionOne = false;
    boolean winConditionTwo = false;
    boolean winConditionThree = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);


        btnTopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTopLeft.setText("O");
                checkTopRow();
                checkLeftColumn();
                checkDiagonalLTtoRB();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));


            }
        });
        btnTopCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTopCenter.setText("O");
                checkTopRow();
                checkCenterColumn();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));


            }
        });
        btnTopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTopRight.setText("O");
                checkTopRow();
                checkRightColumn();
                checkDiagnoalLBtoRT();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));

            }
        });
        btnMidLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMidLeft.setText("O");
                checkMidRow();
                checkLeftColumn();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));

            }
        });
        btnMidCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMidCenter.setText("O");
                checkMidRow();
                checkCenterColumn();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));


            }
        });
        btnMidRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMidRight.setText("O");
                checkMidRow();
                checkRightColumn();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));

            }
        });
        btnBotLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBotLeft.setText("O");
                checkBotRow();
                checkLeftColumn();
                checkDiagnoalLBtoRT();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));

            }
        });
        btnBotCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBotCenter.setText("O");
                checkBotRow();
                checkCenterColumn();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));

            }
        });
        btnBotRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBotRight.setText("O");
                checkBotRow();
                checkRightColumn();
                checkDiagonalLTtoRB();
                btnTopLeft.setBackgroundColor(Color.rgb(0, 0, 250));


            }
        });
    }

    public void checkTopRow() {
        if (btnTopLeft.getText() == "X" || btnTopLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnTopCenter.getText() == "X" || btnTopCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnTopRight.getText() == "X" || btnTopRight.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnTopRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkMidRow() {
        if (btnMidLeft.getText() == "X" || btnMidLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidCenter.getText() == "X" || btnMidCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnMidRight.getText() == "X" || btnMidRight.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnMidRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkBotRow() {
        if (btnBotLeft.getText() == "X" || btnBotLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnBotCenter.getText() == "X" || btnBotCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnBotRight.getText() == "X" || btnBotRight.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnBotRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkLeftColumn() {
        if (btnTopLeft.getText() == "X" || btnTopLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidLeft.getText() == "X" || btnMidLeft.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnBotLeft.getText() == "X" || btnBotLeft.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnBotCenter.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkCenterColumn() {
        if (btnTopCenter.getText() == "X" || btnTopCenter.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidCenter.getText() == "X" || btnMidCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnBotCenter.getText() == "X" || btnBotCenter.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnBotCenter.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkRightColumn() {
        if (btnTopRight.getText() == "X" || btnTopRight.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidRight.getText() == "X" || btnMidRight.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnBotRight.getText() == "X" || btnBotRight.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnTopRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkDiagonalLTtoRB() {
        if (btnTopLeft.getText() == "X" || btnTopLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidCenter.getText() == "X" || btnMidCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnBotRight.getText() == "X" || btnBotRight.getText() == "O") {
            winConditionThree = true;
        }
        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnBotRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }
    }

    public void checkDiagnoalLBtoRT() {
        if (btnBotLeft.getText() == "X" || btnBotLeft.getText() == "O") {
            winConditionOne = true;
        }
        if (btnMidCenter.getText() == "X" || btnMidCenter.getText() == "O") {
            winConditionTwo = true;
        }
        if (btnTopRight.getText() == "X" || btnTopRight.getText() == "O") {
            winConditionThree = true;
        }

        if (winConditionOne == winConditionTwo && winConditionTwo == winConditionThree) {
            if (btnTopRight.getText() == "X") {
                txtOutMessages.setText("Player X wins this one!");
            } else {
                txtOutMessages.setText("Player O wins this one!");
            }
        } else {
            winConditionOne = false;
            winConditionTwo = false;
            winConditionThree = false;
        }

    }


}
