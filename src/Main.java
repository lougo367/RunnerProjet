import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {
    final public static int windowHeight = 400;
    final public static int windowWidth = 800;



    public void start(Stage primaryStage){
        Group root = new Group();
        GameScene scene = new GameScene(root,windowHeight,windowWidth);

    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}
