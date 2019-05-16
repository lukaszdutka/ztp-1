package zad3.one;

public class Main {

    //zaleznosci 3 glebokosci np. wydzial, wydzial, student

    //Procedura do losowego wypelniania takeij struktury
    //np. 1 uczelnia, 5 wydzialow, po 100 studentow

    //3 metody glebokiego kopiowania

    //mechanizm sprawdzania poprawnosci wykonania kopii (equals)

    //porownaj wydajnosc metod glebokiego kopiowania dla
    //100, 1k, 10k obiektow

    //raport

    public static void main(String[] args) {
        Country c = CountryCreator.create(10, 100);

        for(int n = 100; n <= 10_0000; n*=10) {

            Tim.start();
            for (int i = 0; i < n; i++) {
                Country c1 = new Country(c);
            }
            Tim.stop(n, "constructor");

            Tim.start();
            for (int i = 0; i < n; i++) {
                Country c1 = CopyLibrary.deepCopy(c);
            }
            Tim.stop(n, "deepCopy method");

//            Tim.start();
//            for (int i = 0; i < n; i++) {
//                Country c1 = CopyLibrary.serializeAndDeserialize(c);
//            }
//            Tim.stop(n, "serialization");

        }


//        Country c1 = new Country(c);
//        Country c2 = CopyLibrary.deepCopy(c);
//        Country c3 = CopyLibrary.serializeAndDeserialize(c);
//
//        System.out.println(c.equals(c2));
//        System.out.println(c2.equals(c3));
//        System.out.println(c.equals(c3));
    }

}
