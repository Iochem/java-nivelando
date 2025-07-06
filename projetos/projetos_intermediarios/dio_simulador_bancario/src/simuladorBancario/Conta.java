package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

/*
 * Classe base para contas bancárias.
 */

public abstract class Conta{
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Adiciona saldo à conta.
    public void adicionar(double aplicacao){
        saldo += aplicacao;
        System.out.println("Aplicação de R$ " + aplicacao + " realizada com sucesso");
    }
    //Realiza retirada de saldo, se houver saldo suficiente.
    public void remover(double retirada) throws SaldoNegativoException{
        if (saldo < retirada){
            throw new SaldoNegativoException("Saldo insuficiente para realizar a retirada");
        } else{
            saldo -= retirada;
            System.out.println("Retirada de R$ " + retirada + " Realizada com sucesso");
        }
    }

    public abstract void transferencia(double valor) throws LimiteOperacaoException, SaldoNegativoException;

    public abstract void receberTransferencia(double valor);
}

