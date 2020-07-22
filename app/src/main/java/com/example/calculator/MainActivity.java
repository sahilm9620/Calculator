package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0,result;
    TextView edt1;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal,fact;
    Button button0,button00, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder,factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button00=findViewById(R.id.button00);
        button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        buttonDot =  findViewById(R.id.buttondot);
        buttonAdd =  findViewById(R.id.buttonadd);
        buttonSub =  findViewById(R.id.buttonsub);
        buttonMul =  findViewById(R.id.buttonmul);
        buttonDivision =  findViewById(R.id.buttondiv);
        Remainder =  findViewById(R.id.Remainder);
        buttonDel =  findViewById(R.id.buttoncancel);
        buttonEqual =  findViewById(R.id.buttoneql);
        factorial=findViewById(R.id.facto);


        edt1 =  findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "00");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Float.parseFloat(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                } else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Float.parseFloat(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Float.parseFloat(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Float.parseFloat(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Float.parseFloat(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    mRemainder = true;
                    decimal = false;
                    edt1.setText(null);
                }else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try {
                        input1 = Integer.parseInt(edt1.getText() + "");
                    }catch (Exception e)
                    {
                        input1=result;
                    }
                    fact = true;
                    decimal = false;
                    edt1.setText(null);
                }else
                {
                    edt1.setText("ERROR");


                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {

                    edt1.setText( input1 + " + " + input2 + " = " + (result=input1 + input2) + "");
                    Addition = false;
                }

                if (Subtract) {

                    edt1.setText(input1 + " - " + input2 + " = " + (result=input1 - input2) + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1 + " * " + input2 + " = " + (result=input1 * input2) + "");
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1 + " / " + input2 + " = " + (result=input1 / input2) + "");
                    Division = false;
                }
                if (mRemainder) {
                    edt1.setText(input1 + " % " + input2 + " = " + (result=input1 % input2) + "");
                    mRemainder = false;
                }
                if(fact)
                { int res = 1;
                    int fac= (int) input1;
                    while (input1!=0)
                    {

                        res= (int) (res*input1);

                        input1--;
                    }

                    edt1.setText( fac+ "! = " + (res));

                }
                fact = false;
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
                result=0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    edt1.setText("ERROR");
                    decimal=false;
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });
    }



}
