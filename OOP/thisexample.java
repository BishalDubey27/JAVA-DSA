package OOP;

public class thisexample {
    int a, b;

    thisexample(int a, int b) {
        this.a = a;
        this.b = b;

        System.out.println(this.a + " " + this.b);
        add(this);  //here this is nothing but the object c1 ans its values are populated here
        System.out.println(this.a + " " + this.b);


    }



    void add(thisexample other) {
        other.a +=2;
        other.b +=2; 
    }

    public static void main(String[] args) {
        thisexample c1 = new thisexample(2, 3);
        
    }
}