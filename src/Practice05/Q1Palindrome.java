package Practice05;

import java.util.Scanner;
/*
Palindrome: tersten okunuşu aynı olan kelime veye sayılar için kullanılır
Klavyeden girilen kelimenin palindrome olup olmadığını bulan program
 */
public class Q1Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Polindrome olup olmadıgını kontrol etmek icin sayı veya kelime gir: ");
        String kelime = scan.next();

        is_palindrome(kelime);

        /*
        // 1. Yontem:
        int i = 0;
        int j = kelime.length()-1;
        boolean kontrol = true;

        while (i<j) {
            if(kelime.charAt(i) != kelime.charAt(j)) {
                kontrol = false;
                break;
            }
            i++;
            j--;
        }

        if(kontrol==true) {
            System.out.println("Bu bir palindrome kelimedir");
        } else {
            System.out.println("Bu bir palindrome kelime degildir");
        }


        String ters="";
        //2. Yontem:
        for (int k=kelime.length()-1; k>=0; k--) {
            ters += kelime.charAt(k);
        }

        System.out.println(ters);

        if (kelime.equals(ters)) {
            System.out.println("Bu bir palindrome kelimedir");
        } else {
            System.out.println("Bu bir palindrome kelime degildir");
        }

        */
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
