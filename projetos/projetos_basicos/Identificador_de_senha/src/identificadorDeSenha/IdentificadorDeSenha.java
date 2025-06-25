package projetos_basicos.Identificador_de_senha.src.identificadorDeSenha;

//Armazenador e identificador de senha, só pode errar a senha correta 5 vezes
//Código com tratamento de exceções através do try e catch.

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IdentificadorDeSenha{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Criando o Scanner 
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        int senha = 0, num = 0;
            while (true){
                try {
                    System.out.print("Escolha uma senha: ");
                    senha = entrada.nextInt();
                    System.out.println("senha armazenada");
                    break;
                }
                catch (Exception e) { 
                    System.out.println("Digite apenas números inteiros positivos");
                    entrada.next();// limpa o scanner em caso de erro
                }}

        for (int i = 1; i <= 5; i++ ){ // Só errar a senha 5 vezes            
            while (true) {
                try{
                    System.out.print("Digite a senha: ");
                    num = entrada.nextInt(); //Usu digitar, só puxou a var já existente
                    break;
                    }
                catch (Exception e){
                    System.out.println("Digite apenas números inteiros");
                    entrada.next();
                        }
                }  
            if(num == senha) {
                System.out.println("Senha correta");
                break;
            } else {
                System.out.println("invalido");
                System.out.println("tentativa: " + i + " de 5");
                if(i == 5){
                    System.out.print("tentativas esgotadas");
                }}}    
        entrada.close(); // Fechando o Scanner
      }}
//try e catch - para evitar erro caso não digite números inteiros
//scanner - Para o usuário digitar
//Laço for para só poder digitar errado 5 vezes




