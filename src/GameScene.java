import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.Serial;

public class GameScene extends Scene {

    private Camera camera;
    private static int wWindow;
    private static int hWindow;
    private static int numberOfLives;
    private staticThing bckRight;
    private staticThing bckLeft;
    private Group root;

    public int getwWindow() {
        return wWindow;
    }

    public int gethWindow() {
        return hWindow;
    }



    public void render(){//modification du nom
        this.root.getChildren().addAll(this.bckLeft.getView());//ajoute une image à la scène à la racine : voir graphe sujet figure 1
        this.root.getChildren().addAll(this.bckRight.getView());
    }
    public GameScene(Group g,int height, int width){// Group groupe d'éléments affichables propres à javafx
        super(g,width,height);
        this.camera = new Camera(0,0);
        this.numberOfLives = 3;
        this.hWindow = height;
        this.wWindow = width;
        this.bckLeft = new staticThing("desert.png",0,0,800,400);
        this.bckRight = new staticThing("desert.png",800,0,800,400);
        //System.out.println("Control of the value of bckRight GameScene constructor");
        //System.out.println(bckRight.getView().getX());
        //System.out.println(bckRight.getX());
        this.root = g;


    }
}
