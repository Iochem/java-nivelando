package projetos_intermediarios.registro_com_data.src.registroData;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Service {
    private RegistroRepo repository = new RegistroRepo();
    private Locale localeBR = new Locale("pt", "BR");

    // Adiciona um registro
    public void adicionarRegistro(String nome) {
        Registro registro = new Registro(nome);
        repository.salvar(registro);
        System.out.println("\n📝 Registro concluído: " + nome);
    }

    // Lista todos os registros armazenados no repositório Internacionalizados e formatados
    public void listarRegistros() {
        List<Registro> registros = repository.listar();
        if (registros.isEmpty()) {
            System.out.println("\nNenhum registro encontrado.");
        } else {
            System.out.println("\n=== Lista de Registros ===");
            for (Registro r : registros) {
                // Cria um formatter para a data, hora e dia da semana
                DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
                DateTimeFormatter diaSemanaFormatter = DateTimeFormatter.ofPattern("EEEE", localeBR);

                // Exibe o nome do registro, a data formatada, o dia da semana e a hora
                // Demonstra manipulação de objetos LocalDate/LocalTime e Strings
                String dataFormatada = r.getData().format(dataFormatter);
                String horaFormatada = r.getHora().format(horaFormatter);
                String diaSemana = r.getData().format(diaSemanaFormatter);

                System.out.println(r.getNomeRegistro() + " | "
                        + dataFormatada + " (" + diaSemana + ") | "
                        + horaFormatada);
            }
        }
    }
}

/*
 DATA/HORA
- LocalDate / LocalTime: capturam data e hora atuais.
- DayOfWeek + getDayOfWeek(): obtêm o dia da semana.
- withSecond(0).withNano(0): remove segundos/nanos.
- Locale("pt","BR"): exibe informações em português.
- DateTimeFormatter: formata data (dd/MM/yyyy), hora (HH:mm) e dia da semana (EEEE).
*/