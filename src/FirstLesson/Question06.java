package FirstLesson;
/*
soru 6:		a = 4
		b = 5
		c = 3
 ucgenin kenar uzunlukları veriliyor eşkenar mı değil mi kontrol edelim
 */
public class Question06 {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;

        boolean eskenar_mi =  (a==b && a==c && b==c);

        System.out.println("Eskenar ucgen mi : " + eskenar_mi);
    }

}
