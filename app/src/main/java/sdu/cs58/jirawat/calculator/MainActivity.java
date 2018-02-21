package sdu.cs58.jirawat.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1EditText,num2EditText;
    Button addButton,minusButton,timesButton,devideButton;
    TextView resultTextView;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.edtNumber1);
        num2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.bntAdd);
        minusButton = findViewById(R.id.bntMinus);
        timesButton = findViewById(R.id.bntTimes);
        devideButton = findViewById(R.id.bntDivide);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปลชนิด int
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 + num2;

                //4. แสดงผลลัพธ์การคำนวณ
                resultTextView.setText(result + "");

            }
        }); //end OnClickListener

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 - num2;

                //4. แสดงผลลัพธ์การคำนวณ
                resultTextView.setText(result + "");
            }
        });

        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 * num2;

                //4. แสดงผลลัพธ์การคำนวณ
                resultTextView.setText(result + "");
            }
        });

        devideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 / num2;

                //4. แสดงผลลัพธ์การคำนวณ
                resultTextView.setText(result + "");
            }
        });

    } //end onCreate
} //end class
