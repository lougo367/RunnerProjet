public class Camera {

    private int x;
    private int y;

    //Paramètre physiques de la caméra
    private float acc = 0;
    private float speed = 0;
    private float kOnM = (float) 1;
    private float fOnM = (float) 1;
    private float varT;



    public Camera(int cam_x,int cam_y){
        this.x = cam_x;
        this.y = cam_y;
    }

    public void update(double deltaT,double xHero){
        if (x>=800){x= x%800;}// Remise à zéro de la caméra lorsque celle-ci atteint le bord on reprend x%800 de manière à éviter une discontinuité du mouvement de la caméra
        /*
        varT = (float) (deltaT/1000000000);//conversion de deltaT en s.
        System.out.println("deltaT : "+deltaT+" varT : "+varT);
        xHero = (float) xHero;
        acc = (float) (kOnM*(xHero-x)+fOnM*speed);//speed en pixel/s
        speed = (float) (speed + acc*varT);
        x =x + (int) (speed*varT);
        System.out.println("acc : "+acc +" speed : "+ speed+ " x : "+x);
        */
        x += 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}


    @Override
    public String toString(){return ("Position de la caméra : ("+this.x+";"+this.y+")"); }
}
