package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ioScreen;
    float operand1,operand2;
    char operation;
    TextView resultView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ioScreen = findViewById(R.id.IOScreen);
        resultView = findViewById(R.id.resultText);
        Button oneButton = findViewById(R.id.buttonOne);
        Button twoButton  = findViewById(R.id.buttonTwo);
        Button threeButton  = findViewById(R.id.buttonThree);
        Button fourButton  = findViewById(R.id.buttonFour);
        Button fiveButton  = findViewById(R.id.buttonFive);
        Button sixButton  = findViewById(R.id.buttonSix);
        Button sevenButton  = findViewById(R.id.buttonSeven);
        Button eightButton  = findViewById(R.id.buttonEight);
        Button nineButton  = findViewById(R.id.buttonNine);
        Button zeroButton  = findViewById(R.id.buttonZero);
        Button multiplicationButton  = findViewById(R.id.buttonMul);
        Button divisionButton  = findViewById(R.id.buttonDivide);
        Button subtractionButton  = findViewById(R.id.buttonSubtract);
        Button additionButton  = findViewById(R.id.buttonAddition);
        Button clearButton  = findViewById(R.id.buttonClear);
        Button equalsButton  = findViewById(R.id.buttonEquals);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(twoButton.getText()));
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(zeroButton.getText()));
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(oneButton.getText()));
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(threeButton.getText()));
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(fourButton.getText()));
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(fiveButton.getText()));
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(sixButton.getText()));
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(sevenButton.getText()));
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(eightButton.getText()));
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText(ioScreen.getText().append(nineButton.getText()));
            }
        });
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ioScreen.getText().toString().equals("")) {
                    operand1 = Float.parseFloat(ioScreen.getText().toString());
                    operation = '+';
                    ioScreen.setText("");
                    resultView.setText(operand1 + " " + operation + " ");
                }
            }
        });
        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ioScreen.getText().toString().equals("")) {
                    ioScreen.setText("-");
                } else {
                    operand1 = Float.parseFloat(ioScreen.getText().toString());
                    operation = '-';
                    ioScreen.setText("");
                    resultView.setText(operand1 + " " + operation + " ");
                }
            }
        });
        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ioScreen.getText().toString().equals("")) {
                    operand1 = Float.parseFloat(ioScreen.getText().toString());
                    operation = '*';
                    ioScreen.setText("");
                    resultView.setText(operand1 + " " + operation + " ");
                }
            }
        });
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ioScreen.getText().toString().equals("")) {
                    operand1 = Float.parseFloat(ioScreen.getText().toString());
                    operation = '/';
                    ioScreen.setText("");
                    resultView.setText(operand1 + " " + operation + " ");
                }
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioScreen.setText("");
                operand1=(float )-1;
                operand2=(float)-1;
                operation='!';
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ioScreen.getText().toString().equals("")) {
                    operand2 = Float.parseFloat(ioScreen.getText().toString());
                    switch (operation) {
                        case '+':
                            ioScreen.setText((operand1 + operand2) + "");
                            break;
                        case '-':
                            ioScreen.setText((operand1 - operand2) + "");
                            break;
                        case '*':
                            ioScreen.setText((operand1 * operand2) + "");
                            break;
                        case '/':
                            ioScreen.setText((operand1 / operand2) + "");
                            break;
                        default:
                            ioScreen.setText("InvalidOperation");
                    }
                    resultView.setText(operand1 + " " + operation + " " + operand2 + " = " + ioScreen.getText());
                    operation = '!';
                }
            }
        });



    }
}

