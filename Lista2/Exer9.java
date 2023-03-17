import java.util.Scanner;

public class Exer9 {

    public static void main(String ...args){
        int MAX = 3;
        Scanner scan = new Scanner(System.in);

        int num = 0, maior = 0, menor = 0;;


        for(int i = 0; i < MAX; i++){
            System.out.println("Insira um numero: ");
            num = scan.nextInt();
            if(num > maior){
                maior = num;
            }else{
                menor = num;
            }
        }
   
        scan.close();
        System.out.printf("Maior: %d\nMenor: %d", maior, menor);
    }
    
}