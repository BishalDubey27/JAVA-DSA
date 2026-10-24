import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // if statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // if-else-if statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }


        int l = 10;
        if (l%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        Scanner sc  = new Scanner(System.in);
        int m = sc.nextInt();
        if (m%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // ternanry operator

        int n = 10;
        String result = (n%2==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
