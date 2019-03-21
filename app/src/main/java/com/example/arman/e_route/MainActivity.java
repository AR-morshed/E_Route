package com.example.arman.e_route;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     Button bLogin;
     EditText etUsername,etPassword;
      TextView tvRegisterLink;
    String user_name,user_pass;
   Context ctx =this;
    int status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText)findViewById(R.id.etUsername);

        etPassword = (EditText)findViewById(R.id.etPassword);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);
        tvRegisterLink.setOnClickListener(this);
        bLogin = (Button)findViewById(R.id.Login);

        //OnClickButtonListener();
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = getIntent().getExtras();
                user_name = etUsername.getText().toString();

                user_pass = etPassword.getText().toString();

                DatabaseOperation DOP = new DatabaseOperation(ctx);

                Cursor CR = DOP.getInformation(DOP);

               CR.moveToFirst();
                boolean loginstatus = false;
                String NAME = "";
                Log.d("Database operations", "Table created");
                do{


                         if (user_name.equals(CR.getString(1)) && user_pass.equals(CR.getString(2))) {
                             loginstatus = true;
                             NAME = CR.getString(1);
                         }

                }while(CR.moveToNext());
                if(loginstatus)
                {
                    Toast.makeText(getBaseContext(),"Login successfully-----\n Welcome  "+NAME,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent("com.example.arman.e_route.Menu");
                    startActivity(intent);


                }
                else
                {
                    Toast.makeText(getBaseContext(),"Login Failed\nincorrect username or password ",Toast.LENGTH_LONG).show();
                   // finish();
                    etUsername.setText("");
                    etPassword.setText("");
                }
            }
        });




    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Login:

                break;
            case R.id.tvRegisterLink:

                startActivity(new Intent(this,Register.class));
                break;
        }
    }


}
