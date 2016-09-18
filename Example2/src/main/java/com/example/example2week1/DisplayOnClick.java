package com.example.example2week1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Avneet Kaur(300858244) on 2016-09-16
 */
public class DisplayOnClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_on_click);

        Intent intent = getIntent();
        Student studentDetails = (Student)intent.getSerializableExtra("onClick");
        TextView name = (TextView) findViewById(R.id.nameTxt2);
        name.setTextSize(40);
        name.setText(studentDetails.getName());

        TextView program = (TextView) findViewById(R.id.progTxt2);
        program.setTextSize(40);
        program.setText(studentDetails.getProgram());

        TextView course = (TextView) findViewById(R.id.courseTxt2);
        course.setTextSize(40);
        course.setText(studentDetails.getCourse());

        TextView sem = (TextView) findViewById(R.id.semTxt2);
        sem.setTextSize(40);
        sem.setText(Integer.toString(studentDetails.getSem()));
    }

}
