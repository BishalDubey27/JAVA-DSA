public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b; // addition
        int d = a - b; // subtraction
        int e = a * b; // multiplication
        int f = a / b; // division
        int g = a % b; // modulus

        System.out.println("Addition: " + c);
        System.out.println("Subtraction: " + d);
        System.out.println("Multiplication: " + e);
        System.out.println("Division: " + f);
        System.out.println("Modulus: " + g);

        // Increment and Decrement Operators
        a++; // increment
        b--; // decrement

        System.out.println("After Increment, a: " + a);
        System.out.println("After Decrement, b: " + b);

        int x = 10;
        int y = ++x;
        int z = x++;
        System.out.println("Value of y: " + y); // 11
        System.out.println("Value of x: " + x); // 11
        System.out.println("Value of z: " + z); // 11


        int w = 10;
        int m = w--;
        System.out.println("Value of m: " + m); // 10
        System.out.println("Value of w: " + w); // 9
    }
    
}
