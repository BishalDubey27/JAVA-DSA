
// method overloading
// compile time polymorphism
// same method name but different parameters
// static binding

package OOP;

// class a {
//     void add() {
//         int a = 10;
//         int b = 20;
//         int c = a + b;
//         System.err.println(c);
//     }

//     void add(int a, int b) {
//         int c = a + b;
//         System.err.println(c);
//     }
// }

class animal {

    void shoW() {
        System.out.println("animal");
    }
}

class dog extends animal {
    @Override
    void shoW() {
        System.out.println("dog");
    }
}
class cat extends animal {
    @Override
    void shoW() {
        System.out.println("cat");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        // a ref = new a();
        // ref.add();
        // ref.add(100, 200);

        animal ref = new dog();
        ref.shoW();
        ref = new cat();
        ref.shoW();

    }

}