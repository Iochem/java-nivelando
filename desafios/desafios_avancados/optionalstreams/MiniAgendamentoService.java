package desafios_avançados.optionalStreams;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class MiniAgendamentoService {

    private final List<Horario> horarios;

    public MiniAgendamentoService(List<Horario> horarios) {
        this.horarios = horarios;
    }

    // Ocupar horário de forma funcional (true se conseguiu, false caso não exista ou já ocupado)
    public boolean isOcuparHorario(LocalDate dia, LocalTime hora){
        // Filtra a lista para encontrar o primeiro horário disponível que coincida com dia e hora
        Optional<Horario> horariosOpt = horarios.stream()
                .filter(h -> h.getDia().equals(dia) && h.getHora().equals(hora) && h.isDisponivel())
                .findFirst() ;

        // Se o horário existir como disponível, marca como indisponível
        horariosOpt.ifPresent(h -> h.setDisponivel(false));

        // Se a lista filtrada estiver vazia returna false se não retorna true
        return horariosOpt.isPresent();
    }

    // Desocupar um horário de forma funcional
    public boolean isDesocuparHorario(LocalDate dia, LocalTime hora){
        // Usando optional implicitamente com .map e orElse ao invés de isPresent e ifPresent
        return horarios.stream()
                .filter(h -> h.getDia().equals(dia) && h.getHora().equals(hora) && !h.isDisponivel())
                .findFirst()
                .map(h -> { h.setDisponivel(true); return true; }) // Modifica se existir e retorna true
                .orElse(false);   // Retorna false se não existir
    }

 /*
Conceitos usados:

- Optional: Contêiner que pode conter valor ou não (evita null).
- isPresent(): Verifica se o optional existe valor, retornando true ou false.
- ifPresent(): Executa ação se valor existir, retorna Optional<Horario>
- Stream: Processa coleções de forma funcional.
- findFirst(): Pega o 1º elemento que atende ao filtro.
- map(): Transforma valor dentro do Optional.
- orElse(): Retorna valor padrão se Optional vazio.
*/

}
