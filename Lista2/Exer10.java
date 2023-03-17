import java.util.Scanner;
import java.util.ArrayList;

public class Exer10 {

    public static void main(String ...args){
        int MAX = 3;
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> alunosSexo = new ArrayList<Character>();
        ArrayList<String> turma = new ArrayList<String>();
        float countM = 0, countF = 0, percentM = 0, percentF = 0;
        


        for(int i = 0; i < MAX; i++){
            System.out.println("Insira seu genero: M ou F");
            alunosSexo.add(scan.nextLine().charAt(0));

            System.out.println("Insira sua turma: ");
            turma.add(scan.nextLine());
        }
   
        scan.close();


        for(char n:alunosSexo){
            if(n == 'f' || n == 'F'){
                countF ++;
            }
            if(n == 'M' || n == 'm'){
                countM ++;
            }         

        }

        percentM = (countM * 100) / MAX;
        percentF = (countF * 100) / MAX;

        System.out.printf("Genero dos Alunos: %s\nTurmas: %s\nPorcentagem de homens: %.2f\nPorcentagem de mulheres: %.2f", alunosSexo, turma, (float)percentM, (float)percentF);
    }
    
}