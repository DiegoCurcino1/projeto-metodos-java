public class Fatorial {
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));
        System.out.println(calcularFatorial(0));
    }
}
