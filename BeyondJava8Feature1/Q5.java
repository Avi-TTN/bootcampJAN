package BeyondJava8Feature1;

public class Q5 {
    public static void main(String[] args) {
        // repeat()
        String s = "hello ";
        System.out.println("repeat(): " + s.repeat(2));

        String s2 = "\u2005 \n \t    World       ";
        // strip()
        System.out.println("strip(): '" + s2.strip());
        // trim()
        System.out.println("trim(): '" + s2.trim());

        String s3 = " ";
        // isBlank()
        System.out.println("isBlank(): " + s3.isBlank());
        System.out.println("isEmpty(): " + s3.isEmpty());

        // indent()
        System.out.println("indent(): '" + s.indent(20).indent(-5));

        // transform()
        String s4 = s.transform(String::toUpperCase);
        System.out.println("transform(): " + s4);

        // tripleQuotes
        String s5 = """
    Hi  
        my 
    name
        is
    Avi
""";
        System.out.println("tripleQuotes(): \n" + s5);

        // stripIndent()
        String s6 = "\thi\n" +
                "\t\tmy\n" +
                "\t\t\tname\n" +
                "\t\tis\n" +
                "\tavi";
        System.out.println(s6);
        System.out.println(s6.stripIndent());

        // translateEscapes()
        String s7 = "Line1\nLine2\tTab";
        System.out.println("translateEscapes(): " + s7.translateEscapes());

        // formatted()
        String formattedString = "Hello, %s! You have %d new messages.".formatted("Avi", 5);
        System.out.println("formatted(): " + formattedString);
    }
}
