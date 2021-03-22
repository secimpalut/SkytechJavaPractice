package Practice06;

import java.util.Scanner;

public class Q02KontrolLeapYear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yılı gir");
        int yil = scan.nextInt();

        //boolean sonuc = isLeap(yil);

        if (isLeap(yil) == true) {
            System.out.println(yil + " bir Artık yildır");
        } else {
            System.out.println(yil + " bir Artık yil degildir");
        }

    }

    public static boolean isLeap(int yil) {
        boolean isLeap = false;

        if (yil % 4 == 0) {

            if (yil % 100 == 0) {

                if(yil % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }

            }else {
                isLeap = false;
            }

        } else {
            isLeap=false;
        }

        return isLeap;
    }
}
