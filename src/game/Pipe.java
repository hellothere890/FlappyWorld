package game;

import javafx.scene.shape.Rectangle;

public class Pipe extends Sprite {
    
	private boolean moving = false;
	private int reset = 600;
    private boolean removed = false;
    
    public Pipe(int x, int y, int width, int height, String img){
        super(x, y, width, height, img);
    }
    public void update(){
    //checking for boundaries
    //update the object
    	rect = new Rectangle(image.getX() + image.getTranslateX(), image.getY() + image.getTranslateY(), width, height);
    	
    	if(!gameOver && moving){
    		image.setTranslateX(image.getTranslateX() - 2);
    	}
    	if(image.getX() + image.getTranslateX() < -52){
    		image.setX(452);
    		image.setTranslateX(0);
    	}
    	if(gameOver){
    		//reset(x);
    	}
    
    }
    public void reset(int x){
    	this.x = x;
    	image.setX(x);
    	image.setTranslateX(0);
    }
    public void setMoving(boolean moving){
    	this.moving = moving;
    }
	    
}
