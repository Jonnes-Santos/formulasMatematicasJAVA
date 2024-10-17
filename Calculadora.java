package formulasMatematicas;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double numero1 = scanner.nextDouble();

        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);
        System.out.println("DIVISÃO: " + divisao);

        scanner.close();
    }
}

