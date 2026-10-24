public class RemoveOccuranceOfx {
    
    public static void main(String[] args) {
        String str = "axxxbxxdffcxd";
        f(str, 0);
    }

    public static void f(String str,int idx){
        if(idx >= str.length()) return;
        if (str.charAt(idx) != 'x'){
            System.out.print(str.charAt(idx));
        }
        f(str, idx+1);
    }
}
