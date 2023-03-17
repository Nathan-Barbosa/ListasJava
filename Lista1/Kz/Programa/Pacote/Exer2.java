import java.util.Scanner;
public class Exer2{
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc1.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc1.nextInt();

        float media = ((float)num1 + (float)num2) / 2;
        float metadeDif = ((float)num1 - (float)num2) /2;
        System.out.printf("\nPrimeiro numero: %d\nSegundo número: %d\nMédia: %.2f\nMetade da Diferença: %.2f", num1,num2, media, metadeDif);
        sc1.close();
    }
}