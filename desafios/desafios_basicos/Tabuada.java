package desafios_basicos;

//Exibe a tabuada de um número inteiro positivo informado pelo usuário

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner tabuada = new Scanner(System.in);
        System.out.print("Digite um número positivo inteiro para receber a tabuada: ");
        int num = tabuada.nextInt();
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
        tabuada.close();
    }
    
}
