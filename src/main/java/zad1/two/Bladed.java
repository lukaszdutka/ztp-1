package zad1.two;

class Bladed extends Weapon {

    boolean bothSidesSharp;

    Bladed(double weight, boolean bothSidesSharp) {
        super(weight);
        this.bothSidesSharp = bothSidesSharp;
    }

    String pokazDaneBladed() {
        return "Bladed{" +
                "bothSidesSharp=" + bothSidesSharp +
                ", weight=" + weight +
                "kg}";
    }
}
