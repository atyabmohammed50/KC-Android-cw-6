package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] currentStudent = {0};

        ImageView img = findViewById(R.id.img);
        EditText edt1 = findViewById(R.id.Name);
        EditText edt2 = findViewById(R.id.Age);
        EditText edt3 = findViewById(R.id.Grade);
        Button btn = findViewById(R.id.button);

        ArrayList<Student>studentArrayList = new ArrayList<>();

        Student s1 = new Student("Mohammed",17,12,R.drawable.img);
        Student s2 = new Student("Mariam",15,10,R.drawable.img_1);
        Student s3 = new Student("Hamad",14,9,R.drawable.img_2);

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);


        img.setImageResource(studentArrayList.get(currentStudent[0]).getStudentPhoto());
        edt1.setText(studentArrayList.get(currentStudent[0]).getStudentName());
        edt2.setText(String.valueOf(studentArrayList.get(currentStudent[0]).getStudentAge()));
        edt3.setText(String.valueOf(studentArrayList.get(currentStudent[0]).getStudentGrade()));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (currentStudent[0] == studentArrayList.size()) {
                    currentStudent[0] = 0;
                }
                currentStudent[0]++;
                img.setImageResource(studentArrayList.get(currentStudent[0]).getStudentPhoto());
                edt1.setText(studentArrayList.get(currentStudent[0]).getStudentName());
                edt2.setText(String.valueOf(studentArrayList.get(currentStudent[0]).getStudentAge()));
                edt3.setText(String.valueOf(studentArrayList.get(currentStudent[0]).getStudentGrade()));

            }

        });





    }
}