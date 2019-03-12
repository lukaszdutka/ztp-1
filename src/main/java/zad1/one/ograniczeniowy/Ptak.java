package zad1.one.ograniczeniowy;

public class Ptak<T extends Skrzydla> {

    private T skrzydla;

    public Ptak(T skrzydla) {
        this.skrzydla = skrzydla;
    }

    public void trzepotajSkrzydlami(){
        skrzydla.trzepotaj();
    }

    public void zlozJajka(int number){
        System.out.println("To int, wiec ma zlozyc malo jajek: " + number);
    }

    public void zlozJajka(Integer number){
        System.out.println("To Integer, wiec ma zlozyc dwa razy wiecej jajek: " + number*2);
    }

}
