import java.util.Scanner;
public class Exer7 {
    public static void main (String ...args){
        Scanner scan = new Scanner(System.in);

        float kmInicial = 0, kmFinal = 0, kmPercorrido;

        System.out.println("Digite sua kilometragem: ");
        kmInicial = scan.nextFloat();

        System.out.println("Digite sua kilometragem: ");
        kmFinal = scan.nextFloat();


        if(kmFinal < kmInicial){ 
            System.out.println("Valor inválido.\nDigite Novamente: ");
            kmInicial = scan.nextFloat();
            kmFinal = scan.nextFloat();
        }
        
        scan.close();
        kmPercorrido = kmFinal - kmInicial;

        System.out.printf("Km Percorridos: %.2f", kmPercorrido);
    }
}
