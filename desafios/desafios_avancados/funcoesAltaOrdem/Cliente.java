package desafios_avancados.funcoesAltaOrdem;

public class Cliente {
    private String nome;
    private int idade;
    private boolean ativo;

    public Cliente(String nome, int idade, boolean ativo){
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;
    }

    public String getNome(){ return nome; }
    public boolean isAtivo(){ return ativo; }
    public void setAtivo(boolean ativo){ this.ativo = ativo; }
    public int getIdade(){ return idade; }
    public void setIdade(int idade){ this.idade = idade; }

}
