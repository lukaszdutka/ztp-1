package zad3.one;

import java.util.Random;

public class ProvinceCreator {

    private static final Random R = new Random();
    private static String[] provincePrefix = {"Dolna ", "Zachodnia ", "Górna ", "Wschodnia ", "", "", "", "", ""};
    private static String[] provinceFirstSyllable = {"Ko", "Wiel", "Nor"};
    private static String[] provinceSecondSyllable = {"le", "ko", "we", "ta"};
    private static String[] provinceThirdSyllable = {"chia", "ska", "nia"};
    
    public static Province create(int citiesPerProvince) {
        Province p = new Province(provinceName());

        for(int i = 0; i < citiesPerProvince; i++){
            p.addCity(CityCreator.create());
        }

        return p;
    }

    private static String provinceName() {
        return provincePrefix[R.nextInt(provincePrefix.length)] +
                provinceFirstSyllable[R.nextInt(provinceFirstSyllable.length)] +
                provinceSecondSyllable[R.nextInt(provinceSecondSyllable.length)] +
                provinceThirdSyllable[R.nextInt(provinceThirdSyllable.length)];
    }
}
