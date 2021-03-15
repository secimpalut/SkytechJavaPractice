package Practice05;

import java.util.Arrays;
import java.util.Scanner;

/*
// Find a string's reverse by using array. Use toCharArray
Girilen string in tersini çeviren program Array kullanarak
 */
public class Q2ReverseByArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String str = scan.next();

        char [] arr = str.toCharArray();

        //System.out.println(Arrays.toString(arr));

        String ters = "";

        for (int i = str.length()-1; i>=0; i--) {
            ters += str.charAt(i);
        }

        System.out.println("Kelimenin tersi: " + ters);
    }
}
