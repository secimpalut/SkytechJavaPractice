package Practice04;

import java.util.HashMap;
import java.util.Map;

public class deneme {

    public static void main(String[] args) {

        HashMap<String,String> ulkeler = new HashMap<String, String>();

        ulkeler.put("tr", "turkiye");
        ulkeler.put("gr", "almanya");
        ulkeler.put("en", "english");
        ulkeler.put("ar", "arabic");

        if (ulkeler.get("tr") == null) {
            System.out.println("yoktur");
        } else {
            System.out.println("turkiye vardır");
        }

        if (ulkeler.get("es") == null) {
            System.out.println("es yoktur");
        } else {
            System.out.println("es vardır");
        }

        for(Map.Entry entry : ulkeler.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
