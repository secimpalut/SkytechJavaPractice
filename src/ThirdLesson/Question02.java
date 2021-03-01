package ThirdLesson;
/*
 Cift olanları bulalım
 */
public class Question02 {

    public static void main(String[] args) {
        int numbers [] = {10, 4, 1, 4, -10, -50, 32, 21};

        int ciftNumbers [] = {};

        int sayac = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sayac++;
            }
        }

        System.out.println(sayac);
    }

}
