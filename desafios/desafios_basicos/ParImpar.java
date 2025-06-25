package desafios_basicos;

//Identificar se o número digitado é par ou ímpar

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        //Tratamento de excessão
        while(true){
           try{
            System.out.print("Digite um número : ");
            numero = scanner.nextInt();
            break;
            } catch (Exception e) {
                System.out.println("Erro: Digite apenas números inteiros ");
                scanner.nextLine(); // Limpa o buffer do scanner
            } 
        }
        
        //Mostra se o númro é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar.");
        }

        scanner.close();
    }
} 

 