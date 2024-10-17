package formulasMatematicas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O LADO 'A' DO TRIANGULO");
        double ladoA = scanner.nextDouble();

        System.out.println("DIGITE O LADO 'B' DO TRIANGULO");
        double ladoB = scanner.nextDouble();

        System.out.println("DIGITE O LADO 'C' DO TRIANGULO");
        double ladoC = scanner.nextDouble();

        System.out.println("DIGITE A ALTURA 'H' RELATIVA AO LADO 'B' DO TRIANGULO: ");
        double altura = scanner.nextDouble();
        double perimetro = ladoA + ladoB + ladoC;
        double area = (ladoB * altura) / 2;

        System.out.println("O PERIMETRO DO TRIÂNGULO É" + perimetro);
        System.out.println("A ÁREA DO TRIÂNGULO É" + area);

        scanner.close();
    }
}
