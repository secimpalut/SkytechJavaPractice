package Practice03;
/*
Araay elemanlarını toplamını bulan program

[10,20,30,2,4] = toplamı
 */
public class Question03 {

    public static void main(String[] args) {

        int Array [] = {10,20,30,40,50} ;

        int toplam = 0;

        for (int i = 0; i <Array.length; i++) {

            toplam += Array[i];
        }

        System.out.println("Array elemanlarının toplamı = " + toplam);
        System.out.println("Array elemanlarını ortalamsı = " + (toplam/Array.length));

    }
}
