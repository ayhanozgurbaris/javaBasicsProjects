import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ders1,ders2,ders3,ders4,ortalama;

        System.out.println("ders1 notunuzu giriniz");
        ders1 = input.nextInt();

        System.out.println("ders2 notunuzu giriniz");
        ders2 = input.nextInt();

        System.out.println("ders3 notunuzu giriniz");
        ders3 = input.nextInt();

        System.out.println("ders4 notunuzu giriniz");
        ders4 = input.nextInt();

        ortalama =(ders1 + ders2 + ders3 +ders4)/4;

        System.out.println("not ortalamaniz: " + ortalama);

        if (ortalama <50 ){
            System.out.print("kaldiniz");
        }else {
            System.out.print("gectiniz");
        }



    }
}
