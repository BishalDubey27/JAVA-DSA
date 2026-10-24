package Functions;

public class demoFunctions {
    public static void main(String[] args) {

        greet();
        System.out.println("see you soon");

    
        int a = 10;
        int b = 20;
        System.out.println(addTwoNos(a, b));

        System.out.println(addTwoNos(100,100));
        

    }
    
    public static void greet() {
        System.out.println("hello");
    }


    public static int addTwoNos(int a, int b) {
        
        int sum = a + b;
        return sum;
    }
}

