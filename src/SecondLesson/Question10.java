package SecondLesson;

import java.util.Scanner;
/*
Carpım tablosu yapalım

 */
public class Question10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer");
        int a = scan.nextInt();

        System.out.println("Enter a ineteger ");
        int b = scan.nextInt();

        for (int i = 1; i<10; i++) {
            System.out.print(a + "*" + b +  "=" +  a*b + "   ");
            b++;
        }

    }
}
