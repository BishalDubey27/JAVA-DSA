package Inheritance;

public class User_Inheritance {
    private String username;
    protected String email;

    public User_Inheritance(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login(){
        System.out.println("User " + username + " logged in"); 
    }

    public void showDashboard(){
        System.out.println(username + "'s dashboard");
    }

    
}
