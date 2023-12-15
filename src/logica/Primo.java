package logica;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int qtddiv = 0;
        System.out.print("Entre com um nurero inteiro: " + " ");
        num = sc.nextInt();

        System.out.print(num + " possui os seguintes divisores: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print( i + " ");
                qtddiv +=1;
            }
             
            
            

        }
        // System.out.println(qtddiv);
        System.out.println();
        if (qtddiv == 2){
                System.out.println("the number " + num + " is prime");
            }else{
                System.out.println("the number " + num + " is not prime");
            }
        sc.close();

    }
}
