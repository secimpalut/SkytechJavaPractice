package Practice04;

import java.util.Scanner;

public class Q04CanToFhr {
    public static void main(String[] args) {

        double celcius, fahren;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temp. in Celsius :");
        celcius=s.nextDouble();

        System.out.println(Fah_hesapla(celcius));

       // Fah_hesapla(200);

        //Fah_hesapla(50);

    }

    public static double Fah_hesapla(double cel) {

        double fahren = 0;
        fahren = cel* 9/5 + 32;
        return fahren;

    }
}
