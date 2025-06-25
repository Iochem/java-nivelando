package desafios_basicos;

//Vai imprimir a quantidade de palavras, consoantes e vogais
import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        // Criando um scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir uma frase
        System.out.print("Digite uma frase:");
        String frase = scanner.nextLine();

        // Fecha o scanner após a leitura
        scanner.close();

        // Contador de palavras
        String[] palavras = frase.trim().split("\\s+");
        int numPalavras = palavras.length;
        
        // Contadores de vogais e consoantes
        int numVogais = 0;
        int numConsoantes = 0;

        // Conjunto de vogais para verificação
        String vogais = "aeiouAEIOU";

        // Percorrendo cada caractere da frase para contar as vogais e consoantes
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {  // Verifica se o caractere é uma letra
                if (vogais.indexOf(c) != -1) {
                    numVogais++;
                } else {
                    numConsoantes++;
                }
            }
        }

        // Exibindo os resultados
        System.out.println("Número de palavras: " + numPalavras);
        System.out.println("Número de vogais: " + numVogais);
        System.out.println("Número de consoantes: " + numConsoantes);
    }
}

