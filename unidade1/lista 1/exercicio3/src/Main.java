import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner floatInput = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double inputFloat = floatInput.nextFloat();

        int ordem = ordemGrandeza(inputFloat);
        System.out.println(ordem);

    }

    public static int ordemGrandeza(double number){
        double tratamento = Math.floor(Math.log10(Math.abs(number)));

        return (int) tratamento;
    }
}