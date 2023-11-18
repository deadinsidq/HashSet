package wtf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCustom<T> extends HashSet<T> {
    private HashMap<T, Boolean> map;

    public HashSetCustom() {
        map = new HashMap<>();
    }

    public boolean add(T element) {
        map.put(element, true);
        return false;
    }

    public boolean remove(Object element) {
        map.remove(element);
        return false;
    }

    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int size() {
        return map.size();
    }

    public void clear() {
        map.clear();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }
}