import java.util.Scanner;

public class Exer3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        float media = 0;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite a nota do %dº aluno: ",i+1);
            media += scan.nextFloat();
        }
        scan.close();
        media = (float)media/3;
        System.out.printf("A média dos alunos é de: %.2f", media);
    }
}