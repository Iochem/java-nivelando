package desafios_avancados.ordenacoesEncadeadas;

import java.util.Comparator;
import java.util.List;

public class Ordenacoes {
    public void ordernar(List<Usuario> usuarios){

        //Encadeamento por nome ou idade por ordem crescente
        System.out.println("Lista ordenadas nome ou idade por ordem crescente");
        usuarios.stream()
                .sorted(
                        Comparator.comparing(Usuario::getIdade)
                                .thenComparing(Usuario::getNomeRegistro)
                )
                .forEach(System.out::println);

        //Encadeamento por nome ou idade por ordem decrescente
        System.out.println("Lista ordenadas nome ou idade por ordem decrescente");
        usuarios.stream()
                .sorted(
                        Comparator.comparing(Usuario::getIdade).reversed()
                                .thenComparing(Usuario::getNomeRegistro).reversed()
                )
                .forEach(System.out::println);

        //Encadeamento por tipo primitivo
        System.out.println("Lista ordenadas por tipo primitivo  ");
        usuarios.stream()
                .sorted(
                        Comparator.comparingInt(Usuario::getIdade)
                )
                .forEach(System.out::println);
    }
}

/*
Conceitos usados:

- Comparator.comparing: Recebe uma função que diz qual atributo usar na comparação.
- thenComparing: Encadeia um segundo critério (desempate).
- Comparator.comparingInt(): Encadeamento com tipo primitivo.
- sorted: ordena os elementos do stream
*/
