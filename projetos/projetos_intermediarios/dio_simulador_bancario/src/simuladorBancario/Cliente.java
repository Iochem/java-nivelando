package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

/*
- Representa um cliente do banco.
*/

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

