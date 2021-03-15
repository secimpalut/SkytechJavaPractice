package Practice05;

import java.util.Arrays;

public class Q3CountArrays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

       // System.out.println(Arrays.toString(say(nums)));

        int [] sonuc = say(nums);

        System.out.println("pozitif sayısı " + sonuc[0]);
        System.out.println("negatif sayısı " + sonuc[1]);
    }

    public static int[] say(int [] num) {
        int p = 0;
        int n = 0;

        for (int w : num)  {
            if( w > 0) {
                p++;
            } else {
                n++;
            }
        }
       // System.out.println("pozitif sayısı " + p);
       // System.out.println("negatif sayısı " + n);

        int [] pn = {p,n};

        return pn;
    }



}
