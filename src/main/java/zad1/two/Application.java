package zad1.two;


public class Application {

    public static void main(String[] args) {
        Weapon weapon = new Weapon(1.0);
        Weapon bladed = new Bladed(1.5, true);
        Weapon sword = new Sword(2.7, true, 1.7);

        Container<Weapon> container = new Container<>();

        container.add(weapon);
        container.add(bladed);
        container.add(sword);

        Wyswietlacz.wyswietlWszystkie(container);


    }

}
