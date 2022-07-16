import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float minKdv = 0.18f;
        float maxKdv = 0.08f;

        System.out.print("ana para miktarini giriniz");

        float a = input.nextFloat();
        if (a<1000){
            a+=(a*minKdv);
            System.out.print("kdv/'li tutar: " + a);
        }else {
            a+=(a*maxKdv);
            System.out.print("kdv/'li tutar: " + a);
        }
    }
}
