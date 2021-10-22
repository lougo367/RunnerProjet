import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class staticThing {
    int x;
    int y;
    ImageView background;

    public staticThing(String fileName,int x,int y){
        Image bckgrnd = new Image (fileName,800,400,true,true);
        this.background = new ImageView(bckgrnd);
        this.x = x;// risque de confusion ? demander au prof
        this.y = y;
    }
}
