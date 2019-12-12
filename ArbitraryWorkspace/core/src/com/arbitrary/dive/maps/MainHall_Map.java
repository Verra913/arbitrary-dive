package com.arbitrary.dive.maps;


import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;


public class MainHall_Map {
	TiledMap tiledMap;
	TiledMapRenderer tiledMapRenderer;
	OrthographicCamera camera;
	
	public void show() {
		/*float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera();
        camera.setToOrtho(false,w,h);
        
		tiledMap = new TmxMapLoader().load("maps/MainHall.tmx");
        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);*/
	}
	
	public void render (float delta) {
		/*
		tiledMapRenderer.setView(camera);
		tiledMapRenderer.render();*/
	}

	
}
