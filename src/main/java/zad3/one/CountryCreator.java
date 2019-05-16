package zad3.one;

import java.util.Random;

public class CountryCreator {

    private static final Random R = new Random();
    private static String[] countryPrefix = {"Wielka ", "Matka "};
    private static String[] countryFirstSyllable = {"Pol", "Niem", "Nor"};
    private static String[] countrySecondSyllable = {"", "", "we", "ta"};
    private static String[] countryThirdSyllable = {"ska", "gia", "nia"};

    public static Country create(int provinces, int citiesPerProvince) {
        Country c = new Country(countryName());

        for(int i = 0; i < provinces; i++){
            c.addProvince(ProvinceCreator.create(citiesPerProvince));
        }

        return c;
    }

    private static String countryName() {
        return countryPrefix[R.nextInt(countryPrefix.length)] +
                countryFirstSyllable[R.nextInt(countryFirstSyllable.length)] +
                countrySecondSyllable[R.nextInt(countrySecondSyllable.length)] +
                countryThirdSyllable[R.nextInt(countryThirdSyllable.length)];
    }
}
