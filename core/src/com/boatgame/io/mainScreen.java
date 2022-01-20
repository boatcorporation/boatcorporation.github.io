package com.boatgame.io;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class mainScreen implements Screen {

    float x;
    float y;
    boatGame game;
    Texture img;

    public mainScreen(boatGame game){
        this.game = game;
        x = 0;
        y = 0;
        img = new Texture("d1136ecc5c03bd4e68280914d4808090.jpg");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            y = y + 4;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            y = y - 4;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x = x - 4;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x = x + 4;
        }

        game.batch.begin();
        game.batch.draw(img, x, y);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
