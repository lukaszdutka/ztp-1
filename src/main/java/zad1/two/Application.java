package zad1.two;


public class Application {

    public static void main(String[] args) {
        Weapon weapon = new Weapon(1.0);
        Weapon bladed = new Bladed(1.5, true);
        Weapon sword = new Sword(2.7, true, 1.7);

        Container<Weapon> weapons = new Container<>();

        weapons.add(weapon);
        weapons.add(bladed);
        weapons.add(sword);

        for(int i = 0 ; i < weapons.size(); i++){
            System.out.println(weapons.get(i).pokazDane());
        }


    }

}
