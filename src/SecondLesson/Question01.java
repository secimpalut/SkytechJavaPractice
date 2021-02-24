package SecondLesson;

import java.util.Scanner;

/*
Kullanıcıddan baslangıc ve bitis degerlerini alalım
Bastan sona yazdıralım

baslangıc : 5
bitis: 12

output: 5 6 7 8 9 10 11 12
 */
public class Question01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Baslangıc: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitis: ");
        int bitis = scan.nextInt();

        for(int i = baslangic; i<=bitis; i++) {
            System.out.print(i + " ");
        }

    }
}
