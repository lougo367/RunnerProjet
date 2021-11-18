import java.util.ArrayList;
import javafx.geometry.Rectangle2D;
public class Hero extends AnimatedThing{
    // Liste des coordonnées des sprites
    //Voir spritesheet_memo
    // Taille de la spritesheet w = 600; h = 636
    private ArrayList RUN = new ArrayList(){
        {
            add((new Rectangle2D(20,600-97,75-20,600-(97-14))));//20,97;75,14
            add((new Rectangle2D(96,600-98,160-96,600-(98-3))));//96,98;160,3
            add((new Rectangle2D(173,600-98,251-173,600-(98-16))));//173,98;251,16
            add((new Rectangle2D(273,600-98,330-273,600-(98-14))));//273,98;330,14

        }




    };







    public Hero(int x,int y){
        super(x, y, "src/heros.png");
    }
}

