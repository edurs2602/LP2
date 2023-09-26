public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D();
        Ponto2D ponto3 = new Ponto2D();

        ponto1.setX(1);
        ponto1.setY(3);
        ponto1.getXY();

        ponto2.setX(3);
        ponto2.setY(6);

        ponto3.setX(7);
        ponto3.setY(9);

        Triangulo triangulo1 = new Triangulo(ponto1, ponto2, ponto3);

        triangulo1.getVertices();

        triangulo1.setBase(6);
        triangulo1.setAltura(13);
        triangulo1.calcularArea();

    }
}

