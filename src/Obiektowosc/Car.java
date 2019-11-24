package Obiektowosc;

public class Car {
    private String model;
    private String marka;
    private Integer rokProdukcji;
    private Integer wiek;
    private Integer predkosc;

   public Car (String model, String marka, Integer rokProdukcji) {
        this.model = model;
        this.marka = marka;
        this.rokProdukcji= rokProdukcji;
        this.wiek = this.obliczWiek ();
        this.predkosc = 0;
    }
    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.rokProdukcji;
    }
    public void przyspiesz(Integer zmiana){
        this.predkosc += zmiana;
        System.out.println("Twoja aktualna predkosc to"+ " " +this.predkosc);
    }

    public void opiszAuto () {
        System.out.println("Oto " + this.model + " " + this.marka);

        if (this.wiek < 5) {
            System.out.println("Nowe auto prawie nie używane");
        }else if (this.wiek <= 20) {
            System.out.println("Troche juz jezdzi, ale wciaz dziala");
        } else System.out.println("Nadaje sie tylko na zlom");
        }
    }




