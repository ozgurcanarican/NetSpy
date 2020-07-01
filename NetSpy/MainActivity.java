package com.xxxxx.netspy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


//__author__: Özgür Can ARICAN
//__application_name__: NetSpy

public class MainActivity extends AppCompatActivity {

    TextView introText;
    TextView questionText;
    EditText inputText;
    Button searchButton;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introText = findViewById(R.id.textView);
        questionText = findViewById(R.id.textView2);
        inputText = findViewById(R.id.editText);
        searchButton = findViewById(R.id.button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputText.getText().toString().matches("") || inputText.getText().toString().matches("username")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid username!!!", Toast.LENGTH_LONG).show();
                } else {
                    username = inputText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                    }
                }
            });
        }
    }


