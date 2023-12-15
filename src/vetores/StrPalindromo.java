package vetores;

import java.util.Scanner;

public class StrPalindromo 
{
    
    public void pal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresse com a palavra: ");
        String palavra = sc.nextLine().toLowerCase().replace(" ", "");

        String invertida = "";
        char auxiliar = ' ';
        boolean palindromo = true;

        for (int i = palavra.length() - 1; i >=0 ; i--) 
        {
            auxiliar = palavra.charAt(i);
            //System.out.print(auxiliar + " ");
            invertida += auxiliar;
            
        }
        

        if(palavra.equals(invertida))
        {
            System.out.println("E um palindromo?: " + palindromo);
        }
        else
        {
            System.out.println("E um palindromo?: " + false);
        }
        System.out.println();
        sc.close();
    }
}
