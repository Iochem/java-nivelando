package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

/*
Conta Poupança:
- Não permite cheque especial
- Não permite saldo negativo.
- Tem limite de valor por operação (ex: R$2000 por transferência).
- Tem limite de quantidade diária (ex: 3 saques)
*/

public class ContaPoupanca extends Conta{
    private int limiteValorTrasferencia = 3;
    private int numeroTransferencia = 0;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferencia(double valorTransferencia) throws LimiteOperacaoException {
        if (valorTransferencia > 2000) {
            throw new LimiteOperacaoException("Valor máximo de R$2000 por transferência excedido.");
        }

        if (numeroTransferencia < limiteValorTrasferencia) {
            numeroTransferencia++;
            saldo -= valorTransferencia;
            System.out.println("Transferência realizada com sucesso");
        } else {
            throw new LimiteOperacaoException("Limite de transferências diárias excedido");
        }
    }

    @Override
    public void receberTransferencia(double valorTransferencia){
        saldo += valorTransferencia;
    }
}


