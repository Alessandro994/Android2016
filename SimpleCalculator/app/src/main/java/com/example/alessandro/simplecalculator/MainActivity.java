package com.example.alessandro.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String KEY_RESULT_VALUE = "result";
    static float RESULT = 0;
    static float A = 0;
    static float B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            Float savedResult = savedInstanceState.getFloat(KEY_RESULT_VALUE);
            TextView textView = (TextView) findViewById(R.id.textView3);
            textView.setText(String.valueOf(savedResult));
        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(KEY_RESULT_VALUE, RESULT);
    }

    public void evaluateSum(View view) {
        EditText first = (EditText) findViewById(R.id.first_number);
        EditText second = (EditText) findViewById(R.id.second_number);

        RESULT = parseFirst(first) + parseSecond(second);

    }

    public void evaluateDifference(View view) {
        EditText first = (EditText) findViewById(R.id.first_number);
        EditText second = (EditText) findViewById(R.id.second_number);

        RESULT = parseFirst(first) - parseSecond(second);
    }

    public void evaluateProduct(View view) {
        EditText first = (EditText) findViewById(R.id.first_number);
        EditText second = (EditText) findViewById(R.id.second_number);

        RESULT = parseFirst(first) * parseSecond(second);
    }

    public void evaluateDivision(View view) {
        EditText first = (EditText) findViewById(R.id.first_number);
        EditText second = (EditText) findViewById(R.id.second_number);

        RESULT = parseFirst(first) / parseSecond(second);
    }

    public void showResult(View view) {
        TextView result = (TextView) findViewById(R.id.textView3);
        result.setText(String.valueOf(RESULT));
    }

    public void clearFields(View view) {
        EditText first = (EditText) findViewById(R.id.first_number);
        EditText second = (EditText) findViewById(R.id.second_number);
        TextView result = (TextView) findViewById(R.id.textView3);

        if (!first.equals("")) {
            first.setText("");
        }
        if (!second.equals("")) {
            second.setText("");
        }

        if (!result.equals("")) {
            result.setText("");
        }
    }

    private float parseFirst(EditText first) {
        try {
            A = Float.parseFloat(first.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Insert number before", Toast.LENGTH_SHORT).show();
        }

        return A;
    }

    private float parseSecond(EditText second) {
        try {
            B = Float.parseFloat(second.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Insert number before", Toast.LENGTH_SHORT).show();
        }

        return B;
    }

}
