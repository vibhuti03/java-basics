public class StringBasics {
    public static void main(String[] args) {
        String hello = "     Hello World Hello     ";
        System.out.println("String is - [" + hello + "]");

        char c = hello.charAt(0);
        System.out.println("charAt(0) - " + c);
        System.out.println("length - " + hello.length());
        System.out.println("indexOf() - " +hello.indexOf("Hello"));
        System.out.println("contains() - " + hello.contains("o"));
        System.out.println("trim() - [" + hello.trim()+"]");

        hello = hello.trim();

        System.out.println("compareTo() - " + hello.compareTo("hello world"));
        System.out.println("concat() - " + hello.concat(" Beautiful"));
        System.out.println("join() - " + String.join(hello, " Beautiful"));

        System.out.println();

        int x = 20;
        String y = "30";
        String z = "40";

        System.out.println("y+z=" +(y+z)); //3040
        System.out.println("x+y+z=" +(x+y+z)); //203040


    }
}
