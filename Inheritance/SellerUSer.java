package Inheritance;

public class SellerUSer extends User_Inheritance {
    public SellerUSer(String username, String email) {
        super(username, email);
    }

    public void addProducts() {
        System.out.println("seller is adding products");
    }

    @Override 
    public void showDashboard() {
        System.out.println("Seller's dashboard");
    }
    
    public static void main(String[] args){
        SellerUSer seller = new SellerUSer("Bishal", "bishal@gmail.com");
        seller.login();
        seller.addProducts();
        seller.showDashboard();
    }
}
