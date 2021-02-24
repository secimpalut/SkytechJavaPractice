package SecondLesson;

import java.util.Scanner;

/*
Baslangıc ve bitis arasndaki
tum sayıların toplamını bulan program

start:3
end: 7

outpu: 25
 */
public class Question04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Baslangıc: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitis: ");
        int bitis = scan.nextInt();

        int top = 0;

        for(int i = baslangic; i<=bitis; i++) {

            top = top + i;

        }

        System.out.println("Toplam: " + top);
    }
}
