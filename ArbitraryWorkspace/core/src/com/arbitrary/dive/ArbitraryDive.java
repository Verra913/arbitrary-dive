package com.arbitrary.dive;

import com.arbitrary.dive.screens.MenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ArbitraryDive extends Game {
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = 480;
	public SpriteBatch batch;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		setScreen(new MenuScreen(this));
	}
	
	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	
	}

	
}
