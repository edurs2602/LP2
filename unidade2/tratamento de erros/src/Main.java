import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static List<Integer> lerDoArquivo(String nome) throws ErrorHandling {
        List<Integer> numeros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nome))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linha.trim());
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    throw new ErrorHandling("Erro ao converter para inteiro: " + linha);
                }
            }

        } catch (IOException | ErrorHandling e) {
            throw new ErrorHandling("Erro de leitura do arquivo: " + e.getMessage());
        }

        return numeros;
    }

    public static void main(String[] args) {
        String nomeArquivo = "/home/eduardo/Documentos/UF/lp2/unidade2/tratamento de erros/arquivoNum.txt";

        try {
            List<Integer> numerosLidos = lerDoArquivo(nomeArquivo);
            System.out.println("Números lidos do arquivo: " + numerosLidos);

            int soma = numerosLidos.stream().mapToInt(Integer::intValue).sum();

            System.out.println("E a soma dos números da: " + soma);
        } catch (ErrorHandling e) {
            System.err.println("Erro personalizado: " + e.getMessage());
        }
    }

}