package SecondLesson;

import java.util.Scanner;

/*
kullancıdan 4 haneli bir sayı alın
rakamları toplamını bulan program

1234

10
 */
public class Question07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int last;
        int sum=0;

        System.out.println("Enter your integer");
        int num = scan.nextInt();

        for (int i=0; i<4;i++) {
            last = num % 10;
            sum = sum + last;
            num = (num-last) / 10;
        }

        System.out.println(sum);
    }

}
