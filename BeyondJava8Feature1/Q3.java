package BeyondJava8Feature1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5);
        Set<Integer> setList = Set.of(1,2,3,4,5);
        Map<Integer,String> mapList = Map.of(1,"A", 2, "B", 3, "C");
        System.out.println(intList);
        System.out.println(setList);
        System.out.println(mapList);
    }
}
