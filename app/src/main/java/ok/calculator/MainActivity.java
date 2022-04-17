package ok.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    char op;
    String a, b;
    TextView output;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = b = "0";
        output = (TextView) findViewById(R.id.outputResult);
    }

    /** Called when the user touches the button */
    public void button0Pressed(View view) {
        b += "0";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button1Pressed(View view) {
        b += "1";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button2Pressed(View view) {
        b += "2";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button3Pressed(View view) {
        b += "3";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button4Pressed(View view) {
        b += "4";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button5Pressed(View view) {
        b += "5";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button6Pressed(View view) {
        b += "6";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button7Pressed(View view) {
        b += "7";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button8Pressed(View view) {
        b += "8";
        output.setText(b);
    }
    /** Called when the user touches the button */
    public void button9Pressed(View view) {
        b += "9";
        output.setText(b);
    }
    public void buttonPlusPressed(View view) {
        a = b;
        b = "0";
        op = '+';
        output.setText(b);
    }
    public void buttonMinPressed(View view) {
        a = b;
        b = "0";
        op = '-';
        output.setText(b);
    }
    public void buttonMultPressed(View view) {
        a = b;
        b = "0";
        op = '*';
        output.setText(b);
    }
    public void buttonDivPressed(View view) {
        a = b;
        b = "0";
        op = '/';
        output.setText(b);
    }

    public void buttonEqPressed(View view) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        try {
            BigInteger bigResult;
            if (op == '+') {
                bigResult = bigA.add(bigB);
            } else if (op == '-') {
                bigResult = bigA.subtract(bigB);
            } else if (op == '*') {
                bigResult = bigA.multiply(bigB);
            } else {
                bigResult = bigA.divide(bigB);
            }
            b = bigResult.toString();
            output.setText(b);
        } catch (ArithmeticException ex) {
            b = "0";
            output.setText("ERROR: " + ex);
        }
    }

}