import java.util.Scanner;

public class Exer3 {
  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);
    int num = 0;

    System.out.println("Digite um numero: ");
    num = scan.nextInt();    
    scan.close();

    if(num > 0){
      System.out.println("Positivo");
    }else if(num < 0){
      System.out.println("Negativo");
    }
    else{
      System.out.println("Nulo");
    }
    
  }
}