package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class User extends AppCompatActivity {

    String Name;
    String Description;
    int ID;
    boolean Followed;

    public User(String name, String description, int id, boolean followed)
    {
        Name = name;
        Description = description;
        ID = id;
        Followed = followed;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}