package desafios_avancados.ordenacoesEncadeadas;

public class Usuario {
    private String nomeRegistro;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nomeRegistro = nome;
        this.idade = idade;
    }
    public String getNomeRegistro() {return nomeRegistro;}
    public int getIdade(){ return idade; }
    public String toString() {
        return "Nome: " + nomeRegistro + ", Idade: " + idade;
    }
}
