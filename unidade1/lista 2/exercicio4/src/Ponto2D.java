public class Ponto2D {
    private int x;
    private int y;

    Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {}

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void getXY(){
        System.out.println("X: " + this.x + " Y: " + this.y);
    }

}
