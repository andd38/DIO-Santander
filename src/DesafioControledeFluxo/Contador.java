package DesafioControledeFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        recenbendoNums(num1,num2);

    }
    public static String recenbendoNums(int num1 , int num2){

        for (int i = num1; i <= num2 ; i++) {
            if(num1> num2) {
                throw new ParametrosInvalidosException(" 1° numero  deve ser maior que o 2° numero");
            }

            System.out.println("Imprimindo o numero " + i);
        }
        

        return "Error";


    }
}
