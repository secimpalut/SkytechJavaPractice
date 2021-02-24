package SecondLesson;

import java.util.Scanner;

/*
Baslangıc ve bitis arasndaki
tum cift sayıları yazdırın

start:4
end: 10

outpu: 4 6 8 10
 */
public class Question02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Baslangıc: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitis: ");
        int bitis = scan.nextInt();

        for(int i = baslangic; i<=bitis; i++) {

            if(i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
