public class Triangulo extends Ponto2D {
    private Ponto2D vertice1;
    private Ponto2D vertice2;
    private Ponto2D vertice3;
    private int base;
    private int altura;

    public Triangulo(Ponto2D vertice1, Ponto2D vertice2, Ponto2D vertice3) {
        super(vertice1, vertice2, vertice3);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Ponto2D getVertice1() {
        return this.vertice1;
    }

    public Ponto2D getVertice2() {
        return this.vertice2;
    }

    public Ponto2D getVertice3() {
        return this.vertice3;
    }

    public void getVertices(){
        System.out.println("Vertice 1: (" + vertice1.getX() + ", " + vertice1.getY() + ")");
        System.out.println("Vertice 2: (" + vertice2.getX() + ", " + vertice2.getY() + ")");
        System.out.println("Vertice 3: (" + vertice3.getX() + ", " + vertice3.getY() + ")");
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void calcularArea() {
        float area = (float) (base * altura) / 2;
        System.out.println("Área: " + area);
    }
}
