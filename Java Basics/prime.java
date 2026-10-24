public class prime {
    
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_in_range(int end){
        for (int i = 2; i <= end; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        prime_in_range(100);
        
        }
    }
