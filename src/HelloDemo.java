import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloDemo extends Application{
    private static final Image SCENERY = new Image ("desert.png",800,400,true,true);

    final private ImageView imageViewSceneryLeft = new ImageView(SCENERY);

    public void start(Stage primaryStage){
        primaryStage.setTitle("Demo");
        Group root = new Group();
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        root.getChildren().add(imageViewSceneryLeft);//ajoute une image à la scène à la racine : voir graphe sujet figure 1
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}
