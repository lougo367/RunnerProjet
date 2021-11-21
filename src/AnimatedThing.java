import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public abstract class AnimatedThing {
    //general properties
    private double x;
    private double y;
    private int  attitude;

    //animation
    private double index;
    private int framDuration;
    private int maxIndex;

    public void setX(int x) {
        this.x = x;
        this.getSprite().setX(x);// mettre à jour les cooordonnées met aussi à jour la position du sprite

    }

    public void setY(int y) {
        this.y = y;
        this.getSprite().setY(y);
    }
    public double getY(){ return this.y;}

    public double getX(){return this.x;}

    public ImageView getSprite()
    {
        return sprite; }

    //sprite
    private ImageView sprite;
    private Image spriteSheet;
    private int frameOffset;
    private int l_Window;
    private int w_Window;

    public void setFrame(Rectangle2D frame){
        this.sprite.setViewport(frame);
    }

    public AnimatedThing(int x,int y,String spriteFileName){
        this.x = x;
        this.y = y;
        this.attitude = 0;
        spriteSheet = new Image(spriteFileName);
        sprite = new ImageView(spriteSheet);



    }
}
