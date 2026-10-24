package Abstraction;

public class Electronics extends Product {
    
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.1; // 10% discount
    }

    @Override
    double calculateTax() {
        return price * 0.15; // 15% tax
    }

    @Override
    double calculateShippingCost() {
        return 5.0; // flat shipping cost
    }
}
