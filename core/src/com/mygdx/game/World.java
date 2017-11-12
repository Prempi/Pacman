package com.mygdx.game;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    private int score;
 
    World(PacmanGame pacmanGame) {
        maze = new Maze();
        pacman = new Pacman(60,60,this);
        this.pacmanGame = pacmanGame;
        score = 0;
        registerDotEattenListener();
    }
    
    private void registerDotEattenListener() {
        pacman.registerDotEattenListener(new Pacman.DotEattenListener() {
            @Override
            public void notifyDotEatten() {
                score += 1;
            }
        });
    }
 
    public Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
    	return maze;
    }
    
    public int getScore() {
    	return score;
    }
    
    public void increaseScore() {
    	score+=1;
    }
    
    public void update(float delta) {
    	pacman.update();
    }

}
