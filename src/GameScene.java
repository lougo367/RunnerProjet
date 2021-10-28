import javafx.scene.Scene;

public class GameScene extends Scene {
    Camera camera;
    private static int numberOfLives;
    public GameScene{
        camera = new Camera(0,0);
        numberOfLives = 3;
    }
}
