import java.util.*;
public class type_conversion {
    public static void main(String[] args) {
        int a = 10;
        long b = a; // implicit type conversion (widening)
        System.out.println("Value of b: " + b);


        // long c = 10;
        // int d = c; // explicit type conversion (narrowing)
        // System.out.println("Value of d: " + d);

        char e = 'a';
        int f = 'b';
        System.out.println((int)(e)); 
        System.out.println((int)(f));
        System.out.println(e-f);
        System.out.println(e);
        System.out.println(f);

    }
}