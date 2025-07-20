package desafios_intermediarios.catalogoStream;

public class Catalogo {
    private String nome;
    private double preco;
    private String categoria;

    public Catalogo(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " (" + categoria + ")";
    }

}
