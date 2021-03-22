package Practice06;

import java.util.Scanner;

public class Q01RakamIsim_Yazdırma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Rakam gir(0....9): ");
        int num = scan.nextInt();


        if(num>=0 && num<10) {

            switch (num) {
                case 0: System.out.println("sıfır"); break;
                case 1: System.out.println("bir"); break;
                case 2: System.out.println("iki"); break;
                case 3: System.out.println("uc"); break;
                case 4: System.out.println("dort"); break;
                case 5: System.out.println("bes"); break;
                case 6: System.out.println("altı"); break;
                case 7: System.out.println("yedi"); break;
                case 8: System.out.println("sekiz"); break;
                case 9: System.out.println("dokuz"); break;
            }

        }
        else {
            System.out.println("Girilen deger bir rakam degildir");
        }





    }
}
