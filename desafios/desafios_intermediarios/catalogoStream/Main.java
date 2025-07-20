package desafios_intermediarios.catalogoStream;

import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Catalogo> catalogos = List.of(
                new Catalogo("Camisa", 49.99, "Roupas"),
                new Catalogo("Notebook", 2500.00, "Eletrônicos"),
                new Catalogo("Livro matemática", 89.90, "Livros"),
                new Catalogo("Calça", 79.90, "Roupas"),
                new Catalogo("Fone", 199.90, "Eletrônicos"),
                new Catalogo("Livro Spring", 99.90, "Livros"),
                new Catalogo("Camisa", 49.99, "Roupas") // Produto duplicado proposital
        );

        //forEach - Executa uma ação para cada elemento
        System.out.println("\n Todos os catálogos:");
        catalogos.stream()
                .forEach(c -> System.out.println("Dados: " + c));

        //filter - Filtra elementos que satisfazem uma condição
        System.out.println("\n Catálogos com preços inferiores a R$100,00 ");
        List<Catalogo> inferior = catalogos.stream()
                .filter(c -> c.getPreco() < 100)
                .collect(Collectors.toList());
        inferior.forEach(System.out::println);

        System.out.println("\n Catálogos com preços superiores a R$100,00");
        List<Catalogo> superior = catalogos.stream()
                .filter(c -> c.getPreco() > 100)
                .collect(Collectors.toList());
        superior.forEach(System.out::println);

        System.out.println("\n Catálogos na categoria livros:");
        catalogos.stream()
                .filter(c -> c.getCategoria().equalsIgnoreCase("Livros"))
                .forEach(System.out::println);

        // count() - Conta quantos elementos tem na stream retornando um long.
        System.out.print("\n Quantidade total de catálogos: ");
        long total = catalogos.stream().count();
        System.out.print(total);
    }
}

//Stream - É uma sequência abstrata e ordenada de elementos que suporta operações agregadas e em cadeia.