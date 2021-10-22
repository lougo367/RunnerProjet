import javafx.scene.Scene;

public class GameScene extends Scene {
    Camera camera;
    public GameScene{
        super();// à voir avec le prof
        camera = new Camera(0,0);
    }
}
