package hashset;

import java.util.Collection;
import java.util.HashMap;
import java.io.InvalidObjectException;
import java.util.Iterator;

import static java.util.Collections.addAll;

public class HashSet {

    public static void main(String[] args){
        HashSet hashSet=new HashSet();

        hashSet.add("222");
        hashSet.add("222222");


        System.out.println(hashSet.size());

        hashSet.clear();

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(3));
    }

    private static transient HashMap<String,Integer> map;

    private static final Integer PRESENT = new Integer(3);

    public HashSet() {
        map = new HashMap<>();
    }

    public  HashSet(Collection<String> c) {
        map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));
        addAll(c);
    }

    public HashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public HashSet(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }

    public static Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    public static int size() {
        return map.size();
    }

    public static boolean isEmpty() {
        return map.isEmpty();
    }

    public static boolean contains(Integer i) {
        return map.containsKey(i);
    }

    public static boolean add(String e) {
        return map.put(e, PRESENT)==null;
    }

    public static boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    public static void clear(){
        map.clear();
    }


}
