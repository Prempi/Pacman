package com.mygdx.game;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
 
    World(PacmanGame pacmanGame) {
        maze = new Maze();
        pacman = new Pacman(60,60,maze);
        this.pacmanGame = pacmanGame;
    }
 
    public Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
    	return maze;
    }
    
    public void update(float delta) {
    	pacman.update();
    }

}
