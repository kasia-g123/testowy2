import Dziedziczenie.Man;
import Dziedziczenie.Woman;
import Obiektowosc.Car;
import Obiektowosc.Human;

public class obiektowosc {
    public static void main(String[] args) {
        Human czlowiek1 = new Human("Kasia", "Nowakowska", 1991);
        czlowiek1.przedstawSie();

        Human czlowiek2 = new Human("Robert", "Kowalski", 2000);
        czlowiek2.przedstawSie();

        Human czlowiek3 = new Human("Malgorzata", "Majewska", 1985);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + " " + czlowiek3.getSurname());
        czlowiek3.setBirthYear(1975);
        czlowiek3.przedstawSie();


        //dwa obiekty klasy car
        Car opel = new Car("astra", "opel", 2006);
        opel.przyspiesz(60);
        opel.przyspiesz(20);
        opel.opiszAuto();

        Car bmw = new Car("m3", "bmw", 2016);
        bmw.przyspiesz(152);
        bmw.opiszAuto();

        //Obiekt klasy women dziedziczy po Human
        Woman kobieta1 = new Woman("Kasia", "Kowalska", 2008);
        kobieta1.przedstawSie();
        kobieta1.setBirthYear(2009);
        kobieta1.getName();

        Man mezczyzna1 = new Man("Tomek", "Gorny", 1980);
        mezczyzna1.setWaga(70);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();

        mezczyzna1.setWaga(150);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();
    }

}


