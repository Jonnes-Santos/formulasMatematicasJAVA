package formulasMatematicas;

import java.util.Scanner;

public class CalculadoraPerimetroCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O RAIO DO CÍRCULO");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O PERIMETRO DO CALCULO É " + perimetro);

        scanner.close();
    }
}
