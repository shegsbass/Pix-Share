package com.oladokun.shegs.pixshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void LoginPage(View view) {
        Intent button = new Intent(this, LoginActivity.class);
        startActivity(button);
    }
}
 