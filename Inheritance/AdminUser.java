package Inheritance;

public class AdminUser extends User_Inheritance {

    public AdminUser(String username, String email) {
        super(username, email);   //here we can acces the private variable username and protected 
        // variable email from the parent class User_Inheritance using super keyword but it is 
        // not possible to access the private variable username directly in the child class AdminUser.
        // also here we are using the constructor of the parent class User_Inheritance to initialize the username and email variables in the AdminUser class.
    }

    // public void showUsername() {
    // System.out.println(username); // Compilation error as username is private in User_Inheritance class
    // }

    // public void showemail() {
    // System.out.println(email); // This will work as email is protected in User_Inheritance class
    // }



    public void manageProducts() {
        System.out.println("Admin is managing products");
    }
    

    @Override
    public void showDashboard() {
        super.showDashboard();
        System.out.println("Admin dashboard");
    }

    public static void main(String[] args){
        AdminUser admin = new AdminUser("Bishal", "bishal@example.com");
        admin.login();
        admin.manageProducts();
        admin.showDashboard();
    }
    
}
