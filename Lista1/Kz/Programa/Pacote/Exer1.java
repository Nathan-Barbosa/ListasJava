import java.util.Scanner;

public class Exer1 {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite um valor para saber seu dobro: ");
        int v = sc1.nextInt();
        System.out.printf("\nO dobro de %d, é: %d",v, v*2);
        sc1.close();
    }
}