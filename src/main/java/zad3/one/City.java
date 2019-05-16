package zad3.one;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City city = (City) obj;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + "'" +
                ", population=" + population +
                "}";
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
