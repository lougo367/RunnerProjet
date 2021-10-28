import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class staticThing {
    private int x;
    private int y;
    private ImageView view;

    public ImageView getView() {
        return view;
    }


    public staticThing(String fileName,int x,int y){
        Image bckgrnd = new Image (fileName,800,400,true,true);
        this.view = new ImageView(bckgrnd);
        this.x = x;// risque de confusion ? demander au prof
        this.y = y;
    }
}
