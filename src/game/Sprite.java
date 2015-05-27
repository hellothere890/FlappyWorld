package game;

import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;


public abstract class Sprite extends Entity{

    /** Animation for the node */
    
	protected int width, height;
    
    protected ImageView image;
    
    protected Rectangle rect;
    /** Current display node */
    /** velocity vector x direction */
        
    public Sprite(int x, int y, int width, int height, String img){
    	this.x = x;
    	this.y = y;
    	this.width = width;
    	this.height = height;
    	rect = new Rectangle(x, y, width, height);
    	image = new ImageView(img);
    	image.setX(x);
    	image.setY(y);
    	node = image;
    }
    
    /**
     * Updates this sprite object's velocity, or animations.
     */
    public abstract void update();
    
    public abstract void reset();
    
    public Rectangle getRect(){
    	return rect;
    }
    public Bounds getBounds(){
    	return rect.getBoundsInParent();
    }

    /**
     * Did this sprite collide into the other sprite?
     *
     * @param other - The other sprite.
     * @return
     */
    public boolean collide(Sprite other){
    	return this.getBounds().intersects(other.getBounds());
    }
    public ImageView getImage(){
    	return image;
    }
    public void stop(){
    	image.setTranslateX(0);
    }
    
}

