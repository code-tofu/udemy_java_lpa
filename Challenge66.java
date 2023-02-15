public class Main {

    public static void main(String[] args) {
        int digit = 1234;
        System.out.print(sumDigits(digit));

    }
    public static int sumDigits(int number){
        if(number<0) return-1;
        int sum = 0;
        while(number !=0){
            sum += number % 10;
            number = number /10;
            System.out.printf("%d | %d\n",sum,number);
        }
        return sum;
    }
}