package Abstraction;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.2; // 20% discount
    }

    @Override
    double calculateTax() {
        return price * 0.1; // 10% tax
    }

    @Override
    double calculateShippingCost() {
        return 3.0; // flat shipping cost
    }
    
}
