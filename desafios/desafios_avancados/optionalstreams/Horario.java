package desafios_avancados.optionalstreams;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private LocalDate dia;
    private LocalTime hora;
    private boolean disponivel;

    public Horario(LocalDate dia, LocalTime hora, boolean disponivel){
        this.dia = dia;
        this.hora = hora;
        this.disponivel = disponivel;
    }

    public LocalDate getDia() { return dia; }
    public LocalTime getHora() { return hora; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
}
