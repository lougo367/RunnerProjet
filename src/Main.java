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
        Image icon = new Image("icon.png");

        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Demo du jeu");

        GameScene Gscene = new GameScene(root,windowHeight,windowWidth);
        //Test caméra
        //Gscene.camera.setX(236);
        //Gscene.camera.setY(0);
        //END Test caméra : Test concluant

        primaryStage.setScene(Gscene);
        Gscene.render();
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}
