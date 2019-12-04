package com.example.customadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Person> personList = new ArrayList<>();

        for (int i = 1;i <= 20;i++){
            Person person = new Person("Person" + i , i,"persom"+i+"mail.com");
            personList.add(person);
        }

        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.person_layout,personList);
        listView.setAdapter(personAdapter);
    }
}
