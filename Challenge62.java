public class Main {

    public static void main(String[] args) {
        int max = 1000;
        int count = 0;
        int limit = 5;
        int sum = 0;
        for (int i = 0; i<max;i++){
            if( ((i % 3) == 0) && ((i % 5) == 0)){
                count ++;
                sum += i;
                System.out.println(i);
            }
            if(count>limit) break;
        }
        System.out.print("sum:" + Integer.toString(sum));
    }

}