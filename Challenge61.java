public class Main {

    public static void main(String[] args) {
        int max = 100;
        int count = 0;
        for (int i =0; i<max;i++){
            System.out.printf("%d is " + (isPrime(i) ? "a prime number" : "not a prime number") + "\n",i);
            if(isPrime(i)) count ++;
            if(count>20) break;
        }
    }

    public static boolean isPrime(int wholenum){
        if (wholenum <= 2) {
            return (wholenum == 2);
        }
        for (int divisor = 2; divisor <= wholenum / 2; divisor++) {
            if (wholenum % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}