import javafx.geometry.Rectangle2D;

import java.util.ArrayList;

public class Hero extends AnimatedThing{
    private String  state = "RUN";
    private static int frameNumber = 0;


    //BEGIN Sprite hero
    // Liste des coordonnées des sprites
    //Voir spritesheet_memo
    // Taille de la spritesheet w = 600; h = 636
    private ArrayList run = new ArrayList(){


        {
            add(new Rectangle2D(21,14,74-21,98-14));//21,14;74,98
            add((new Rectangle2D(95,2,160-96,(98-3)+2)));//96,98;160,3
            add((new Rectangle2D(173,15,251-173,(98-16)+2)));//173,98;251,16
            add((new Rectangle2D(273,13,330-273,(98-14)+2)));//273,98;330,14
            add((new Rectangle2D(350,5,410-350,(98-5)+2)));//350,98;410,5
            add(new Rectangle2D(426,17,502-426,(98-17)+2));//426,98;502,17
        }
    };
    private ArrayList jump = new ArrayList(){
        {
            add(new Rectangle2D(24,164,71-24,600-(164-260)));//24,260;71,164
            add(new Rectangle2D(94,164,158-94,257-164));//94,257;158,164
        }
    };
    private ArrayList runShoot = new ArrayList(){
        {
            add(new Rectangle2D(12,340,77-12,424-338));//12,424;77,338
            add(new Rectangle2D(81,330,159-81,424-328));//81,424;159,328
            add(new Rectangle2D(160,342,241-160,424-340));//160,424;241,340
            add(new Rectangle2D(255,340,323-255,424-339));//255,424;323,339
            add(new Rectangle2D(339,331,416-339,424-330));//339,424;416,330
            add(new Rectangle2D(424,344,503-424,424-342));//424,424;503,342
            add(new Rectangle2D(524,368,562-524,392-367));//522,392;562,392
        }
    };
    private ArrayList jumpShoot = new ArrayList(){
        {
            add(new Rectangle2D(16,494,83-16,592-493));//16,592;83,493
            add(new Rectangle2D(94,493,164-94,585-490));//94,585;169,490
        }
    };
    //END Sprite Hero

    public void update(){
            /*
            if (time-timeSet >= periodUpdate) {
                timeSet = time;
             */
            //Modification
            if (state == "RUN") {// Reprise à partir de la première frame : il y a 6 frame pour
                if (frameNumber >=5) {
                    frameNumber = -1;
                }
                frameNumber +=1;
                this.setFrame((Rectangle2D) run.get(frameNumber));

            }

    }

    public void setState(String newState){
        this.state = newState;
    }

    public Hero(int x,int y,String spriteFileName){
        super(x, y, spriteFileName);
    }


}

