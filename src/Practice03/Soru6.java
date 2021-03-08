package Practice03;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        String ulke;
        Scanner u_girdi = new Scanner(System.in);
        System.out.print("Yasadiginiz Ulkeyi Griniz...>");
        ulke = u_girdi.next();
        ulke = ulke.trim();

        /*
        ulke =  ulke.substring(0,1) +
                ulke.substring(1,2).toUpperCase() +
                ulke.substring(2,ulke.length()-2) +
                ulke.substring(ulke.length()-2,ulke.length()-1).toUpperCase() +
                ulke.charAt(ulke.length()-1);
        */
        for (int i= 0; i<ulke.length(); i++) {
            if(i == 1 || i==ulke.length()-2 ) {
                System.out.print(Character.toUpperCase(ulke.charAt(i)));
            }
            else {
                System.out.print(Character.toLowerCase(ulke.charAt(i)));
            }

        }


     //   System.out.println(ulke);



    }
}
