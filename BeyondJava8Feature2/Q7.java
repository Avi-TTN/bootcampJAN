package BeyondJava8Feature2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Q7 {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('a', 1);
        map.put('b',2);
        map.put('c',3);
        System.out.println("firstEntry(): ");
        System.out.println(map.firstEntry());
        System.out.println("lastEntry():");
        System.out.println(map.lastEntry());
        System.out.println("pollFirstEntry(): ");
        System.out.println(map.pollFirstEntry());
        System.out.println("map after pollFirstEntry(): ");
        System.out.println(map);
        System.out.println("pollLastEntry(): ");
        System.out.println(map.pollLastEntry());
        System.out.println("map after pollLastEntry(): ");
        System.out.println(map);
        System.out.println("putFirst(): ");
        map.putFirst('a', 1);
        System.out.println(map);
        System.out.println("putLast(): ");
        map.putLast('c',3);
        System.out.println(map);
        System.out.println("reversed(): ");
        System.out.println(map.reversed());
    }
}
