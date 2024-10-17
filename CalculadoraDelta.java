package formulasMatematicas;

import java.util.Scanner;

public class CalculadoraDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O VALOR DE 'A' ");
        double a = scanner.nextDouble();

        System.out.println("DIGITE O VALOR DE 'B' ");
        double b = scanner.nextDouble();

        System.out.println("DIGITE O VALOR DE 'C' ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O DELTA DA EQUAÇÃO É: " + delta);

        scanner.close();
    }
}
