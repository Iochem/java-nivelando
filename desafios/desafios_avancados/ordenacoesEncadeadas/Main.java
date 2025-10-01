package desafios_avancados.ordenacoesEncadeadas;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Ana", 25),
                new Usuario("Bruno", 17),
                new Usuario("Carlos", 25),
                new Usuario("Daniel", 20)
        );

        Ordenacoes ordenacoes = new Ordenacoes();
        ordenacoes.ordernar(usuarios);
    }

}

