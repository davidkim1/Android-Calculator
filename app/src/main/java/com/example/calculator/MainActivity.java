package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
// import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, squareRootButton, rootOfButton,
            logButton, lnButton, squareOfButton, exponentialButton, historyButton;
    EditText calcEditText;
    TextView historyResult;

    double mValueOne, mValueTwo, result;

    boolean addition, mSubtract, multiplication, division, squareRoot, rootOf,log, ln, squareOf, exponential;

    ArrayList<String> resultList = new ArrayList<String>();

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putStringArrayList("Lists of results", resultList);
        outState.putDouble("Last result", result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calcEditText = (EditText) findViewById(R.id.edt1);
        //from
        squareRootButton = (Button) findViewById(R.id.squareRoot);
        rootOfButton = (Button) findViewById(R.id.rootOf);
        logButton = (Button) findViewById(R.id.log);
        lnButton = (Button) findViewById(R.id.naturalLog);
        squareOfButton = (Button) findViewById(R.id.squareOf);
        exponentialButton = (Button) findViewById(R.id.exponential);
        //to
        historyResult = (TextView) findViewById(R.id.historyText);
        historyButton = (Button) findViewById(R.id.historyButton);

        //initTextHistory();


        String nHistory = getIntent().getStringExtra("message");
        if (nHistory!= null){
            calcEditText.setText(nHistory + "");
        }
        else{
            calcEditText.setText(0 + "");
        }


        historyButton.setOnClickListener(view ->
        {
            Intent  intent = new Intent(this, HistoryActivity.class);;
            intent.putExtra("New Last", resultList);
            startActivity(intent);
        });

        if (findViewById(R.id.calculatorLand) != null) {

            squareRootButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    result = (float) Math.sqrt(mValueOne);
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                }
            });

            rootOfButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    rootOf = true;
                    calcEditText.setText(null);
                }
            });

            logButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    result = Math.log10(mValueOne);
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                }
            });

            lnButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    result = Math.log(mValueOne);
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                }
            });

            squareOfButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    result = mValueOne * mValueOne;
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    //squareOf = false;
                }
            });

            exponentialButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    exponential = true;
                    calcEditText.setText(null);
                }
            });
        }

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText(calcEditText.getText() + "9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (calcEditText == null) {
                    calcEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(calcEditText.getText() + "");
                    addition = true;
                    calcEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                mSubtract = true;
                calcEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                multiplication = true;
                calcEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                division = true;
                calcEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(calcEditText.getText() + "");

                if (addition == true) {
                    result = mValueOne + mValueTwo;
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    addition = false;
                }

                if (mSubtract == true) {
                    result = mValueOne - mValueTwo;
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    mSubtract = false;
                }

                if (multiplication == true) {
                    result = mValueOne * mValueTwo;
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    multiplication = false;
                }

                if (division == true) {
                    result = mValueOne / mValueTwo;
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    division = false;
                }
                //from
                if (exponential == true) {
                    result = (float)Math.pow(mValueOne, mValueTwo);
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    mSubtract = false;
                }

                if (rootOf == true) {
                    result = (float)Math.pow(mValueOne, 1/mValueTwo);
                    calcEditText.setText(result + "");
                    resultList.add(result + "");
                    mSubtract = false;
                }
                //to
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == false && mSubtract == false && multiplication == false && division == false ){
                    historyResult.setText(result + "");
                }
                calcEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + ".");
            }
        });

        if(savedInstanceState != null) {
            resultList = savedInstanceState.getStringArrayList("Lists of results");
            result = savedInstanceState.getDouble("Last result");
            historyResult.setText(result + "");
        }
    }
}
