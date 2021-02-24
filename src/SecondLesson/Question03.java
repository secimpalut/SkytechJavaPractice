package SecondLesson;

import java.util.Scanner;

/*
Baslangıc ve bitis arasndaki
tum 3 e bolunebilen sayıları yazdırın

start:4
end: 20

outpu: 6 9 12 15 18
 */
public class Question03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Baslangıc: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitis: ");
        int bitis = scan.nextInt();

        for(int i = baslangic; i<=bitis; i++) {

            if(i % 3 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
