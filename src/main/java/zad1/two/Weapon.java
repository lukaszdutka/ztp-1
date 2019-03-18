package zad1.two;

public class Weapon {

    double weight;

    public Weapon(double weight) {
        this.weight = weight;
    }

    public String pokazDane() {
        return "Weapon{" +
                "weight=" + weight +
                "kg}";
    }
}
