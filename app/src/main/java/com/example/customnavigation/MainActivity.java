package com.example.customnavigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    Button Inside_Navigation, Outside_Navigation, Open_Menu;
    DrawerLayout drawable;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        open_menu();
    }

    public void Anhxa() {
        Inside_Navigation = (Button) findViewById(R.id.Inside_Navigation);
        Outside_Navigation = (Button) findViewById(R.id.Outside_Navigation);
        Open_Menu = (Button) findViewById(R.id.open_menu);
        drawable = (DrawerLayout) findViewById(R.id.DrawerLayout);
        navigationView = (NavigationView) findViewById(R.id.NavigationView);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void open_menu() {
        Open_Menu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                drawable.openDrawer(Gravity.START);
            }
        });
    }
}