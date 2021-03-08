package Practice04;

import java.util.Scanner;

public class Q03FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıyı gir: ");
        int num = scan.nextInt();

        for (int i=1; i<= num; i++) {

            if ( i % 3 == 0  && i % 5 == 0 ) {
                System.out.print(" FizzBuzz ");
            }
            else if ( i % 5 == 0) {
                System.out.print(" Buzz ");
            }
            else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
