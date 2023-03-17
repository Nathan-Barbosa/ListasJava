import java.util.Scanner;

public class Exer4 {
  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);
    float av1 = 0, av2 = 0, av3 = 0, media = 0;

    System.out.println("Digite sua nota da av1: ");
    av1 = scan.nextFloat();    
    System.out.println("Digite sua nota da av2: ");
    av2 = scan.nextFloat();
    
    media = (av1+av2) / 2;
    if(media >= 7){
      System.out.println("Aprovado");
    }else{
      System.out.println("Digite sua nota da av3: ");
      av3 = scan.nextFloat();
      media = (av1 + av2 + av3) / 3;
      if(media >= 6){
        System.out.println("Aprovado");
      }else{
        System.out.println("Reprovado");
      }  
    }
    scan.close();
    
  }
}