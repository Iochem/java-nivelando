package desafios_avancados.funcoesAltaOrdem;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PromocaoAvancada {
    public void processarClientes(List<Cliente> clientes){

        // Filtra os clientes ativos e maiores de 18 anos
        Predicate<Cliente> elegivel = c -> c.isAtivo() && c.getIdade() >= 18;

        //Transformar nome em maiusculo
        Function<Cliente, String> nomeMaiusculo = c -> c.getNome().toUpperCase();

        // Define ação para enviar promoção
        Consumer<String> promocao = nome -> System.out.println("Enviar promoção para " + nome);

        // Processa os clientes elegíveis
        for (Cliente c : clientes){
            if (elegivel.test(c)){
                String nome = nomeMaiusculo.apply(c);
                promocao.accept(nome);
            }
        }
    }
}

/*
Conceitos usados:

- Predicate<T>: Representa uma função que retorna true ou false para um objeto T (usado para filtrar clientes elegíveis).
- Function<T, R>: Representa uma função que transforma um objeto T em um objeto R (usado para transformar nomes em maiúsculo).
- Consumer<T>: Representa uma ação que consome um objeto T sem retornar nada (usado para enviar promoção/printar no console).
- For-each loop: Itera sobre coleções de forma simples, aplicando lógica para cada elemento.
- Encapsulamento e getters/setters: Mantém os atributos privados e permite acesso controlado aos dados.
- Separação de responsabilidades: Classe `PromocaoAvancada` processa a lógica, `Main` apenas cria e passa a lista de clientes.
*/
