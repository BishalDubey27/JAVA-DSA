package Abstraction;

public class OnlineStore extends Product {

    public static void main(String[] args) {
        Product clothing = new Clothing("T-Shirt", 20.0);
        Product electronics = new Electronics("Smartphone", 500.0);

        System.out.println("Clothing Discount: $" + clothing.calculateDiscount());
        System.out.println("Clothing Tax: $" + clothing.calculateTax());
        System.out.println("Clothing Shipping Cost: $" + clothing.calculateShippingCost());

        System.out.println("Electronics Discount: $" + electronics.calculateDiscount());
        System.out.println("Electronics Tax: $" + electronics.calculateTax());
        System.out.println("Electronics Shipping Cost: $" + electronics.calculateShippingCost());
    }
    
}
