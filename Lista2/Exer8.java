import java.util.Scanner;

public class Exer8 {

    public static void main(String ...args){
        int MAX = 10;
        Scanner scan = new Scanner(System.in);

        int num = 0, maior = 0;


        for(int i = 0; i < MAX; i++){
            System.out.println("Insira um numero: ");
            num = scan.nextInt();
            if(num > maior){
                maior = num;
            }
        }
   
        scan.close();
        System.out.printf("Total: %d", num);
    }
    
}