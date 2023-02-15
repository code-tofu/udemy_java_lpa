public class Main {

    public static void main(String[] args) {
        int min = 5;
        int max = 20;
        int i = min;

        while(i<=max){
            if(isEvenNumber(i))
                System.out.println(i); //don't need Integer.toString because print getstring
            i++;
        }

    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}