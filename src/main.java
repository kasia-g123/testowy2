import javafx.stage.StageStyle;
import javafx.util.Pair;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static String zwrocImie (Integer case1) {
        //Integer case1 = 5;
        String imie = "";
        switch (case1) {
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default:imie = "NoName";
        }
        return imie;
    }
    public static void przedstawSie (String imie){
        System.out.println("moje imie to" + imie );
    }

    public static void main(String[] args) {

        String imie = zwrocImie(  5);
        przedstawSie(imie);
        imie = zwrocImie( 1) ;
        przedstawSie(imie);
        przedstawSie(zwrocImie(10));

        System.out.println("moj pierwszy program");
        //Zmienne
        String napis1 = "kasia";
        //boolem-tym logiczny zwraca true or false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.println(isTomek);
        //integrer-typ numeryczny liczb całkowitych
        //long-liczba całkowita, dużo dłuższy
        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(13208);
        liczba1.equals(liczba2);
        //Typ prosty, Integer to klasa raportująca typ prosty int (daje metody
        //ulatwiajacy prace z danym typem
        //Float-typ numeryczny zmiennoprzecinkowym
        //Float ulamek = 10,155;
        Double ulamek2 = 10.5;
        //kolekcje
        //lista-zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());
        //hasmap- slownik trzymający pary klucz-wartosc
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put( "Tomek", 5);
        System.out.println(mapa1.toString());
        //CTRL+SHIFT+F10
        //pair- tylko jeda para klucz-wartosc
        Pair<String , Integer> pair = new Pair<> ( "kasia" , 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue().toString();
        System.out.println(napis2);

        //petle//petla for
        // warunke początkowy (wartosc poczatkowa licznika;
        // warunek koncowy licznika;
        // kdyfikacje licznika i++ oznacza że i bedzie wiekse o 1 po przeprowadzeniu petli

        for (Integer i = 0; i > 5; i++) {
            System.out.println ("wartosc licznika" + i.toString());
            i++;
        }


        Integer i = 0;
        while (i<5) {
            System.out.println("jestem w while po raz" + i.toString());
            i++;
        }
    // break to specjalne słowo, które pozwala zakonczyc dizałanie petli
        // continue pozwala przejsc kolej e iteracje z pomnijeszeiem kodu pod tyym
     while (true) {
         i++;
         if (i.equals(7))
             continue;
         System.out.println(" " + i.toString());
         if (i.equals(10))
             break;
     }
        do {
            System.out.println("jestem w do while");
            i ++;
        }while (i <10);

     // petla while -zawsze wykona sie cjociaz jedna iteracja

        // petla for each na liscie
        for (String el: lista1) {
            System.out.println("element listy:" + el);
        }
        //petla for each na mapie #TODO
        // for (string el: na mapie

        //Instrukcja warunkowe
        // insrukcje is....else if....els
        //else sie zawsze wykona, kiedy warunek nie jest spełniony
        if (lista1.size()==2) {
            System.out.println("hej jestem w instrukcji ");
        }
        if (lista1.size() <1) {
            System.out.println("z tym warunkiem nigdy sie nie wypisze ");
        } else {
            System.out.println("jestem w instrukcji else");
        }
        if (lista1.size() <1) {
            System.out.println("nie wykonam sie");
        } else if (lista1.size() == 2) {
            System.out.println("ja sie wykonam");
        }else {
            System.out.println("ja sie juz nie wykonam,bo warunek jest spelniony");
        }
        //instrucja warunkowa switch case

        i=5;
        String massage = "moje imie to ";
        switch (i) {
            case 2: massage += "Kasia"; break;
            case 5: massage += "Tomek"; break;
            case 8: massage += "Dawid"; break;
        } System.out.println(massage);
        }


    }






