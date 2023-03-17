import java.util.Scanner;

public class Exer5 {
  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);


    System.out.println("Digite um numero: ");
    int num = scan.nextInt();
    scan.close();
    if(num < 1 || num > 7){
      System.out.println("Numero inválido");
    }else{     
      String arr[] = {"Domingo", "Segunda","Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
      System.out.printf(arr[num-1]);            
    }
  }  
}
