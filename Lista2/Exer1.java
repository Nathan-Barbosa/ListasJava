import java.util.Scanner;

public class Exer1 {

  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);
    int num1 = 0, num2 = 0;
    
    System.out.println("Digite um numero: ");
    num1 = scan.nextInt();
    System.out.println("Digite um numero: ");
    num2 = scan.nextInt();
    scan.close();

    System.out.printf(num1 > num2 ? "O primeiro é maior que o segundo" : "O segundo é maior que o primeiro") ;
  }
}