package ok.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String display;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = "";
        output = (TextView) findViewById(R.id.outputResult);
    }

    /** Called when the user touches the button */
    public void button0Pressed(View view) {
        display += "0";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button1Pressed(View view) {
        display += "1";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button2Pressed(View view) {
        display += "2";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button3Pressed(View view) {
        display += "3";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button4Pressed(View view) {
        display += "4";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button5Pressed(View view) {
        display += "5";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button6Pressed(View view) {
        display += "6";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button7Pressed(View view) {
        display += "7";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button8Pressed(View view) {
        display += "8";
        output.setText(display);
        // Do something in response to button click
    }
    /** Called when the user touches the button */
    public void button9Pressed(View view) {
        display += "9";
        output.setText(display);
        // Do something in response to button click
    }

}