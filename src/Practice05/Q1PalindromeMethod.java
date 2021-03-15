package Practice05;

import java.util.Scanner;

public class Q1PalindromeMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Polindrome olup olmadıgını kontrol etmek icin sayı veya kelime gir: ");
        String kelime = scan.next();

        is_palindrome(kelime);


        System.out.println("Polindrome olup olmadıgını kontrol etmek icin sayı veya kelime gir: ");
        String kelime2 = scan.next();

        is_palindrome(kelime2);


        System.out.println("Polindrome olup olmadıgını kontrol etmek icin sayı veya kelime gir: ");
        String kelime3 = scan.next();

        is_palindrome(kelime3);

    }

    public static void is_palindrome(String kelime) {

        String ters="";

        for (int k=kelime.length()-1; k>=0; k--) {
            ters += kelime.charAt(k);
        }

        System.out.println(ters);

        if (kelime.equals(ters)) {
            System.out.println("Bu bir palindrome kelimedir");
        } else {
            System.out.println("Bu bir palindrome kelime degildir");
        }
    }
}
