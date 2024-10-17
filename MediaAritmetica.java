package formulasMatematicas;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double numero1 = scanner.nextDouble();

        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double numero2 = scanner.nextDouble();


        double media = (numero1 + numero2) / 2;

        System.out.println("A MÉDIA DOS NÚMEROS É: " + media);

        scanner.close();
    }
}
