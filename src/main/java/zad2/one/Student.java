package zad2.one;

public class Student {

    String name;
    String surname;
    int age;
    boolean isFemale;
    Wydzial wydzial;

    public Student(String name, String surname, int age, boolean isFemale, Wydzial wydzial) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isFemale = isFemale;
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isFemale=" + isFemale +
                ", wydzial=" + wydzial +
                '}';
    }
}
