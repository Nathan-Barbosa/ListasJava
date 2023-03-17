import java.util.Scanner;
public class Exer5 {
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);

        float a = 0, b = 0, c = 0, d = 0;

        System.out.println("Digite 3 digitos: ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        scan.close();
        d = (float)Math.pow(b, 2) - (4 * a * c); 

        System.out.printf("Delta: %.2f", d);
    }
}
