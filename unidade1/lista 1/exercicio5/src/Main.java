import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int inputNumber = number.nextInt();

        System.out.println("Em ordem Crescente");
        crescente(inputNumber);

        System.out.println("Em ordem Decrescente");
        decrescente(inputNumber);

    }

    public static void crescente(int number) {
        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }

    public static void decrescente(int number) {
        while (number != 0){
            System.out.println(number);
            number--;
        }
    }
}