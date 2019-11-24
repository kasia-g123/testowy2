package Obiektowosc;

public class Human {
    private Integer age;
    private String name;
    private String surname;
    private Integer birthYear;

    //Kostruktor- wywolywany jest przy inicjalizacji obiektu
     public Human (String name, String surname, Integer birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }
    // metody klasy
    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.birthYear;
    }

    public void przedstawSie() {
        System.out.println("Hej, nazywam sie " + this.name +" " + this.surname);
        System.out.println("Mam "+ this.age + " lat" );
    }
    //Metody settry i gettery
    // Getter
    public String getName (){
        return name;
    }
    public String getSurname (){
        return surname;
    }
    //Setter
    public void setBirthYear (Integer birthYear) {
        this.birthYear= birthYear;
        this.age = this.obliczWiek();
    }
    //Static -pozwala dostac sie do funkcji bez inicjalizacji oboektu
    // nie mozemy operowac w niej na zadych atrybutach niestatycznych
    public static void opiszKlase(){
         System.out.println( "klasa human oblcza ");
    }
}
