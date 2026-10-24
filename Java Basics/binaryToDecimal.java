public class binaryToDecimal {
    public static void binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while (binary > 0){
            int lastDigit = binary % 10;
            System.out.println(lastDigit);
            decimal = decimal + lastDigit * (int)Math.pow(2, power);
            System.out.println(decimal);
            power++;
            binary = binary / 10;
            System.out.println(binary);
        }
        System.out.println("The decimal equivalent is: " + decimal);
    }

    public static void main(String[] args){
        int binary = 111;
        binaryToDecimal(binary);
    }
    
}
