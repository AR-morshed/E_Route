package com.example.arman.e_route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private static Button button_about;
    private static Button button_route;
    private static Button button_tracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String username = getIntent().getStringExtra("Username");
        OnClickaboutButtonListener();
        OnClickRouteButtonListener();
        OnClickTrackerButtonListener();
    }
        public void OnClickaboutButtonListener()
        {

            button_about=(Button)findViewById(R.id.B_about);
            button_about.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent =new Intent("com.example.arman.e_route.about2");
                            startActivity(intent);
                        }
                    }
            );
        }

    public void OnClickRouteButtonListener()
    {

        button_about=(Button)findViewById(R.id.B_Route);
        button_about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent("com.example.arman.e_route.Route");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickTrackerButtonListener()
    {

        button_about=(Button)findViewById(R.id.B_Tracker);
        button_about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent("com.example.arman.e_route.trackoption");
                        startActivity(intent);
                    }
                }
        );
    }
    }



