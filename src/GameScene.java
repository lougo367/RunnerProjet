import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.Serial;

public class GameScene extends Scene {

    Camera camera;
    private static int wWindow = 800;
    private static int hWindow = 400;
    private static int numberOfLives;
    private staticThing bckRight;
    private staticThing bckLeft;
    private Group root;
    // Paramètres pour la gestion de la caméra
    private int xR;
    private int yR = 0;
    private int wRight;
    private int hRight = hWindow;
    private int xL;
    private int yL = 0;
    private int wLeft;
    private int hLeft = hWindow;


    public int getwWindow() {
        return wWindow;
    }

    public int gethWindow() {
        return hWindow;
    }



    public void render(){//modification du nom
        if (camera.getX() == 800){camera.setX(0);}// Voir remarque ci-dessous
        //Caméra
        // Déterminer les paramètres de la caméra
        //Paramètres pour la partie gauche
        xL = camera.getX();
        yL = camera.getY();
        wLeft = wWindow - camera.getX();
        //System.out.println(wLeft);//contrôle
        hLeft = hWindow;
        // Paramètres pour la partie droite
        xR = 0;
        yR = 0;
        wRight = camera.getX();
        //System.out.println(wRight);//contrôle
        hRight = hWindow;
        //Remarque importante : la camera devra reboucler à 0 avant d'atteindre la valeur camera.getX() = 800.
        //END Caméra

        // Accollement des deux backgrounds
        bckRight.getView().setX(wWindow-camera.getX());


        this.bckRight.getView().setViewport(new Rectangle2D(xR,yR,wRight,hRight));
        this.bckLeft.getView().setViewport(new Rectangle2D(xL,yL,wLeft,wLeft));

        // Finalisation du rendu
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
