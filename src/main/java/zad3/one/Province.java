package zad3.one;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Province implements Serializable {

    private String name;
    private ArrayList<City> cities;

    public Province(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public void addCity(City c) {
        cities.add(c);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Province)) {
            return false;
        }
        Province province = (Province) obj;
        return Objects.equals(name, province.name) && cities.equals(province.cities);
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + "'" +
                ", cities=" + cities +
                "}";
    }

    public String getName() {
        return name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}
