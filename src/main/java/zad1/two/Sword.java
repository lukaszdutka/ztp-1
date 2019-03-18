package zad1.two;

public class Sword extends Bladed {

    private double length;

    public Sword(double weight, boolean bothSidesSharp, double length) {
        super(weight, bothSidesSharp);
        this.length = length;
    }

    public String pokazDane() {
        return "Sword{" +
                "length=" + length +
                "m, bothSidesSharp=" + bothSidesSharp +
                ", weight=" + weight +
                "kg}";
    }
}
