package ok.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    char op;
    BigInteger a, b;
    BigInteger ten = new BigInteger("10");
    BigInteger zero = new BigInteger("0");
    TextView output;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = b = new BigInteger("0");
        output = (TextView) findViewById(R.id.outputResult);
    }

    /** Called when the user touches the button */
    public void button0Pressed(View view) {
        b = b.multiply(ten);
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button1Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("1")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button2Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("2")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button3Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("3")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button4Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("4")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button5Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("5")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button6Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("6")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button7Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("7")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button8Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("8")));
        output.setText(b.toString());
    }
    /** Called when the user touches the button */
    public void button9Pressed(View view) {
        b = b.multiply(ten).add(new BigInteger(("9")));
        output.setText(b.toString());
    }
    public void buttonPlusPressed(View view) {
        a = b;
        b = zero;
        op = '+';
        output.setText(b.toString());
    }
    public void buttonMinPressed(View view) {
        a = b;
        b = zero;
        op = '-';
        output.setText(b.toString());
    }
    public void buttonMultPressed(View view) {
        a = b;
        b = zero;
        op = '*';
        output.setText(b.toString());
    }
    public void buttonDivPressed(View view) {
        a = b;
        b = zero;
        op = '/';
        output.setText(b.toString());
    }

    public void buttonEqPressed(View view) {
        try {
            BigInteger bigResult;
            if (op == '+') {
                bigResult = a.add(b);
            } else if (op == '-') {
                bigResult = a.subtract(b);
            } else if (op == '*') {
                bigResult = a.multiply(b);
            } else {
                bigResult = a.divide(b);
            }
            b = bigResult;
            output.setText(b.toString());
        } catch (ArithmeticException ex) {
            b = zero;
            output.setText("ERROR: " + ex);
        }
    }

}