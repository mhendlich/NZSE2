package com.example.nzse_steffen_michael;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText editTextMail = (EditText) findViewById(R.id.editTextTextEmailAddress);
                String stringMail = editTextMail.getText().toString();

                EditText editTextPW = (EditText) findViewById(R.id.editTextTextPassword);
                String stringPW = editTextPW.getText().toString();

//                if(stringMail.equals("test") && stringPW.equals("1234")){
                //perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, OverviewScreen.class);
                MainActivity.this.startActivity(activityChangeIntent);
//                }
            }
        });
    }


}