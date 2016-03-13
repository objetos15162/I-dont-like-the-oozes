package mx.heroesofanzu.game.Screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import mx.heroesofanzu.game.HeroesOfAnzu;

/**
 * Created by jesusmartinez on 12/03/16.
 */
public abstract class Screen implements com.badlogic.gdx.Screen {

    protected HeroesOfAnzu game;
    protected SpriteBatch batch;

    public Screen(HeroesOfAnzu game) {
        this.game = game;
        batch = game.getBatch();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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
