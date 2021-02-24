package SecondLesson;

import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String fn = scan.next();

        System.out.println("Enter lastname ");
        String ln = scan.next();

        System.out.println(fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase());
        System.out.println(ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase());
    }

}
