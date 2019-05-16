package zad3.one;

import java.util.Random;

public class CityCreator {

    private static final Random R = new Random();
    private static String[] cityPrefix = {"Kozia ", "Zielona ", "Szarobura ", "", "", "", ""};
    private static String[] cityFirstSyllable = {"Gło", "War", "Wroc", "Gdy", "Wól"};
    private static String[] citySecondSyllable = {"sza", "go", "cin", "ław", ""};
    private static String[] cityThirdSyllable = {"wa", "ka", "ska", "nia"};

    public static City create() {
        return new City(cityName(), cityPopulation());
    }

    private static int cityPopulation() {
        return R.nextInt(1_000_000) + 5000;
    }

    private static String cityName() {
        return cityPrefix[R.nextInt(cityPrefix.length)] +
                cityFirstSyllable[R.nextInt(cityFirstSyllable.length)] +
                citySecondSyllable[R.nextInt(citySecondSyllable.length)] +
                cityThirdSyllable[R.nextInt(cityThirdSyllable.length)];
    }
}
