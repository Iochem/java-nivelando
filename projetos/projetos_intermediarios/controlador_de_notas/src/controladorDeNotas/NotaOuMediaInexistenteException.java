package projetos_intermediarios.controlador_de_notas.src.controladorDeNotas;

public class NotaOuMediaInexistenteException extends RuntimeException {
    public NotaOuMediaInexistenteException(String message) {
        super(message);
    }
}
