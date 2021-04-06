package Practice08;

public class bakiye {

    private double bakiye = 10;

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraEkle(double ek) {
        this.bakiye = bakiye + ek;
        System.out.println("Bakiyenizin guncel hali: " + bakiye);
    }

    public double alısveris_sonrası(double harcama) {
        bakiye = bakiye - harcama;
        System.out.println("Harcama sonrası kalan bakiye : " + bakiye);
        return bakiye;
    }


}
