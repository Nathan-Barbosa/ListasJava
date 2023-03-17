import java.util.Scanner;

public class Exer2 {
  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);
    int num = 0;

    System.out.println("Digite um numero: ");
    num = scan.nextInt();    
    scan.close();

    System.out.printf( num % 2 == 0 ? "Par" : "Impar");
  }
}
