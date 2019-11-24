import javax.naming.Name;
import javax.xml.namespace.QName;
import java.util.concurrent.Callable;

public class obiektowosc {
    public static void main(String[] args) {
        Human czlowiek1 = new Human ("Kasia", "Nowakowska" , 1991);
        czlowiek1.przedstawSie ();

        Human czlowiek2 = new Human( "Robert", "Kowalski", 2000);
        czlowiek2.przedstawSie();

        Human czlowiek3  = new Human("Malgorzata" ,"Majewska",1985);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName()+ " "+ czlowiek3.getSurname());
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


        }

    }


