import java.util.Scanner;

public class Exer8 {
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);

        int m = 0, f = 0, aprovados = 0,total = 0;
        float percentF = 0, percentM = 0, percentAprovados = 0;

        System.out.println("Digite quantos alunos homens: ");
        m = scan.nextInt();
        System.out.println("Digite quantos alunos mulheres: ");
        f = scan.nextInt();
        System.out.println("Digite quantos alunos foram aprovados: ");
        aprovados = scan.nextInt();
        scan.close();
        total = m + f;
        percentAprovados = (aprovados * 100) / total;
        percentM = (m * 100) / total;
        percentF = (f * 100) / total;

        System.out.printf("Homens: %d\nMulheres: %d\nTotal alunos: %d\nAprovados: %d\nPercentual de Aprovados: %.2f\nPercentual de Homens: %.2f\nPercentual de Mulheres: %.2f", m,f,total, aprovados, percentAprovados, percentM, percentF);
    }
}
