package com.chhaichivon.movieandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

	Button  mLoginButton;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mLoginButton = (Button) findViewById(R.id.btn_login);
		mLoginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent  intent  = new Intent(getApplicationContext(), BottomNavigationActivity.class);
				startActivity(intent);
			}
		});
		
	}
}
