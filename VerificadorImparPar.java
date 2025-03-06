public class VerificadorImparPar {
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPar(4)); // true
        System.out.println(isPar(7)); // false
    }
}
