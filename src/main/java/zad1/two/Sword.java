package zad1.two;

class Sword extends Bladed {

    private double length;

    Sword(double weight, boolean bothSidesSharp, double length) {
        super(weight, bothSidesSharp);
        this.length = length;
    }

    String pokazDaneSword() {
        return "Sword{" +
                "length=" + length +
                "m, bothSidesSharp=" + bothSidesSharp +
                ", weight=" + weight +
                "kg}";
    }
}
