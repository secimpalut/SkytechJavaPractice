package SecondLesson;

import java.util.Scanner;

/*
kullanıcı adı ve Sifre girisini kullanıcıdan alın
Secim Palut
123456

output:
Secim P****
******
 */
public class Question05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Enter ypur password");
        String pass = scan.next();

        System.out.println(pass.replace(pass.substring(0),"*"));
    }
}
