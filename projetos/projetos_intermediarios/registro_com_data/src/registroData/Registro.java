package projetos_intermediarios.registro_com_data.src.registroData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    private String nomeRegistro;
    private LocalDate data;
    private LocalTime hora;
    private DayOfWeek diaDaSemana;

    public Registro(String nome) {
        this.nomeRegistro = nome;
        this.data = LocalDate.now(); // pega a data atual automaticamente
        this.hora = LocalTime.now(); // pega a hora atual automaticamente
        this.diaDaSemana = data.getDayOfWeek(); // Obtém dia da semana automaticamente
    }

    public String getNomeRegistro(){ return nomeRegistro;}
    public LocalDate getData(){return data;}
    public LocalTime getHora(){ return hora; }
    public void setNomeRegistro(String nomeRegistro){this.nomeRegistro = nomeRegistro;}
    public void setData(LocalDate data){this.data = data;}
    public void setHora(LocalTime hora){this.hora = hora;}
    public DayOfWeek getDiaDaSemana(){return diaDaSemana;}

    @Override
    public String toString() {
        return nomeRegistro + " | " + data + " (" + data.getDayOfWeek() + ") | " + hora.withSecond(0).withNano(0) + " | " + diaDaSemana;
    }
}
