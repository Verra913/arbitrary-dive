package com.arbitrary.dive.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.arbitrary.dive.ArbitraryDive;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.width = 800;
		config.height = 600;
		config.resizable = true;
		new LwjglApplication(new ArbitraryDive(), config);
	}
}
