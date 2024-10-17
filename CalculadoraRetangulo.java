package formulasMatematicas;

import java.util.Scanner;

public class CalculadoraRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE A LARGURA DO RETANGULO");
        double largura = scanner.nextDouble();

        System.out.println("DIGITE O COMPRIMENTO DO RETANGULO");
        double comprimento = scanner.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("O PERIMETRO DO RETANGULO É" + perimetro);
        System.out.println("A ÁREA DO RETANGULO É" + area);

        scanner.close();
    }
}
