package OOP;

public class Bicycle {

    public int gear = 3;


    private int price;
    public int setPrice(int newPrice) {
        this.price = newPrice;
        return this.price;
    }
    public int getPrice() {
        return this.price;
    }


    public void breaking() {
        System.out.println("working stopped");
    }
}