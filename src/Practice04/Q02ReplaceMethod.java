package Practice04;

import java.util.Scanner;

public class Q02ReplaceMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("İsmni gir: ");
        String name = scan.next();

        String str = "You can do it !";

        name = name + " is powerful man :)";

        System.out.println(str.replaceAll("!",name));

    }
}
