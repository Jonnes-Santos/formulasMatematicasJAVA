package formulasMatematicas;

import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O RAIO DO CIRCULO");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A AREA DO CIRCULO É " + area);

        scanner.close();

    }
}
