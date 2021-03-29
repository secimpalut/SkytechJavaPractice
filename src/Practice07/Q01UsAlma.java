package Practice07;
// Soru1. 2 uzeri 3 u bulan program

import java.util.Scanner;

public class Q01UsAlma {


    public static void main(String[] args) {

        //2 nin 3. kuvvetini bulalım
        int sonuc=1;
        for(int i=3; i>0;i--) {
            sonuc*=2;
        }
        System.out.println(sonuc);


        //us ve taban degerlerini kullanıcıdan alalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban degerini gir: ");
        int taban = scan.nextInt();
        System.out.println("Us degerini gir: ");
        int us = scan.nextInt();

        sonuc=1;
        for (int i=1; i<=us; i++){
            sonuc*=taban;
        }
        System.out.println(taban + " nın " + us+ ". kuvveti : " + sonuc);


        //us_al method olustıralım, taban ve us degerlerini method a gonderip, methıddan sonuc degerini alalaloı
        System.out.println("Taban degerini gir: ");
        int taban1 = scan.nextInt();
        System.out.println("Us degerini gir: ");
        int us1 = scan.nextInt();
        System.out.println(us_al(taban1,us1));

    }

    public static String us_al(int t, int u) {
        int snc=1;
        for(int i = 1; i<=u; i++) {
            snc *= t;
        }

        String str = t + " nın " + u+ ". kuvveti : " + snc;
        return str;
    }

}
