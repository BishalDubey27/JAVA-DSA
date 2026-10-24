public class Subsequences{
    public static void main(String[] args){
        f("abc", 0, "");
    }

    public static void f(String str, int idx, String output){

        // Base case: If the index reaches the length of the string, print the current output
        if(idx == str.length()){
            System.out.println("[" + output + "]");
            return;
        }

        // Include the character at the current index
        f(str, idx + 1, output + str.charAt(idx));

        // Exclude the character at the current index
        f(str, idx + 1, output);
    }
}