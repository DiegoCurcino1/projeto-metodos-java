public class ContarVogais {
    public static int contarVogais(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String vogais = "aeiouAEIOU";
        
        for (char c : str.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(contarVogais("Hello World")); 
        System.out.println(contarVogais("Java"));        
        System.out.println(contarVogais("BCDFG"));       
    }
}
