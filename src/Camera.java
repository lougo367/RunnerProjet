public class Camera {

    private int x;
    private int y;

    public Camera(int cam_x,int cam_y){
        this.x = cam_x;
        this.y = cam_y;
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
