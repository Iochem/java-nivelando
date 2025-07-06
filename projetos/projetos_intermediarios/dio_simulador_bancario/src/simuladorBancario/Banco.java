package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

import java.util.Scanner;

/**
 - Classe principal que simula o funcionamento de um sistema bancário simples.
 - Permite criar um cliente e realizar operações em Conta Corrente e Conta Poupança.
 */

public class Banco {
    public static void main(String[] args) {
        Scanner simulador = new Scanner(System.in);
        System.out.print("\nDigite o nome do cliente");
        String nomeCliente = simulador.nextLine().toLowerCase();

        System.out.print("\nDigite o CPF do cliente");
        String cpfCliente = simulador.nextLine().toLowerCase();

// Instanciando cliente e contas
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        ContaCorrente corrente = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        int opcao;
        double retirada;
        double aplicacao;
        double valorTransferencia;

        int tipoConta;
        Conta contaSelecionada = null;

// Menu principal de escolha da conta
        do {
            System.out.println("\nEscolha a conta para operar:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");
            tipoConta = simulador.nextInt();

            if (tipoConta == 1) {
                contaSelecionada = corrente;
            } else if (tipoConta == 2) {
                contaSelecionada = poupanca;
            } else {
                System.out.println("Tipo inválido. Tente novamente.");
            }

// Submenu de operações bancárias
            if(tipoConta != 3){
                do {
                    System.out.println("---MENU---");
                    System.out.println("1 - Fazer uma aplicação");
                    System.out.println("2 - Fazer uma retirada");
                    System.out.println("3 - Consultar saldo");
                    System.out.println("4 - Fazer uma transferência");
                    System.out.println("0 - Voltar ao menu anterior");
                    System.out.print("Escolha uma opção:");
                    opcao = simulador.nextInt();

                    switch(opcao){
                        case 1:
                            System.out.println("\nDigite quanto pretende aplicar");
                            aplicacao = simulador.nextDouble();
                            contaSelecionada.adicionar(aplicacao);
                            break;
                        case 2:
                            try{
                                System.out.println("\nDigite quanto pretende retirar");
                                retirada = simulador.nextDouble();
                                contaSelecionada.remover(retirada);
                            } catch(SaldoNegativoException e){
                                System.out.println(e.getMessage());
                            }

                            break;
                        case 3:
                            System.out.println("\nSeu saldo atual é de :"  );
                            System.out.println(contaSelecionada.getSaldo());
                            break;
                        case 4:
                            try{
                                System.out.println("\nInforme qual o valor que pretende transferir:"  );
                                valorTransferencia = simulador.nextDouble();
                                contaSelecionada.transferencia(valorTransferencia);
                                contaSelecionada.receberTransferencia(valorTransferencia);
                            } catch (SaldoNegativoException e) {
                                System.out.println("Erro de saldo: " + e.getMessage());
                            } catch (LimiteOperacaoException e) {
                                System.out.println("Erro de limite de operações: " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.print("Opção inválida! Tente novamente");
                    }
                }while(opcao != 0);
            }
        } while (tipoConta != 3);

        System.out.println("\nObrigado por utilizar o banco, " + cliente.getNome() + "!");
        System.out.println("Seu CPF: " + cliente.getCpf());
        simulador.close();
    }
}


