package formulasMatematicas;

import java.util.Scanner;

public class MediaAritmeticaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRA NOTA");
        double nota1 = scanner.nextDouble();

        System.out.println("DIGITE A SEGUNDA NOTA");
        double nota2 = scanner.nextDouble();

        System.out.println("DIGITE A TERCEIRA NOTA");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A MÉDIA DAS NOTAS É: " + media);

        scanner.close();
    }
}
