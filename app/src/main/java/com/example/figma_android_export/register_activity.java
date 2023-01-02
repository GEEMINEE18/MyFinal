
	 
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
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

	public class register_activity extends Activity {

	
	private View _bg__register_ek2;
	private View rectangle_5;
	private View rectangle_4_ek1;
	private TextView register_ek3;
	private View rectangle_8;
	private TextView password_ek2;
	private View rectangle_8_ek1;
	private TextView confirm_password_ek1;
	private View rectangle_9;
	private TextView phone_ek1;
	private View rectangle_9_ek1;
	private TextView nic_or_passport_number;
	private View rectangle_2_ek1;
	private TextView first_name;
	private View rectangle_6;
	private TextView last_name;
	private View rectangle_7;
	private TextView email_ek1;
	private TextView register_ek4;
	private ImageView train2_removebg_preview_1_ek2;
	private TextView rail_ek1;
	private TextView t_r_i_p;
	private ImageView vector_1_ek2;

	//create object of DatabaseReference class to access firebase's Realtime Database
		DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://figma-android-export-default-rtdb.firebaseio.com/");

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		final EditText firstname = findViewById(R.id.firstname);
		final EditText lastname = findViewById(R.id.lastname);
		final EditText email = findViewById(R.id.email);
		final EditText password = findViewById(R.id.password);
		final EditText confirmPwd = findViewById(R.id.confirmPwd);
		final EditText phone = findViewById(R.id.phone);
		final EditText NicPassport = findViewById(R.id.NicPassport);
		final Button regBtn = findViewById(R.id.regBtn);

		regBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				//get data from Edit texts into String variables

				final String firstname_Txt = firstname.getText().toString();
				final String lastname_Txt = lastname.getText().toString();
				final String email_Txt = email.getText().toString();
				final String password_Txt = password.getText().toString();
				final String confirmPwd_Txt = confirmPwd.getText().toString();
				final String phone_Txt = phone.getText().toString();
				final String NicPassport_Txt = NicPassport.getText().toString();

				//check if user fill all the fields before sending data to firebase
				if (firstname_Txt.isEmpty() || lastname_Txt.isEmpty() || email_Txt.isEmpty() || password_Txt.isEmpty() || confirmPwd_Txt.isEmpty() || phone_Txt.isEmpty() || NicPassport_Txt.isEmpty()){
					Toast.makeText(register_activity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
				}

				//check if password are matching with each other
				else if (!password_Txt.equals(confirmPwd_Txt)){
					Toast.makeText(register_activity.this, "Password are not matching", Toast.LENGTH_SHORT).show();
				}
				else{
					databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(@NonNull DataSnapshot snapshot) {
							
							//check if NIC is not registered before
							if (snapshot.hasChild(NicPassport_Txt)){
								Toast.makeText(register_activity.this, "NIC/Passport number is already registered", Toast.LENGTH_SHORT).show();
							}
							else{
								//sending data to firebase Realtime Database
								//we're using NicPassport as unique identity of every user
								databaseReference.child("users").child(NicPassport_Txt).child("firstname").setValue(firstname_Txt);
								databaseReference.child("users").child(NicPassport_Txt).child("lastname").setValue(lastname_Txt);
								databaseReference.child("users").child(NicPassport_Txt).child("email").setValue(email_Txt);
								databaseReference.child("users").child(NicPassport_Txt).child("password").setValue(password_Txt);
								databaseReference.child("users").child(NicPassport_Txt).child("confirmPwd").setValue(confirmPwd_Txt);
								databaseReference.child("users").child(NicPassport_Txt).child("phone").setValue(phone);

								Toast.makeText(register_activity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
								finish();
							}

							
						}

						@Override
						public void onCancelled(@NonNull DatabaseError error) {

						}
					});

				}

			}
		});
		
		_bg__register_ek2 = (View) findViewById(R.id._bg__register_ek2);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		rectangle_4_ek1 = (View) findViewById(R.id.regBtn);
		//register_ek3 = (TextView) findViewById(R.id.register_ek3);
		rectangle_8 = (View) findViewById(R.id.password);
		//password_ek2 = (TextView) findViewById(R.id.password_ek2);
		rectangle_8_ek1 = (View) findViewById(R.id.confirmPwd);
		//confirm_password_ek1 = (TextView) findViewById(R.id.confirm_password_ek1);
		rectangle_9 = (View) findViewById(R.id.phone);
		//phone_ek1 = (TextView) findViewById(R.id.phone_ek1);
		rectangle_9_ek1 = (View) findViewById(R.id.NicPassport);
		//nic_or_passport_number = (TextView) findViewById(R.id.nic_or_passport_number);
		rectangle_2_ek1 = (View) findViewById(R.id.firstname);
		//first_name = (TextView) findViewById(R.id.first_name);
		rectangle_6 = (View) findViewById(R.id.lastname);
		//last_name = (TextView) findViewById(R.id.last_name);
		rectangle_7 = (View) findViewById(R.id.email);
		//email_ek1 = (TextView) findViewById(R.id.email_ek1);
		register_ek4 = (TextView) findViewById(R.id.register_ek4);
		//custom code goes here
	
	}
}
	
	