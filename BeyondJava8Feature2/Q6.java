package BeyondJava8Feature2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println("\n ///////////// Sequenced List //////////// \n");
        System.out.println("Initial List");
        System.out.println(ls);
        System.out.println("addFirst(): ");
        ls.addFirst(0);
        System.out.println(ls);
        System.out.println("addLast(): ");
        ls.addLast(4);
        System.out.println(ls);
        System.out.println("removeFirst(): ");
        ls.removeFirst();
        System.out.println(ls);
        System.out.println("removeLast(): ");
        ls.removeLast();
        System.out.println(ls);
        System.out.println("getFirst(): ");
        System.out.println(ls.getFirst());
        System.out.println("getLast(): ");
        System.out.println(ls.getLast());
        System.out.println("reversed()");
        System.out.println(ls.reversed());

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("\n ///////////// Sequenced Set //////////// \n");
        System.out.println("Initial Set");
        System.out.println(set);
        System.out.println("addFirst(): ");
        set.addFirst(0);
        System.out.println(set);
        System.out.println("addLast(): ");
        set.addLast(4);
        System.out.println(set);
        System.out.println("removeFirst(): ");
        set.removeFirst();
        System.out.println(set);
        System.out.println("removeLast(): ");
        set.removeLast();
        System.out.println(set);
        System.out.println("getFirst(): ");
        System.out.println(set.getFirst());
        System.out.println("getLast(): ");
        System.out.println(set.getLast());
        System.out.println("reversed()");
        System.out.println(set.reversed());
    }

}
