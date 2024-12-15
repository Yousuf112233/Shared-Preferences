package com.example.shared_preferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);

       sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);

        String s1=sharedPreferences.getString("name","");

        textView.setText(s1);

    }
}