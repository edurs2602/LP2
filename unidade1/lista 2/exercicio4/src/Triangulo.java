public class Triangulo extends Ponto2D {
    private Ponto2D vertice1;
    private Ponto2D vertice2;
    private Ponto2D vertice3;
    private int base;
    private int altura;

    public Triangulo(int x, int y) {
        super(x, y);
        this.vertice1 = new Ponto2D(x, y);
        this.vertice2 = new Ponto2D(x, y);
        this.vertice3 = new Ponto2D(x, y);
    }

    public void setVertice1(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void setVertice2(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void setVertice3(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void getVertice(Ponto2D verticeX){
        verticeX.getXY();
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getBase(int base) {
        return base;
    }

    public int getAltura(int altura){
        return altura;
    }

    public void area(int base, int altura){
        float area = (float) (base * altura) / 2;
        System.out.println("Area: " + area);
    }

}
