package desafios_avancados.enumPolimorfismo;

public class Main {
    public static void main(String[] args) {
        //Testando o enum
        System.out.println(CalculoEnum.SOMA.calcular(5, 3));           // 8.0
        System.out.println(CalculoEnum.SUBTRACAO.calcular(10, 3));         //7
        System.out.println(CalculoEnum.RESTO.calcular(20, 3));          //2

    }
}
