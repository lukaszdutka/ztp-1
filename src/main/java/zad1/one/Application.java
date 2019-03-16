package zad1.one;

//Napisz dowolny (sensowny) program, w
//którym wykorzystasz wszystkie rodzaje
//polimorfizmu.

//Polimorfizm inkluzyjny - dziedziczenie (pokazać overridowanie metod)
//Polimorfizm ad hoc - metoda działa różnie na wartościach różnych typów
// (Overloading czyli ta sama nazwa, różne typy i ilość argumentów i koercja -
// to gdy do metody wstawiamy Integera ale jest tylko metoda z argumentem intem
// więc taką wykonuje, a jakby byłą typowo metoda z argumentem Integerem to by ją
// wykonało
//
//Polimorfizm parametryczny - typ parametryzowany innym typem. np. ArrayList<T>
//
//Polimorfizm ograniczeniowy - pojebongo coś, że łączysz inkluzyjny i
// parametryczny i można definiować jakieś “minimalne i/lub maksymalne
// używalne nadtypy/podtypy”


import zad1.one.ograniczeniowy.DuzeSkrzydelka;
import zad1.one.ograniczeniowy.MaleSkrzydelka;
import zad1.one.ograniczeniowy.Ptak;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        //Polimorfizm ad hoc - Overloading
        System.out.println("Moje małe Zoo\n");
        System.out.print("W naszym zoo znajdują się: ");
        System.out.print(2);
        System.out.println(" zwierzątka.");

        //Polimorfizm inkluzyjny
        Ssak husky = new Husky();
        Ssak delfin = new Delfinek();

        //Polimorfizm parametryczny
        ArrayList<Ssak> list = new ArrayList<>();
        list.add(husky);
        list.add(delfin);

        //Polimorfizm inkluzyjny c.d.
        for (Ssak s: list) {
            System.out.println(s.czyMaKoloroweOczy());
            System.out.println(s.dajGlos());
            System.out.println();
        }

        //ograniczeniowy
        Ptak<MaleSkrzydelka> kurczak = new Ptak<>(new MaleSkrzydelka());
        Ptak<DuzeSkrzydelka> labedz = new Ptak<>(new DuzeSkrzydelka());
//        Ptak<Object> dziwnyPtak = new Ptak<MaleSkrzydelka>(new Object());


        kurczak.trzepotajSkrzydlami();
        labedz.trzepotajSkrzydlami();

        System.out.println();

        //koercja
        labedz.zlozJajka(5);
        labedz.zlozJajka(new Integer(5));



    }

}
