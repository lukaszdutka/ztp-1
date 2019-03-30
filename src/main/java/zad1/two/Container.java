package zad1.two;

import java.util.ArrayList;

class Container<T extends Weapon> {

    private ArrayList<T> list;

    Container() {
        list = new ArrayList<>();
    }

    boolean add(T item){
        return list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    int size(){
        return list.size();
    }
}
