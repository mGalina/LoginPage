package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView username;
    private TextView email;
    private Button ok;
    private Button clear;
    private TextView help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsername();
        inputEmail();
        authentication();
        clear();
        inputHelp();
    }

    private void inputUsername() {
        username = findViewById(R.id.input_username);
        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
            }
        });
    }

    private void inputEmail() {
        email = findViewById(R.id.input_email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.setText("");
            }
        });
    }

    public void authentication() {
        ok = findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                help.setText(getText(R.string.help_ok1));
            }
        });

    }

    public void clear() {
        clear = findViewById(R.id.button_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText(R.string.input_username);
                email.setText(R.string.input_email);
                help.setText(getText(R.string.help_clear));
            }
        });
    }

    private void inputHelp() {
        help = findViewById(R.id.help);
    }
}
