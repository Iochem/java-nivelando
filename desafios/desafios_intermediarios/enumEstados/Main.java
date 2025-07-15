package desafios_intermediarios.enumEstados;

public class Main {
    public static void main(String[] args) {

        //Percorrer o enum e imprimir os estados, suas siglas e regiões
        for(EstadosBR e : EstadosBR.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getRegiao());
        }

        System.out.println("\n");

        // Buscar no enum por sigla e imprimir o nome do estado
        EstadosBR estadoBuscado = EstadosBR.fromSigla("RJ");
        if (estadoBuscado != null) {
            System.out.println("Busca por sigla 'RJ': " + estadoBuscado.getNome());
        } else {
            System.out.println("Estado não encontrado para a sigla 'RJ'");
        }

        System.out.println("\n");

        //Pegar uma das constantes já existentes dentro do enum
        EstadosBR eb = EstadosBR.SAO_PAULO;

        //Imprimir a sigla e o nome da constante
        System.out.println(eb.getSigla() + " - " + eb.getNome() + " - " + eb.getRegiao());
        System.out.println(eb.getNomeMaiusculo());
    }
}

