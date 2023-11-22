public class Main {
    public static void main(String[] args) {
//        Square sqr = new Square() {
//            @Override
//            public double calculate(double x) {
//
//                return x * x;
//            }
//
//        };
//
//        double sqr1 = sqr.calculate(5);
//        double sqr2 = sqr.calculate(10);
//        double sqr3 = sqr.calculate(3);
//
//        System.out.println(sqr1);
//        System.out.println(sqr2);
//        System.out.println(sqr3);

//        Square sqr = (x) -> x*x;

//        System.out.println(sqr.calculate(5));

        Geometrico quadrado = (X, Y) -> X * Y;
        Geometrico triangulo = (X, Y) -> (X * Y) / 2;
        Geometrico trapezio = (X, Y) -> (X + Y) * 1/2;

        System.out.println(quadrado.area(2,5));
        System.out.println(triangulo.area(2,5));
        System.out.println(trapezio.area(2,5));
    }
}