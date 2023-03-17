import java.util.Scanner;

public class Exer4 {
    public static void main(String args[]){
        float sal = 0;
        float off = 0;
        float liq = 0;
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite seu salário: ");    
        sal = scan.nextFloat();
        scan.close();
        off = sal * (float)0.08;
        liq = sal - off;

        System.out.printf("Bruto: %.2f\nDesconto: %.2f\nLiquido: %.2f", sal,off,liq);
    }
    
}
