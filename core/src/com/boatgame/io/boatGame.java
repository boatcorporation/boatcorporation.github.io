package com.boatgame.io;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class boatGame extends Game {
	public SpriteBatch batch;
	public static int HEIGHT = 960;
	public static int WIDTH = 1200;

	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new mainScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose(){
		batch.dispose();
	}
}
