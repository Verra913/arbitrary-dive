package com.arbitrary.dive.screens;

import com.arbitrary.dive.ArbitraryDive;
import com.arbitrary.dive.maps.MainHall_Map;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class MenuScreen implements Screen{
	public static final float SPEED = 200;
	TiledMap tiledMap, tiledMap2;
	OrthogonalTiledMapRenderer tiledMapRenderer;
	OrthographicCamera camera;
	ArbitraryDive game;
	Texture playButtonActive, playButtonInactive;
	Texture exitButtonActive, exitButtonInactive;
	Texture img;
	MainHall_Map mainHall;
	int x, y;
	
	
	public MenuScreen (ArbitraryDive game) {
		this.game = game;
		playButtonActive = new Texture ("menu/play_active.png");
		playButtonInactive = new Texture ("menu/play_inactive.png");
		playButtonActive = new Texture ("menu/exit_active.png");
		playButtonActive = new Texture ("menu/exit_inactive.png");
		img = new Texture ("idleTemplate.png");
	}

	@Override
	public void show() {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		x = 0;
		y = 0;
		
		camera = new OrthographicCamera();
        camera.setToOrtho(false,w,h);
        
		tiledMap = new TmxMapLoader().load("MainHall.tmx");
        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);	
        
        
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		tiledMapRenderer.setView(camera);
		tiledMapRenderer.render();
		/*
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y+= SPEED * Gdx.graphics.getDeltaTime();
			/*
			tiledMap.dispose();
			tiledMap = new TmxMapLoader().load("Mansion.tmx");
			tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
			
		} else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			/*
			tiledMap.dispose();
			tiledMap = new TmxMapLoader().load("1stFloorHallway.tmx");
			tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
			
		}*/
		
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y+= SPEED * Gdx.graphics.getDeltaTime();
		} else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y-= SPEED * Gdx.graphics.getDeltaTime();
		} else if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			x-= SPEED * Gdx.graphics.getDeltaTime();
		} else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x+= SPEED * Gdx.graphics.getDeltaTime();
		} else {
		}
		
		game.batch.begin();
        game.batch.draw(img, x, y);
        game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		 camera.viewportWidth = width;
		 camera.viewportHeight = height;
		 camera.position.set(width/2f, height/2f, 0);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
