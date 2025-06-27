package projetos_intermediarios.controlador_de_notas.src.controladorDeNotas;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    Map<String, Float> materias = new HashMap<>();
    private final String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Map<String, Float> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<String, Float> materias) {
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMateriaEMedia(String nomeMateria, float media){
        materias.put(nomeMateria, media);
    }

}
