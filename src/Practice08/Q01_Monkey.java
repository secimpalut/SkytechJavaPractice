package Practice08;

public class Q01_Monkey {
    public static void main(String[] args) {

        int muz = 200;
        int gun = 0;
        boolean hayatta_mi = true;

        do {
            gun++;
            muz -= 4;

            if(muz < 4) {
                hayatta_mi = false;
            }

        }while (hayatta_mi);

        System.out.println("Maymun " + gun + " hayatta kalmıstır");
    }
}
