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
        }
    }

    private static void print(Weapon w) {
        if (w instanceof Sword) {
            wyswietlSword((Sword) w);
        } else if (w instanceof Bladed) {
            wyswietlBladed((Bladed) w);
        } else {
            wyswietlWeapon(w);
        }
    }
}
