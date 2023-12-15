package vetores;

public class Vetor22 
{
    public static void main(String[] args) 
    {
        int[] vetorA = new int[10];
        double qtd0 = 0;
        double qtd1 = 0;
        
        //Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) 
        {
            vetorA[i] = (int)Math.round(Math.random() * 1);
            
        }
        System.out.println();
        System.out.print("vetorA = ");
        for (int i = 0; i < vetorA.length; i++) 
        {
            System.out.print(vetorA[i] +" ");

            if (vetorA[i] == 0) 
            {
                qtd0++;
            }
            else
            {
                qtd1++;
            }
            
        }
        System.out.println();

        double porcent0 =(qtd0*100) / vetorA.length;
        double porcent1 =(qtd1*100) / vetorA.length;
        
        System.out.println();

       
        System.out.println("Percetual de numeros zeros(0) " + porcent0);
        System.out.println("Percetual de numeros um(1) " + porcent1);
        
    }
}
