package com.oladokun.shegs.pixshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void MainPage(View view) {
        Intent button = new Intent(this, LoginActivity.class); //Need tp change the name of the class to the class i want to link to.
        startActivity(button);
    }
}
