package zad1.two;

public class Bladed extends Weapon {

    boolean bothSidesSharp;

    public Bladed(double weight, boolean bothSidesSharp) {
        super(weight);
        this.bothSidesSharp = bothSidesSharp;
    }

    public String pokazDaneBladed() {
        return "Bladed{" +
                "bothSidesSharp=" + bothSidesSharp +
                ", weight=" + weight +
                "kg}";
    }
}
