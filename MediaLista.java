import java.util.List;

public class MediaLista{
    public static double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
        }
        
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        
        return soma / numeros.size();
    }

    public static void main(String[] args) {
        List<Double> numeros = List.of(10.0, 20.0, 30.0, 40.0);
        System.out.println(calcularMedia(numeros)); 
    }
}
