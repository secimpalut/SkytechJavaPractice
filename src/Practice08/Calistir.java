package Practice08;

import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {
        char devam = 'e';
        double fatura = 0;

        Scanner scan = new Scanner(System.in);

        bakiye b1 = new bakiye();
        Urunler u1 = new Urunler();

        System.out.println("Otamat makinası calısıyor");

        do {
            System.out.println("Suanki bakiye : " + b1.getBakiye());
            u1.goster();

            System.out.print("Urun kodunu giriniz:");
            int urun = scan.nextInt();

            switch (urun) {
                case 1: fatura = u1.getPepsi(); break;
                case 2: fatura = u1.getCips(); break;
                case 3: fatura = u1.getSu(); break;
                default:
                    System.out.println("Girdiginiz urun kodu listemizde bulunmamaktadır...");
            }

            if (b1.getBakiye() >= fatura) {
                b1.alısveris_sonrası(fatura);

            } else {
                System.out.println("Baliyenizde yeterli miktarda para bulunmamaktadır");
                System.out.println((fatura - b1.getBakiye()) + " bu kadar bakiye ihtiyacnınız var...");
                System.out.println("Eklemek istediginiz para miktarını giriniz: ");
                double ek = scan.nextDouble();

                b1.paraEkle(ek);

                b1.alısveris_sonrası(fatura);

            }



            System.out.println("Devam etmek istiyor musun(e/h)");
            devam = scan.next().charAt(0);

        } while(devam == 'e');

        System.out.println("Tesekkurler Gule Gule....");
    }
}
