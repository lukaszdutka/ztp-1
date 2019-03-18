package zad1.two;

import java.util.ArrayList;

public class Container<T extends Weapon> {

    private ArrayList<T> list;

    public Container() {
        list = new ArrayList<>();
    }

    public boolean add(T item){
        return list.add(item);
    }

    public T get(int i){
        return list.get(i);
    }

    public int size(){
        return list.size();
    }
}
