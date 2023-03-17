import java.util.Scanner;

public class Exer7 {

    public static void main(String ...args){
        int MAX = 15;
        Scanner scan = new Scanner(System.in);

        float idade = 0, total = 0, media = 0;


        for(int i = 0; i < MAX; i++){
            System.out.println("Insira uma idade: ");
            idade = scan.nextFloat();
            total += idade;
        }
        media = total / MAX;
        scan.close();
        System.out.printf("Total: %.2f", (float)media);
    }
    
}