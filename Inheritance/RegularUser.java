package Inheritance;

public class RegularUser extends User_Inheritance {

    public RegularUser(String username, String email) {
        super(username, email);
    }

    public void browseProducts() {
        System.out.println("Regular user is browsing products");
    }

    @Override
    public void showDashboard() {
        System.out.println("Regular user's dashboard");
    }

    public static void main(String[] args){
        RegularUser regularUser = new RegularUser("JohnDoe","john@gmail.com");
        regularUser.login();
        regularUser.browseProducts();
        regularUser.showDashboard();
    }
}
