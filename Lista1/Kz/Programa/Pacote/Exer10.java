import java.util.Scanner;

public class Exer10{
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);

        int win = 0, lose = 0, draw = 0, matches = 0, pts = 0, winPts = 0, lostPts = 0;

        System.out.println("Digite o numero de vitorias do seu time: ");
        win = scan.nextInt();
        System.out.println("Digite o numero de derrota do seu time: ");
        lose = scan.nextInt();
        System.out.println("Digite o numero de empate do seu time: ");
        draw = scan.nextInt();
        scan.close();
        matches = win + lose + draw; 
        pts = matches * 3;
        winPts = win * 3;
        lostPts =  pts - winPts;
        

        System.out.printf("Total de partidas: %d\nPontos disputados: %d\nPontos ganhos: %d\nPontos perdidos: %d",matches, pts, winPts, lostPts);
    }
}