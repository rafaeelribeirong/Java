package exercicios;

import java.util.Scanner;

public class DoisNumerosMaisSomaECubo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real: ");
        Double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado 1: " + resultado1);

        System.out.println("Resultado 1: " + resultado2);

        System.out.println("Resultado 1: " + resultado3);

    }
}
