package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.samsung.itschool.mdev.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // https://developer.android.com/topic/libraries/view-binding#java
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setContentView(R.layout.activity_main);
        //btn = findViewById(R.id.button);
        //log = findViewById(R.id.login);
        //pass = findViewById(R.id.password);


        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get_login = binding.login.getText().toString();
                String get_pass = binding.password.getText().toString();
                if(get_login.equals("test") && get_pass.equals("123")) {
                    binding.result.setText(R.string.error);
                } else {
                    binding.result.setText(R.string.success);
                }
            }
        });

    }


}