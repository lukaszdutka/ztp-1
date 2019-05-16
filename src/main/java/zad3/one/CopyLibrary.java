package zad3.one;

import java.io.*;

class CopyLibrary {

    static Country deepCopy(Country oldCountry) {
        Country country = new Country(oldCountry.getName());

        for (Province oldProvince : oldCountry.getProvinces()) {
            Province province = new Province(oldProvince.getName());

            for (City oldCity : oldProvince.getCities()) {
                City city = new City(oldCity.getName(), oldCity.getPopulation());
                province.addCity(city);
            }
            country.addProvince(province);
        }

        return country;
    }

    public static Country serializeAndDeserialize(Country oldCountry) {
        Country country = null;

        try (FileOutputStream file = new FileOutputStream("country.bin")) {
            try (ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(oldCountry);
            }
        } catch (Exception ignore) {
            System.out.println("Wrong");
        }
        try (FileInputStream file = new FileInputStream("country.bin")) {
            try (ObjectInputStream in = new ObjectInputStream(file)) {
                country = (Country) in.readObject();
            }
        } catch (Exception ignore) {
            System.out.println("Wrong");
        }

        return country;
    }
}
