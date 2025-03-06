public class InversorString{
    public static String inverter(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(inverter("hello")); // 
        System.out.println(inverter("Java"));  // 
    }
}
