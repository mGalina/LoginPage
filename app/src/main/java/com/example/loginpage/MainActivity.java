package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText email;
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
    }

    private void inputEmail() {
        email = findViewById(R.id.input_email);
    }

    public void authentication() {
        Button ok = findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String mail = email.getText().toString();
                help.setText(getString(R.string.help_ok, name, mail));
            }
        });

    }

    public void clear() {
        Button clear = findViewById(R.id.button_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText().clear();
                email.getText().clear();
                help.setText(getText(R.string.help_clear));
            }
        });
    }

    private void inputHelp() {
        help = findViewById(R.id.help);
    }
}
