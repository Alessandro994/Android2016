package com.example.alessandro.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1: {
                button = (Button) findViewById(view.getId());
                Toast.makeText(MainActivity.this, "This button will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.button2: {
                button = (Button) findViewById(view.getId());
                Toast.makeText(MainActivity.this, "This button will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.button3: {
                button = (Button) findViewById(view.getId());
                Toast.makeText(MainActivity.this, "This button will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.button4: {
                button = (Button) findViewById(view.getId());
                Toast.makeText(MainActivity.this, "This button will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.button5: {
                button = (Button) findViewById(view.getId());
                Toast.makeText(MainActivity.this, "This button will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            default:
                break;
        }
    }
}
