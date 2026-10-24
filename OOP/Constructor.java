package OOP;

public class Constructor {

    public static void main(String[] args) {
//        A ref1 = new A();   // default constructor
//        A r = new A(100,"bishal");
        A ref = new A(100,200);
//        ref1.show();

        A ref1 = new A(ref); // copy constructor
        System.out.println(ref1.y + " " + ref1.x);


    }
}
class A{
    int a ;
    String name;
    int x;
    int y;
    String z;
//        A(){
//        a = 0;
//        name = "bishal";
//        x = 20;
//    }

//    PARAMETERIZED CONSTRUCTOR

    A(int a , int b){
        x = a;
        y = b;
        System.out.println(y + " " + x);
    }
//
//    A(int a , String b){
//        x = a;
//        z = b;
//        System.out.println(x + " " + z);
//    }
//
    A(A ref2){
            y = ref2.y;
            x= ref2.x;
            System.out.println(y + " " + x);
    }

    void show(){
//        System.out.println(a + " " + name);
        System.out.println(a + " " + x);
    }
}