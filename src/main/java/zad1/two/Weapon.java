package zad1.two;

class Weapon {

    double weight;

    Weapon(double weight) {
        this.weight = weight;
    }

    String pokazDaneWeapon() {
        return "Weapon{" +
                "weight=" + weight +
                "kg}";
    }
}
