package FirstLesson;
/*
Soru 8:  Ali’nin notu 45
	Veli’nin notu 65
	Ayse’nin notu 60

Ogretmen sınav notlarını cok dusuk olduğunu görünce soyle birseye karar veriyor
50 nin altında alanlara +20 puan
50 nin üzerinde alanlara +30 puan ekleyecek

 */
public class Question08 {
    public static void main(String[] args) {
        int ali_not = 45;
        int veli_not = 65;
        int ayse_not = 60;

        ali_not = (ali_not>=50)?ali_not+30:ali_not +20;

        veli_not = (veli_not>=50)?veli_not+30:veli_not +20;

        ayse_not = (ayse_not>=50)?ayse_not+30:ayse_not +20;

        System.out.println("alinin yeni notu= " + ali_not);
        System.out.println("velinin yeni notu= " + veli_not);
        System.out.println("aysenin yeni notu= " + ayse_not);
    }

}
