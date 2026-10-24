import java.util.*;
public class userInput {
    public static void main(String[] args) {

////        object of the scanner class
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter an inter value ");
//        int number = sc.nextInt();
//        System.out.println("you entered " + number);
//
//        String word = sc.next();
//        System.out.println(word);
//
//        String sentence = sc.nextLine();
//        System.out.println(sentence);



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println(word);


        sc.nextLine();      // Consume the leftover newline

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println(sentence);
    }
}