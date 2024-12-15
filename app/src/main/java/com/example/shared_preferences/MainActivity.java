package com.example.shared_preferences;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextText;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button SaveDATA,GotoANOTHERActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText=findViewById(R.id.editTextText);
        SaveDATA=findViewById(R.id.SaveDATA);
        GotoANOTHERActivity=findViewById(R.id.GotoANOTHERActivity);
       sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        editor=sharedPreferences.edit();



      SaveDATA.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


              String name1=editTextText.getText().toString();

             editor.putString("name",name1);
             editor.apply();

          }
      });




      GotoANOTHERActivity.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              String name =sharedPreferences.getString("name","Default valu");

              GotoANOTHERActivity.setText(name);


             startActivity(new Intent(MainActivity.this,MainActivity2.class));

          }
      });



    }
}