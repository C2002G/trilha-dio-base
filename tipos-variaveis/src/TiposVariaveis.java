public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
            double salario = 1250.50;

            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal; // Casting necessário para converter int para short

            int numero = 5;
            numero = 10; // Reatribuição de valor a uma variável já declarada
            // System.out.println(numero); // Saída: 10

            final double VALOR_PI = 3.14; // Constante, não pode ser reatribuída e tem q ser em caixa alta
            // PI = 3.1415; // Erro: não pode reatribuir valor a uma variável final

            System.out.print(VALOR_PI); // Saída: 3.14
    }
}
