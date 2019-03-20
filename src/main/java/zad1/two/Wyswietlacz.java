package zad1.two;

class Wyswietlacz {

    private static void wyswietlWeapon(Weapon w) {
        System.out.println(w.pokazDaneWeapon());
    }

    private static void wyswietlBladed(Bladed b) {
        System.out.println(b.pokazDaneBladed());
    }

    private static void wyswietlSword(Sword w) {
        System.out.println(w.pokazDaneSword());
    }

    static void wyswietlWszystkie(Container<Weapon> container) {
        for (int i = 0; i < container.size(); i++) {
            print(container.get(i));
            System.out.println();
        }
    }

    private static void print(Weapon w) {
        try{
            wyswietlWeapon(w);
        } catch (Exception e){
            System.out.println("To nie jest Weapon: " + w);
        }

        try{
            wyswietlBladed((Bladed) w);
        } catch (Exception e){
            System.out.println("To nie jest Bladed: " + w);
        }

        try{
            wyswietlSword((Sword) w);
        } catch (Exception e){
            System.out.println("To nie jest Sword: " + w);
        }
    }
}
