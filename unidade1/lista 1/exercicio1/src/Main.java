import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int inputNumber = number.nextInt();

        for (int i = 2; i <= inputNumber; i++) {
            if (verifier(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean verifier(int number){
        for (int j = 2; j < number; j++){
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}