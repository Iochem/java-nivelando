package projetos_intermediarios.registro_com_data.src.registroData;

import java.util.ArrayList;
import java.util.List;

public class RegistroRepo {

    private List<Registro> registros = new ArrayList<>();

    public void salvar(Registro registro) {
        registros.add(registro);
    }

    public List<Registro> listar() {
        return registros;
    }
}
