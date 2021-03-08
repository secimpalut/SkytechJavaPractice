package Practice04;

import java.util.Scanner;

public class Q01Pramit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İstedigin karakteri gir: ");
        String ch = scan.next();

        for(int i=0; i<20; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();

            for(int k=0; k<i; k++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
