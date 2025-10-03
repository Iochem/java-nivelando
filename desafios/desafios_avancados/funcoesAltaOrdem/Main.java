package desafios_avancados.funcoesAltaOrdem;

import java.security.Provider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static PromocaoAvancada promocaoService = new PromocaoAvancada();
    public static void main(String[] args) {
        Map<String, Cliente> clientesMap = new HashMap<>();

        clientesMap.put("Ana", new Cliente("Ana", 22, true));
        clientesMap.put("João", new Cliente("João", 17, false));
        clientesMap.put("Bia", new Cliente("Bia", 33, true));
        clientesMap.put("Carlos", new Cliente("Carlos", 15, true));
        clientesMap.put("Maria", new Cliente("Maria", 25, false));


        // Passa a lista para o Service
        promocaoService.processarClientes(clientesMap);

    }
}
