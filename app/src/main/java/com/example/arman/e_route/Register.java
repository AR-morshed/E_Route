package com.example.arman.e_route;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity  {

    Button bRegister;
    EditText NAME,USER_NAME,USER_PASS,CON_PASS;
    String name,user_name,user_pass,con_pass;

    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        NAME =(EditText)findViewById(R.id.etName);

        USER_NAME=(EditText)findViewById(R.id.etUsername);
        USER_PASS=(EditText)findViewById(R.id.etPassword);
        CON_PASS=(EditText)findViewById(R.id.etConpassword);
        bRegister=(Button)findViewById(R.id.Reg1_button);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = NAME.getText().toString();
                user_name=USER_NAME.getText().toString();
                user_pass= USER_PASS.getText().toString();
                con_pass=CON_PASS.getText().toString();
               if(!(user_pass.equals(con_pass)))
               {
                   Toast.makeText(getBaseContext(), "Password not matched", Toast.LENGTH_LONG).show();
                   NAME.setText("");
                   USER_NAME.setText("");
                   USER_PASS.setText("");
                   CON_PASS.setText("");

               }
               else{
                    DatabaseOperation DB = new DatabaseOperation(ctx);
                    DB.putInformation(DB, name, user_name, user_pass);
                    Toast.makeText(getBaseContext(), "Registration successfully", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }


    }

