import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OldHero {
    int hero_x;
    int hero_y;
    int hero_w = 75;
    int hero_h = 100;
    private ImageView sprite;
    private Image spriteSheet;
    public OldHero(int x,int y,String spriteFileName) throws Exception{
        // Tests sur les coordonnées
        boolean test_x1 = x>=0+(hero_w/2);
        boolean test_x2 = x<=800-(hero_w/2);
        boolean test_x = test_x1 && test_x2;


        boolean test_y1 = y>=0+(hero_h/2);
        boolean test_y2 = y<= 400-(hero_h/2);
        boolean test_y = test_y1 && test_y2;

        //Implémentation des nouvelles coordonnées.
        if (test_y && test_x){
            this.hero_x = x;
            this.hero_y = y;
            spriteSheet = new Image(spriteFileName);
            sprite = new ImageView(spriteSheet);
            sprite.setViewport(new Rectangle2D(20,15,68,80));
        }
        else{
            throw new Exception("CoordinatesError");
        }
    }

}
