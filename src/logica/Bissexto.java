package logica;

import java.util.Scanner;

public class Bissexto {
    
    public static void main(String[]  args) {

        Scanner sc = new Scanner(System.in);

        int ano;
        System.out.println("Entre com um ano para consultar: ");
        ano = sc.nextInt();

        if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
            System.out.println("Ano bissexto");
        }else{
            System.out.println("It's not bissexto");
        }
        sc.close();

    }
}
