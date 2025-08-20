package projetos_intermediarios.gestor_de_tarefas.src.gestorTarefas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoService {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(String nome) {
        tarefas.add(new Tarefa(proximoId++, nome));
    }

    public void listarTodas(){
        tarefas.stream()
                .forEach(t ->System.out.println("Tarefas: " + t));
    }

    public void listarPorStatus(String statusEscolha){
        //Verifica se existe tarefas nesse status escolhido
        boolean existe = Arrays.stream(Status.values())
                .anyMatch(s -> s.name().equalsIgnoreCase(statusEscolha));
        if(!existe){
            System.out.println("Nenhuma tarefa encontrada em: " + statusEscolha);
            return; // Encerra o método, evita filtrar uma lista vazia
        }

        //Filtra por status e imprime
        List<Tarefa> filtradas = tarefas.stream()
                .filter(t -> t.getStatus().name().equalsIgnoreCase(statusEscolha))
                .collect(Collectors.toList());

        filtradas.forEach(System.out::println);
    }

    public void alterarStatus(int idTarefa, String novoStatus){
        //Verifica se status escolhido existe
        if (Arrays.stream(Status.values())
                .noneMatch(s -> s.name().equalsIgnoreCase(novoStatus))) {
            System.out.println("Status inválido! Operação cancelada.");
            return;
        }

        //Converter String para enum
        Status novoSt = Status.valueOf(novoStatus.toUpperCase());

        //Verifica se ID existe
        boolean verificarExistencia = tarefas.stream().anyMatch(cliente -> cliente.getId() == idTarefa);

        if (!verificarExistencia) {
            System.out.println("ID não encontrado para a modificação de status.");
            return;
        }

        //Atualizar o status da tarefa com as streams filter, findFirst e ifPresent
        tarefas.stream()
                .filter(t -> t.getId() == idTarefa)
                .findFirst()
                .ifPresent(t -> {
                    t.setStatus(novoSt);
                    System.out.println("Status atualizado: " + t);
                });
    }

    public void excluir(int idTarefa){
        //Verifica se ID existe
        boolean verificarExistencia = tarefas.stream().anyMatch(cliente -> cliente.getId() == idTarefa);

        if (verificarExistencia) {
            System.out.println("Encontrado!");
            System.out.println("Tarefa com o ID: " + idTarefa + " Excluido!");
            //Se existir exclui
            tarefas.removeIf(t -> t.getId() == idTarefa);
        } else {
            System.out.println("Id: "+ idTarefa + " não encontrado para a exclusão");
        }
    }

}
