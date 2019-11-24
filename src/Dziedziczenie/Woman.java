package Dziedziczenie;

import Obiektowosc.Human;

public class Woman  extends Human {
    private String plec;
    public Woman(String name, String surname, Integer birthYear) {
        super(name, surname, birthYear);
        this.plec = "kobieta";
    }

    @Override
    public void przedstawSie () {
        super.przedstawSie();
        System.out.println("Jestem "+ this.plec);
    }
}
