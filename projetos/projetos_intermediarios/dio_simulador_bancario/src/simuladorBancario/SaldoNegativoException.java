package projetos_intermediarios.dio_simulador_bancario.src.simuladorBancario;

public class SaldoNegativoException extends RuntimeException {
    public SaldoNegativoException(String message) {
        super(message);
    }
}
