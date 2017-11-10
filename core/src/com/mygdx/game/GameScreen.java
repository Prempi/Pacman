package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
public class GameScreen extends ScreenAdapter{
	

	World world;
	WorldRenderer worldRenderer;
	Pacman pacman;
	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	 
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        world = new World(pacmanGame);
        pacman = this.world.getPacman();
        worldRenderer = new WorldRenderer(this.pacmanGame,this.world);
    }
    
    @Override
    public void render(float delta) {
           update(delta);
     
           Gdx.gl.glClearColor(0, 0, 0, 1);
           Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
     
           worldRenderer.render(delta);
    }
    
    private void update(float delta) {
    	 if(Gdx.input.isKeyPressed(Keys.LEFT)) {
             pacman.move(Pacman.DIRECTION_LEFT);
         }
         if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	 pacman.move(Pacman.DIRECTION_RIGHT);
         }
         if(Gdx.input.isKeyPressed(Keys.UP)) {
             pacman.move(Pacman.DIRECTION_UP);
         }
         if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	 pacman.move(Pacman.DIRECTION_DOWN);
         }
    	
    }
    
    
    
}


