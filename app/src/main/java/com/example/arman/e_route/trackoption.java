package com.example.arman.e_route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trackoption extends AppCompatActivity {


    private Button bu;
    private Button bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackoption);
        OnClickTrackerSearchButtonListener();
        OnClickTrackerPathButtonListener();
    }

    public void OnClickTrackerSearchButtonListener()
    {

        bu=(Button)findViewById(R.id.B_mapSearch);
        bu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent("com.example.arman.e_route.MapsActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickTrackerPathButtonListener()
    {

        bi=(Button)findViewById(R.id.B_pathsearch);
        bi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent("com.example.arman.e_route.PathActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
