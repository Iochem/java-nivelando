package desafios_avançados.optionalStreams;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Horario> listaHorarios = new ArrayList<>();

        // Instanciando horários
        listaHorarios.add(new Horario(LocalDate.of(2025, 9, 3), LocalTime.of(14, 0), true));
        listaHorarios.add(new Horario(LocalDate.of(2025, 9, 3), LocalTime.of(16, 0), true));
        listaHorarios.add(new Horario(LocalDate.of(2025, 9, 4), LocalTime.of(15, 0), true));

        // Criando serviço
        MiniAgendamentoService servico = new MiniAgendamentoService(listaHorarios);

        // Testando
        boolean ocupou = servico.isOcuparHorario(LocalDate.of(2025, 9, 3), LocalTime.of(14, 0));
        System.out.println("Horário ocupado? " + ocupou);

        boolean desocupou =  servico.isDesocuparHorario(LocalDate.of(2025, 9, 3), LocalTime.of(14, 0));
        System.out.println("Horário desocupado? " + desocupou); // true

        boolean desocupou2 =  servico.isDesocuparHorario(LocalDate.of(2025, 9, 3), LocalTime.of(16, 0));
        System.out.println("Horário desocupado? " + desocupou2); // false

    }
}
