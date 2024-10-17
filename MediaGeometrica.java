package formulasMatematicas;

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double numero1 = scanner.nextDouble();

        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double numero2 = scanner.nextDouble();

        System.out.println("DIGITE O TERCEIRO NÚMERO");
        double numero3 = scanner.nextDouble();

        double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);

        System.out.println("A MÉDIA GEOMETRICA DOS NÚMEROS É: " + mediaGeometrica);

        scanner.close();
    }
}
