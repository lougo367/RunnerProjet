import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GameScene extends Scene {
    Camera camera;
    private static int wWindow;
    private static int hWindow;
    private static int numberOfLives;
    private staticThing bckgrnd;
    private Group root;

    public int getwWindow() {
        return wWindow;
    }

    public int gethWindow() {
        return hWindow;
    }
    public void render(Stage primaryStage){
        primaryStage.setTitle("Demo");


        primaryStage.setScene(this);
        root.getChildren().add(imageViewSceneryLeft);//ajoute une image à la scène à la racine : voir graphe sujet figure 1
        primaryStage.show();
    }
    public GameScene(Group g,int height, int width){// Group groupe d'éléments affichables propres à javafx
        super(g,width,height);
        this.camera = new Camera(0,0);
        this.numberOfLives = 3;
        this.hWindow = height;
        this.wWindow = width;
        this.bckgrnd = new staticThing("src/desert.png",0,0);
        this.root = g;
    }
}
