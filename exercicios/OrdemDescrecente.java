package exercicios;

import java.util.Scanner;

public class OrdemDescrecente {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número:");
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            //num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);

        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            //num1 < num3 < num1
            System.out.println(num1 + " - " + num3 + " - " + num1);

        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            //num3 é menor
            //num2 é maior
            //num3 < num1 < num2
            System.out.println(num2 + " - " + num1 + " - " + num3);
    }
}
}