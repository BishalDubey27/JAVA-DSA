package String;

public class demoString {
    public static void main(String[] args) {
        String first = "ram";
        String second = "second";
        String third = "ram";      
         System.out.println(first);
         System.out.println(second);
         System.out.println(third);
         boolean result = first.equals(third);
         boolean res = first == third;
         System.out.println("result is: " + result);
         System.out.println("res is: " + res);

         String Str = new String("Hello World");
         String Str1 = new String("Hello World");
         System.out.println(Str);
         boolean res1 = Str.equals(Str1);
         boolean res2 = Str == Str1;
        System.out.println("res1 is: " + res1);
        System.out.println("res2 is: " + res2);

        // Escape sequence in string

        String ex = "Hello \nWorld";
        System.out.println(ex);

        String ex1 = "Hello \tWorld";
        System.out.println(ex1);

        String ex2 = "Hello  \bWorld";
        System.out.println(ex2);


        String example = "hello \"world\"";
        System.out.println(example);

         System.out.println("String length is: " + Str.length());
    }
    
}
