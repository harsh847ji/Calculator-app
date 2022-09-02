package com.example.clculatorofcreator;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.HapticFeedbackConstants;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    String calculate;
    TextView clear;
    TextView cut;
    TextView percent;
    TextView add;
    TextView minus;
    TextView multiply;
    TextView divide;
    TextView decimal;
    TextView equals;
    TextView pi;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;
    TextView zero;
    TextView values;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        clear = findViewById(R.id.clear);
        cut = findViewById(R.id.cut);
        percent = findViewById(R.id.percent);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        minus = findViewById(R.id.minus);
        add = findViewById(R.id.add);
        equals = findViewById(R.id.equals);
        pi = findViewById(R.id.pi);
        decimal = findViewById(R.id.decimal);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ans = findViewById(R.id.ans);
        values = findViewById(R.id.values);



        clear.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O_MR1)
            @Override
            public void onClick(View v) {
                    equals.performHapticFeedback(
                            HapticFeedbackConstants.CONTEXT_CLICK
                    );
                ans.setText("0");
                values.setText("");
            }

        });
        cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                calculate = values.getText().toString();
                try {
                    calculate = calculate.substring(0,calculate.length()-1);
                    values.setText(calculate);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = "%";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = "/";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = "+";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = "X";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = minus.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = "兀";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = ".";
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = zero.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = one.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = two.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = three.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = four.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = five.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = six.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = seven.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String btnText = eight.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                        HapticFeedbackConstants.VIRTUAL_KEY,
                        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );

                String btnText = nine.getText().toString();
                calculate = values.getText().toString();
                calculate = calculate+btnText;
                values.setText(calculate);

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.performHapticFeedback(
                  HapticFeedbackConstants.VIRTUAL_KEY,
                  HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
                );
                String finalResult = "";
                calculate = values.getText().toString();
                calculate = calculate.replaceAll("X","*");
                calculate = calculate.replaceAll("%","/100*");
                calculate = calculate.replaceAll("兀","22/7");
                calculate = calculate.replaceAll("‒","-");
                calculate = calculate.replaceAll("＝","=");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                if (calculate!="" )
                {
                    try {
                        Scriptable scriptable = rhino.initSafeStandardObjects();
                        finalResult = rhino.evaluateString(scriptable,calculate,"Javascript",1,null).toString();
                    }
                    catch (Exception e) {
                        finalResult ="error";
                    }
                }
                if (calculate== ""){
                    ans.setText("0");
                }

                if (finalResult.endsWith(".0")){
                    finalResult = finalResult.replace(".0","");
                }
                ans.setText("="+finalResult);
                values.setText(finalResult);



            }
        });

    }

}