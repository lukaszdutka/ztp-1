package zad2.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Wydzial wydzial1 = new Wydzial("Informatyki i zarzadzania");
        Wydzial wydzial2 = new Wydzial("Budownictwo");

        ArrayList<Student> studenci = new ArrayList<>();

        studenci.add(new Student("Lukasz", "Dutka", 22, false, wydzial1));
        studenci.add(new Student("Karol", "Kutomeda", 35, false, wydzial1));
        studenci.add(new Student("Marcin", "Kokoszka", 30, false, wydzial2));
        studenci.add(new Student("Michal", "Urban", 23, false, wydzial1));
        studenci.add(new Student("Karolina", "Marczak", 25, true, wydzial2));

        List<Student> mlodzi = studenci.stream().filter(s -> s.age < 25).collect(Collectors.toList());
        System.out.println("Mlodzi: " + mlodzi);

        List<Student> kobiety = studenci.stream().filter(s -> s.isFemale).collect(Collectors.toList());
        System.out.println("Kobiety: " + kobiety);

        //print wydzialy
        List<Wydzial> wydzialy = studenci.stream().map(s -> s.wydzial).collect(Collectors.toList());
        wydzialy.stream().forEach(w -> System.out.println(w.name));

        System.out.println("Max wiek: " + studenci.stream().max(Comparator.comparingInt(a -> a.age)).get().age);
        System.out.println("Min wiek: " + studenci.stream().min(Comparator.comparingInt(a -> a.age)).get().age);

    }
}
