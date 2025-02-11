package Java8Feature2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q6b {
    public static void main(String[] args) {
        ZonedDateTime z1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime z3= ZonedDateTime.now();
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}
