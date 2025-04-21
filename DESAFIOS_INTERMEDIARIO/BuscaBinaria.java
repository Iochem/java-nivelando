package DESAFIOS_INTERMEDIARIO;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        // Criando um scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo um array ordenado de números
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Solicita ao usuário para inserir o número a ser buscado
        System.out.print("Digite o número a ser buscado: ");
        int numeroBusca = scanner.nextInt();

        // Fecha o scanner após a leitura
        scanner.close();

        // Chama a função de busca binária e exibe o resultado
        int resultado = buscaBinaria(numeros, numeroBusca);

        if (resultado == -1) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Número encontrado na posição: " + resultado);
        }
    }

    // Função de busca binária
    public static int buscaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            // Verifica se o número está no meio do array
            if (arr[meio] == x) {
                return meio; // Número encontrado, retorna o índice
            }

            // Se o número for maior que o meio, busca na metade direita
            if (arr[meio] < x) {
                inicio = meio + 1;
            }
            // Se o número for menor que o meio, busca na metade esquerda
            else {
                fim = meio - 1;
            }
        }

        // Se o número não for encontrado, retorna -1
        return -1;
    }
}

