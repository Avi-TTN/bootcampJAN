package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Float> ls = new ArrayList<Float>();
        ls.add(10.2f);
        ls.add(14.13f);
        ls.add(14.01f);
        ls.add(94.31f);
        ls.add(41.41f);
        Iterator<Float> it = ls.iterator();
        float sum = 0f;
        while(it.hasNext()){
            sum += it.next();
        }
        System.out.println("SUM : " + sum);
    }
}
