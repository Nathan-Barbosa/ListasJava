import java.util.Scanner;

public class Exer6 {

    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);

        int num = 0, total = 0;


        for(int i = 0; i < 10; i++){
            System.out.println("Insira um número: ");
            num = scan.nextInt();
            total += num;
        }
        scan.close();
        System.out.printf("Total: %.2f", total);
    }
    
}