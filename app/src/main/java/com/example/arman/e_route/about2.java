package com.example.arman.e_route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about2 extends AppCompatActivity {

    private Button button_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
        OnClickaboutButtonaboutListener();
    }

    public void OnClickaboutButtonaboutListener()
    {

        button_about=(Button)findViewById(R.id.B_developer);
        button_about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent("com.example.arman.e_route.About");
                        startActivity(intent);
                    }
                }
        );
    }
}
