package com.example.lab04_23_2021;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input;
    EditText number;

    public Object Scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner = new Scanner((Readable) input);

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
    }

    public void onNextScreenButtonClicked(View v) {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);

        this.startActivity(i);


    }
}