
	 
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

	public class make_reservation_activity extends Activity {

	
	private View _bg__make_reservation_ek2;
	private View rectangle_10;
	private View rectangle_35;
	private View bottom_nav;
	private View rectangle_35_ek1;
	private ImageView my_bookings_1;
	private ImageView train_bootomnav_1;
	private ImageView travelling_1;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private View rectangle_36;
	private ImageView train2_1;
	private TextView train_booking;
	private View rectangle_37;
	private ImageView train_3;
	private TextView today_schedule;
	private View rectangle_38;
	private ImageView train5_1;
	private TextView railway_resorts_booking;
	private ImageView train2_removebg_preview_1_ek3;
	private TextView rail_ek2;
	private TextView t_r_i_p_ek1;
	private ImageView vector_1_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_reservation);

		final Button trainbookingBtn = findViewById(R.id.trainbooking);

		
		_bg__make_reservation_ek2 = (View) findViewById(R.id._bg__make_reservation_ek2);
		rectangle_10 = (View) findViewById(R.id.rectangle_10);
		//rectangle_35 = (View) findViewById(R.id.rectangle_35);
		//bottom_nav = (View) findViewById(R.id.bottom_nav);
		//rectangle_35_ek1 = (View) findViewById(R.id.rectangle_35_ek1);
		//my_bookings_1 = (ImageView) findViewById(R.id.my_bookings_1);
		//train_bootomnav_1 = (ImageView) findViewById(R.id.train_bootomnav_1);
		//travelling_1 = (ImageView) findViewById(R.id.travelling_1);
		//vector = (ImageView) findViewById(R.id.vector);
		//vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		//vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		//vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		//vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		rectangle_36 = (View) findViewById(R.id.rectangle_36);
		train2_1 = (ImageView) findViewById(R.id.train2_1);
		train_booking = (TextView) findViewById(R.id.train_booking);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		train_3 = (ImageView) findViewById(R.id.train_3);
		today_schedule = (TextView) findViewById(R.id.today_schedule);
		rectangle_38 = (View) findViewById(R.id.rectangle_38);
		train5_1 = (ImageView) findViewById(R.id.train5_1);
		railway_resorts_booking = (TextView) findViewById(R.id.railway_resorts_booking);
		//train2_removebg_preview_1_ek3 = (ImageView) findViewById(R.id.train2_removebg_preview_1_ek3);
		//rail_ek2 = (TextView) findViewById(R.id.rail_ek2);
		//t_r_i_p_ek1 = (TextView) findViewById(R.id.t_r_i_p_ek1);
		//vector_1_ek3 = (ImageView) findViewById(R.id.vector_1_ek3);
	
		
		//custom code goes here

		trainbookingBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(make_reservation_activity.this,train_booking_activity.class);
				startActivity(intent);

				Toast.makeText(make_reservation_activity.this, "Successful", Toast.LENGTH_LONG).show();

			}
		});
	
	}
}
	
	