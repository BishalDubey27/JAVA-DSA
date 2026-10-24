package String;

public class replaceAscii {

    public static void main(String[] args) {

        System.out.println(replaceAscii("cd"));

        // replace Ascii value of each character in the string with its corresponding ASCII value
    }
    
    public static String replaceAscii(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch % 2 == 0) {

                ch = (char) (ch + 1);
                sb.setCharAt(i, ch);
            } else {
                ch = (char) (ch - 1);
                sb.setCharAt(i, ch);
            }

        }
        
        return sb.toString();
        
    }
}
