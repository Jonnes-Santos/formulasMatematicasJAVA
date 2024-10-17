package formulasMatematicas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PESO EM QUILOGRAMAS");
        double peso = scanner.nextDouble();

        System.out.println("DIGITE A ALTURA EM METROS");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
}
