package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	World world;
	Texture pacmanImg;
	private PacmanGame pacmanGame;
	private Pacman pacman;
	private MazeRenderer mazeRenderer;
	public static final int BLOCK_SIZE = 40;
	SpriteBatch batch;
	
    public WorldRenderer(PacmanGame pacmanGame, World world) {
    	 this.pacmanGame = pacmanGame;
         batch = pacmanGame.batch;
         this.world = world;
         pacman = this.world.getPacman();
         pacmanImg = new Texture("pacman.png");
         mazeRenderer = new MazeRenderer(pacmanGame.batch,world.getMaze());
    }
    
    public void render(float delta) {
    	mazeRenderer.render();
    	SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x-BLOCK_SIZE/2, PacmanGame.HEIGHT-pos.y-BLOCK_SIZE/2);
        batch.end();
    }
}
