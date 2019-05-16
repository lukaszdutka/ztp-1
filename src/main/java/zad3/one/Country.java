package zad3.one;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Country implements Serializable {

    private String name;
    private ArrayList<Province> provinces;

    public Country(String name) {
        this.name = name;
        this.provinces = new ArrayList<>();
    }

    public Country(Country oldCountry) {
        this(oldCountry.getName());

        for (Province oldProvince : oldCountry.getProvinces()) {
            Province province = new Province(oldProvince.getName());

            for (City oldCity : oldProvince.getCities()) {
                City city = new City(oldCity.getName(), oldCity.getPopulation());
                province.addCity(city);
            }
            this.addProvince(province);
        }
    }

    public void addProvince(Province p) {
        provinces.add(p);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return Objects.equals(name, country.name) && provinces.equals(country.provinces);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + "'" +
                ", provinces=" + provinces +
                "}";
    }

    public String getName() {
        return name;
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }
}
