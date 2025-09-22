package desafios_avancados.funcoesAltaOrdem;

import java.security.Provider;
import java.util.ArrayList;

public class Main {
    private static PromocaoAvancada promocaoService = new PromocaoAvancada();
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Add a few sample clients to demonstrate the functionality
        clientes.add(new Cliente("Ana", 22, true));
        clientes.add(new Cliente("João",17, false));
        clientes.add(new Cliente("Bia", 33, true));
        clientes.add(new Cliente("Carlos", 15, true));
        clientes.add(new Cliente("Maria", 25, false));

        // Passa a lista para o Service
        promocaoService.processarClientes(clientes);

    }
}
