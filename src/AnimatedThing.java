import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    //general properties
    private double x;
    private double y;
    private int  attitude;

    //animation
    private double index;
    private int framDuration;
    private int maxIndex;


    //files
    private ImageView sprite;
    private Image spriteSheet;
    private int frameOffset;
    private int l_Window;
    private int w_Window;

    public AnimatedThing(int x,int y,String spriteFileName){
        this.x = x;
        this.y = y;
        this.attitude = 0;
        spriteSheet = new Image(spriteFileName);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,15,68,80));

    }
}
