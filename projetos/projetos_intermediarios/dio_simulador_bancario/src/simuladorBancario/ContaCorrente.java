package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

/*
Conta Corrente:
- Permite saldo negativo (até o limite, ex: -500).
- Não tem limite de valor por operação.
- Não tem limite de quantidade de operações.
*/

public class ContaCorrente extends Conta{
    private double limite = -500.00; // pode ir até -500 - cheque especial
    private double taxaJuros = 0.02;

    public ContaCorrente(Cliente cliente) { //O construtor não é herdado automaticamente
        super(cliente);
    }

    @Override
    public void remover(double retirada) throws SaldoNegativoException {
        if (saldo - retirada >= limite) {
            saldo -= retirada;
            System.out.println(retirada + "Retirada realizada com sucesso.");

            // Aplica juros se estiver no negativo
            if (saldo < 0) {
                double juros = saldo * taxaJuros; // saldo já é negativo
                saldo += juros; // juros é negativo, reduz mais ainda o saldo
                System.out.println("Juros aplicados por conta de saldo negativo: R$ " + Math.abs(juros));
            }
        } else {
            throw new SaldoNegativoException("Limite do cheque especial excedido.");
        }
    }

    @Override
    public void transferencia(double valorTransferencia) throws LimiteOperacaoException, SaldoNegativoException{
        if(saldo - valorTransferencia >= limite){
            saldo -= valorTransferencia;
            System.out.println(valorTransferencia + "Transferência realizada com sucesso");

            // Aplica juros se estiver no negativo
            if (saldo < 0){
                double juros = saldo * taxaJuros; // saldo já é negativo
                saldo += juros; // juros é negativo, reduz mais ainda o saldo
                System.out.println("Juros aplicados por conta de saldo negativo: R$ " + Math.abs(juros));
            }
        }else{
            throw new SaldoNegativoException("Limite do cheque especial excedido.");
        }
    }

    @Override
    public void receberTransferencia(double valorTransferencia){
        saldo += valorTransferencia;
    }
}



