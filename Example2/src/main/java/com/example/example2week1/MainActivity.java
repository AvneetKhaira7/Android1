package com.example.example2week1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 * Created by Avneet Kaur(300858244) on 2016-09-16
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayOnClick.class);
        EditText editText = (EditText) findViewById(R.id.nameTxt);
        String name = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.progTxt);
        String program = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.courseTxt);
        String course = editText2.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.semTxt);
        int sem = Integer.parseInt(editText3.getText().toString());
        Student student = new Student(name, program, course, sem);
        intent.putExtra("onClick", student);
        startActivity(intent);
    }
}
