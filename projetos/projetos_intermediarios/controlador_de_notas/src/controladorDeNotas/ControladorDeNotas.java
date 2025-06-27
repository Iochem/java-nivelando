package projetos_intermediarios.controlador_de_notas.src.controladorDeNotas;

public class ControladorDeNotas {
    private final Aluno aluno;
    private String nomeMateria;
    private int quantidade;
    private float media;
    private float somaNotas;

    public ControladorDeNotas(Aluno aluno){
        this.aluno = aluno;
        this.quantidade = 0;
        this.media = 0;
        this.somaNotas = 0;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String materia) {
        this.nomeMateria = materia;
    }

    public float getMedia() {
        return media;
    }

    public void adicionarNotas(float notas){
        if (nomeMateria == null) {
            throw new MateriaNaoDefinidaException("Não é possível adicionar nota sem definir a matéria.");
        }

        //Somando as notas
        this.somaNotas += notas;
        //Calcular a quantidade total para fazer a media
        this.quantidade ++;
    }

    public void calcularMedia(){
        if (nomeMateria == null) {
            throw new MateriaNaoDefinidaException("Matéria não definida.");
        }
        if (quantidade == 0) {
            throw new NotaOuMediaInexistenteException("Nenhuma nota adicionada. Não é possível calcular média.");
        }
        this.media = somaNotas/quantidade;
        this.aluno.adicionarMateriaEMedia(nomeMateria, media);
    }

    public String aprovadoReprovado(float media) {
        if (media >= 7) {
            return " Aprovado!";
        } else {
            return " Reprovado!";
        }
    }

    public void materiasENotasAnexadas(){
        if (nomeMateria == null) {
            throw new MateriaNaoDefinidaException("Matéria não definida.");
        }
        if (quantidade == 0) {
            throw new NotaOuMediaInexistenteException("Nenhuma nota adicionada ainda");
        }
        if(this.media == 0){
            throw new NotaOuMediaInexistenteException("Media ainda não calculada");
        }
        //Percorrer pelas chaves
        for (String nomeMateria : aluno.materias.keySet()) {
            float mediaMateria = aluno.materias.get(nomeMateria);
            System.out.println("Matéria: " + nomeMateria + " | Média: " + mediaMateria + " | Resultado: " + aprovadoReprovado(mediaMateria));
        }
    }
}
