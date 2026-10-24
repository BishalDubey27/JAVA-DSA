
package OOP;

public class BicycleClient {

    public static void main(String[] args) {

        Bicycle sportsBicycle = new Bicycle();
        sportsBicycle.setPrice(1000);
        System.out.println(sportsBicycle.getPrice());
        // System.out.println(sportsBicycle.price);   // error as the price is private variable and cannot be accessed outside the class

        
        System.out.println(sportsBicycle.gear);

        sportsBicycle.breaking();
    }
}