import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
//ALT+ENTER - imprortowanie klas z bibliotek
import java.util.List;

public class main2 {
    public static Double cenabrutto(Double cena) {
        return cena * 1.23;
    }

    public static void main(String[] arge) {
        HashMap<String, Double> owoce = new HashMap<>();
        owoce.put("jablko", 2.5);
        owoce.put("gruszka", 6.8);
        owoce.put("banan", 4.8);
        Double cenaSumaryczna = 0.0;
        for (Integer i = 0; i < 3; i++) {
            //String owoc = nazwyOwocow.get(i);
            cenaSumaryczna += cenabrutto(owoce.get("jablko"));
            System.out.println("jablko");
            System.out.println(cenabrutto(owoce.get("jablko")));
        }
        System.out.println("Cena Twoich Zakupow to :" + cenaSumaryczna.toString());
    }
}
