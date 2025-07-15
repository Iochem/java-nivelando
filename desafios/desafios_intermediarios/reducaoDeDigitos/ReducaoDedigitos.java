package desafios_intermediarios;

import java.util.Scanner;

/*
Entrada: 9789
Passos:
- 9 + 7 + 8 + 9 = 33
- 3 + 3 = 6 → resultado final
 */
public class ReducaoDedigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        String numero = sc.nextLine();

        int resultado = somaRepetida(numero);

        System.out.println("Resultado final com um dígito: " + resultado);
        sc.close();
    }

    // Método que faz a soma repetida dos dígitos até sobrar 1 dígito
    public static int somaRepetida(String numero) {
        while (numero.length() > 1) {
            int soma = 0;
            for (char c : numero.toCharArray()) {
                if (Character.isDigit(c)) {
                    soma += c - '0';
                }
            }
            System.out.println("Soma dos dígitos de " + numero + " = " + soma);
            numero = Integer.toString(soma);
        }
        return Integer.parseInt(numero);
    }
}
