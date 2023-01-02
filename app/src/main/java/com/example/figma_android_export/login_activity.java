
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		welcome_screen
	 *	@date 		Monday 17th of October 2022 04:24:46 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.figma_android_export;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

	public class login_activity extends Activity {

	
	private View _bg__login_ek2;
	private View rectangle_1;
	private View rectangle_3;
	private TextView password;
	private View rectangle_2;
	private TextView username_ek1;
	private View rectangle_4;
	private TextView sign_in;
	private TextView forgot_password__;
	private TextView login_ek3;
	private TextView clickhereBtn;
	private TextView welcome_to_rail__trip;
	private ImageView train2_removebg_preview_1_ek1;
	private TextView rail;
	private TextView connect;
	private ImageView vector_1_ek1;

		@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		final EditText username = findViewById(R.id.Login_Uname);
		final EditText password = findViewById(R.id.Login_Pwd);
		final Button loginBtn = findViewById(R.id.loginBtn);
		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		rectangle_3 = (View) findViewById(R.id.Login_Uname);
		//password = (TextView) findViewById(R.id.password);
		rectangle_2 = (View) findViewById(R.id.Login_Pwd);
		//username_ek1 = (TextView) findViewById(R.id.username_ek1);
		rectangle_4 = (View) findViewById(R.id.loginBtn);
		//sign_in = (TextView) findViewById(R.id.Sign_in);
		forgot_password__ = (TextView) findViewById(R.id.forgot_password);
		login_ek3 = (TextView) findViewById(R.id.login_ek3);
		clickhereBtn = (TextView) findViewById(R.id.clickhereBtn);
		welcome_to_rail__trip = (TextView) findViewById(R.id.welcome_to_rail__trip);

		//TextView clickable

			clickhereBtn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(login_activity.this,register_activity.class);
					startActivity(intent);

					Toast.makeText(login_activity.this, "You clicked on text", Toast.LENGTH_LONG).show();

				}
			});

			forgot_password__.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(login_activity.this,ChangePwdActivity.class);
					startActivity(intent);

					Toast.makeText(login_activity.this, "Move to the change password activity", Toast.LENGTH_SHORT).show();
				}
			});

		//custom code goes here

		loginBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				final String usernameTxt = username.getText().toString();
				final String passwordTxt = password.getText().toString();

				//if the username or password is empty it means the user has not entered the phone or password.So showing a Toast msg.
				if (usernameTxt.isEmpty() || passwordTxt.isEmpty()){
					Toast.makeText(login_activity.this, "Please enter Username or Password", Toast.LENGTH_SHORT).show();
				}
				else{

				}
			}
		});

		clickhereBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				//open register activity
				startActivity(new Intent(login_activity.this, register_activity.class));
			}
		});
	
	}
}
	
	