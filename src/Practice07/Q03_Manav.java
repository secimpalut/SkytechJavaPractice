package Practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_Manav {

    public static List<String> urunler = new ArrayList<>();
    public static List<Double> fiyatlar = new ArrayList<>();
    public static double toplamfiyat=0;

    public static void main(String[] args) {

        char Evethayır = 'e';

        urunler.add("Patates");
        fiyatlar.add(0.7);

        urunler.add("Domates");
        fiyatlar.add(1.5);

        urunler.add("Elma");
        fiyatlar.add(1.2);

        do {
            int i = 1;
            for (String w: urunler) {
                System.out.println(i +"."+ w);
                i++;
            }

            Scanner scan = new Scanner(System.in);
            System.out.print("Almak istediginiz urunu kodunu giriniz: ");
            int secim = scan.nextInt();

            System.out.print("Kac kg almak istiyorsunuz: ");
            int kg = scan.nextInt();

            fiyataekle(secim-1,kg);

            System.out.println("Cıkmak istiyor musun(e/h)");
            Evethayır = scan.next().charAt(0);



        }while(Evethayır == 'h');

        System.out.println("Aldıgınız urunlerin toplam fiyati = " + toplamfiyat);

        System.out.println("Paranızın ustu: " + pay());
        System.out.println("Alısveris icin bizi tercih ettginiz icin tesekkurler...");


    }

    public static void fiyataekle(int index,int kilo) {

        toplamfiyat = fiyatlar.get(index) * kilo;
    }

    public static double pay() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kasaya verilen ucret:");
        double verilen_para = scan.nextDouble();
        double para_ustu = 0;

        do {
            if (verilen_para < toplamfiyat) {
                System.out.println("Verdiğiniz ücret yetersizdir.");
                System.out.print("yeni verilen ucret:");
                verilen_para = scan.nextDouble();
            } else {
                para_ustu = verilen_para - toplamfiyat;
                break;
            }

        }while(true);

        return para_ustu;
    }




}
