package projetos_intermediarios.gestor_de_tarefas.src.gestorTarefas;

public class Tarefa {
    private int id;
    private String nome;
    private Status status;

    public Tarefa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = status.PENDENTE;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return "[" + id + "] " + nome + " (" + status + ")";
    }

}
