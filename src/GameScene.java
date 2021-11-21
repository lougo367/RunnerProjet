import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;

public class GameScene extends Scene {

    int ground = 342; //valeur de y pour laquelle le sujet est placé sur le sol du background
    Camera camera;
    private final String spriteHeroFile = "D:\\louis\\Documents\\Scolaire\\ENSEA\\2\\Informatique\\RunnerProjet\\src\\heros.png";
    private Hero hero = new Hero(30,30,spriteHeroFile);
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
//Fin paramètres de la caméra

    //Paramètres timers
    private double periodUpdate = 90000000;// Temps d'actualisation
    private static double timeCount = 0;
    private double timeUpdate = 0;
    private double timeSetSprite = 0;
    private double timeSetRender = 0;

    //Déclaration du Timer
    private AnimationTimer timer = new AnimationTimer()
    {
        public void handle(long time){

            if (time-timeSetSprite >= periodUpdate) {
                timeSetSprite = time;
                hero.update();


            }
            if (time-timeSetRender >= periodUpdate/20) {
                camera.update(time-timeSetRender, hero.getX());
                timeSetRender = time;
                this.update();
            }

        }
        private void update() {
            render();
        }
    };

    public int getwWindow() {
        return wWindow;
    }

    public int gethWindow() {
        return hWindow;
    }



    public void render(){//modification du nom

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
        // Accollement des deux backgrounds
        bckRight.getView().setX(wWindow-camera.getX());

        this.bckRight.getView().setViewport(new Rectangle2D(xR,yR,wRight,hRight));
        this.bckLeft.getView().setViewport(new Rectangle2D(xL,yL,wLeft,hLeft));
        //END Caméra


        //BEGIN hero


        //END hero

        // Finalisation du rendu


    }
    public GameScene(Group g,int height, int width){// Group groupe d'éléments affichables propres à javafx
        super(g,width,height);
        timer.start();
        this.camera = new Camera(0,0);
        this.numberOfLives = 3;
        this.hWindow = height;
        this.wWindow = width;
        this.bckLeft = new staticThing("desert.png",0,0,800,400);
        this.bckRight = new staticThing("desert.png",800,0,800,400);
        //System.out.println("Control of the value of bckRight GameScene constructor");
        //System.out.println(bckRight.getView().getX());
        //System.out.println(bckRight.getX());

        //hero
        this.hero.setX(100);
        this.hero.setY(ground-84);//84 hauteure moyenne du héros

        this.root = g;
        // Ajout des différents éléments au root
        this.root.getChildren().addAll(this.bckLeft.getView());//ajoute une image à la scène à la racine : voir graphe sujet figure 1
        this.root.getChildren().addAll(this.bckRight.getView());
        this.root.getChildren().addAll(this.hero.getSprite());


    }
}
