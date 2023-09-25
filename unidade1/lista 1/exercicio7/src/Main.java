import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Digite a mensagem: ");
        String inputString = stringScanner.nextLine();

        System.out.print("Digite o número de deslocamento (chave): ");
        int inputNumber = numberScanner.nextInt();

        String string = toCaesar(inputString, inputNumber);

        System.out.println("Mensagem criptografada: " + string);
    }

    public static String toCaesar(String string, int chiper){
        List<Character> alphabet = new ArrayList<>();
        List<Character> letterInString = new ArrayList<>();
        List<Character> newString = new ArrayList<>();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }

        for (int i = 0; i < string.length(); i++){
            char character = string.charAt(i);
            letterInString.add(character);

            int position = alphabet.indexOf(character);
            char stringChiper = alphabet.get((position + chiper) % 26);
            newString.add(stringChiper);
        }

        StringBuilder listToString = new StringBuilder();
        for (Character element : newString){
            listToString.append(element);
        }

        return listToString.toString();
    }
}