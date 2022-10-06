package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button btnButton;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount = findViewById(R.id.tvCount);
        btnButton = findViewById(R.id.btnButton);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.count.observe(this, integer -> {
            tvCount.setText(integer.toString());
        });

        btnButton.setOnClickListener(v -> {
               mainViewModel.add();
        });
    }
}