// Programa 9: construir um programa em Java que leia
// a quantidade de mini-games, calculadoras e canetas
// vendidas por um camelô ao fim de um dia e calcule,
// armazene e imprima o faturamento de cada produto e
// o faturamento total. Mini-games: R$ 6.95,
// calculadoras: R$ 3.50 e canetas: R$ 1.20.
import java.util.Scanner;

public class Exer9 {
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);
        
        float miniGames = 0, calcs = 0, pens = 0, total = 0, totalMG = 0, totalCalcs = 0, totalPens = 0;
        
        System.out.println("Digite Total de mini-Games vendidos: ");
        miniGames = scan.nextFloat();
        System.out.println("Digite Total de calculadoras vendidas: ");
        calcs = scan.nextFloat();
        System.out.println("Digite Total de canetas vendidas: ");
        pens = scan.nextFloat();
        scan.close();

        totalMG = (float)miniGames * (float)(6.95);
        totalCalcs = (float)calcs * (float)(3.50);
        totalPens = (float)pens * (float)(1.20);

        total = totalMG + totalCalcs + totalPens;
        System.out.printf("Total mini-games: %.2f\nTotal calculadores: %.2f\nTotal canetas: %.2f,\nTotal: %.2f", totalMG, totalCalcs, totalPens, total);
    }
}
