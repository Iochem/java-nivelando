package desafios_basicos;

//Calculadora simples Java.
//Permite operações básicas: adição, subtração, multiplicação e divisão.

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        // Entrada do operador
        System.out.print("Digite o operador (+, -, *, /): ");
        String op = entrada.next();

        // Entrada do segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        switch (op) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

       entrada.close(); 
    }
}
