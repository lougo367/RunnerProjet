import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class staticThing {
    private int x;
    private int y;
    private ImageView view;

    public ImageView getView() {
        view.setX(x);
        view.setY(y);
        return view;
    }
    public int getX() {return x;}

    public int getY() {return y;}


    public staticThing(String fileName,int or_x,int or_y,int w,int h){
        Image image = new Image (fileName,w,h,true ,true);
        this.view = new ImageView(image);
        this.x = or_x;
        this.y = or_y;
        //this.view.setX(x);
        //System.out.println("Control of the value of bckRight staticThing constructor");
        //System.out.println(view.getX());
        //this.view.setX(y);

    }
}
