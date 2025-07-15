package desafios_intermediarios.enumEstados;

public enum EstadosBR {
    SAO_PAULO("SP", "São Paulo", "Sudeste"),
    RIO_JANEIRO("RJ", "Rio de Janeiro", "Sudeste"),
    PIAUI("PI", "Piauí", "Nordeste"),
    MARANHAO("MA", "Maranhão", "Nordeste");

    private String sigla;
    private String nome;
    private String regiao;

    private EstadosBR(String sigla, String nome, String regiao){
        this.sigla = sigla;
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao(){
        return regiao;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase(); //Transformar o nome em maiusculo
    }

    // Método para obter um estado pela sigla e imprimir o nome
    public static EstadosBR fromSigla(String sigla) {
        for (EstadosBR estado : EstadosBR.values()) {
            if (estado.getSigla().equalsIgnoreCase(sigla)) {
                return estado;
            }
        }
        return null;
    }
}

/*
- Assim como int é um tipo de dado,o enum  também é, só que um  tipo especial de dado definido pelo desenvolvedor
- Os objetos do enum são criados automaticamente, sem precisar de `new`.
- O método values() retorna um array com todos os valores (constantes) do enum.
- Enums podem ter atributos, métodos e construtor, como uma classe comum.
- Os objetos são previamente criados.Disponível por tada a aplicação.
*/


