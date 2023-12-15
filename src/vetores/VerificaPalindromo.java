package vetores;

import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Entre com o tamanho do array: ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Entre com " + size + " values in  array: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        boolean palindromo = true;
        for (int i = 0; i < (arr.length) / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                palindromo = false;
                 
            }

            else{
                palindromo = true;
            }
        }
        
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        if (palindromo) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

        sc.close();
    }

}
