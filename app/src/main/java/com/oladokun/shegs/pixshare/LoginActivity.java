package com.oladokun.shegs.pixshare;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.TextUtils;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.validation.Validator;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void PhotoPage(View view) {
       Intent button = new Intent(this, GalleryActivity.class);
        startActivity(button);
   }

    //This will take me to the signup page
    public void signUp(View view) {
        Intent button = new Intent(this, SignupActivity.class);
        startActivity(button);
    }

}

