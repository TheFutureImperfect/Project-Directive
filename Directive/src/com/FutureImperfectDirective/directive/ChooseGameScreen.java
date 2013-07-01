package com.FutureImperfectDirective.directive;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ChooseGameScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_game_screen);
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose_game_screen, menu);
		return true;
	}
	
	

}
