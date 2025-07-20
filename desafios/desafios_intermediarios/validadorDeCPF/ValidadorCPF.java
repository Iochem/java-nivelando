package desafios_intermediarios.validadorDeCPF;

import java.util.Scanner;


public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF (somente números): ");
        String cpf = scanner.nextLine().trim();
        scanner.close();

        if (isCpfValido(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    // Método principal de validação
    public static boolean isCpfValido(String cpf) {
        // Remove pontos e traço, se houver
        cpf = cpf.replaceAll("[^\\d]", "");

        // Verifica se tem 11 dígitos ou se todos os dígitos são iguais (ex: 00000000000)
        if (cpf.length() != 11 || cpf.chars().distinct().count() == 1) {
            return false;
        }

        // Calcula os dois dígitos verificadores
        String cpfSemDigitos = cpf.substring(0, 9);
        String digito1 = calcularDigito(cpfSemDigitos, 10);
        String digito2 = calcularDigito(cpfSemDigitos + digito1, 11);

        String cpfCalculado = cpfSemDigitos + digito1 + digito2;

        return cpf.equals(cpfCalculado);
    }

    // Método para calcular cada dígito verificador
    private static String calcularDigito(String base, int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < base.length(); i++) {
            int num = Character.getNumericValue(base.charAt(i));
            soma += num * (pesoInicial - i);
        }

        int resto = soma % 11;
        return (resto < 2) ? "0" : String.valueOf(11 - resto);
    }
}

