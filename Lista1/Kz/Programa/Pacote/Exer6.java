import java.util.Scanner;

public class Exer6 {
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);

        float km = 0;
        float mtr = 0;
        System.out.println("Digite um valor em Km: ");
        km = scan.nextFloat();
        scan.close();
        mtr = km * 1000;

        System.out.printf("KM em Metros: %.2f", mtr);
    }
}
