package com.FutureImperfectDirective.directive;


import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class StartUpScreen extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_up_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_up_screen, menu);
		return true;
	}
	
	public void chooseGame(View view) {
		Intent intent = new Intent(this, ChooseGameScreen.class);
		
		ImageView startButton = (ImageView)findViewById(R.id.startGameButton);
		AnimatorSet startSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.start);
		startSet.setTarget(startButton);
		startSet.start();
		startActivity(intent);
	}
	}


