package desafios_avancados.enumPolimorfismo;

public enum CalculoEnum {
    SOMA{
        @Override
        public double calcular(double a, double b){
            return a + b;
        }
    },

    SUBTRACAO {
        @Override
        public double calcular(double a, double b){
            return a - b;
        }
    },

    RESTO{
        @Override
        public double calcular(double a, double b){
            return a % b;
        }
    };

    // Método abstrato que cada constante deve implementar
    public abstract double calcular(double a, double b);
}

 /*
Conceitos usados: Métodos abstratos e polimorfismo no enum:

- Enum: Estrutura que representa um conjunto fixo de constantes.
- Polimorfismo: Cada constante pode ter comportamento diferente dentro do enum.
- Método abstrato: Cada constante deve implementar individualmente → polimorfismo interno.
- @Override: Em enum com método abstrato → indica que a constante está implementando o método abstrato do enum.

*/

