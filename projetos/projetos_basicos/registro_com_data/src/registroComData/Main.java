package projetos_basicos.registro_com_data.src.registroComData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criando uma localidade específica para o Brasil:
        Locale localeBR = new Locale("pt", "BR");

        System.out.println("=== Sistema de Registro com Data ===");

        System.out.print("Digite o registro: ");
        String nome = sc.nextLine();

        // Captura a data e hora atuais
        LocalDate dataRegistro = LocalDate.now();
        LocalTime horaRegistro = LocalTime.now();

        // Exibe a confirmação
        System.out.println("\n📝 Registro concluído com sucesso!");
        System.out.println("Nome do registro: " + nome);
        System.out.println("Data do registro: " + dataRegistro);
        System.out.println("Dia da semana: " + dataRegistro.getDayOfWeek().getDisplayName(TextStyle.FULL, localeBR));
        System.out.println("Horário do registro: " + horaRegistro.withSecond(0).withNano(0)); // Remove segundos e nanos

        sc.close();
    }
}

/*
- Locale define como o Java deve exibir nomes de meses, dias da semana, moedas, datas
- usado com TextStyle para mostrar nomes em português
 */
