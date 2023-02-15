import java.io.Console;

public class Main {

    public static void main(String[] args) {
        minMax();
    }

    public static void minMax(){

        Console cons = System.console(); //Returns the unique Console object from JVM
        int min = 0,max =0, input =0;
        boolean first = true;
        boolean quit = false;
        while(!quit){
            boolean isValid = false;
            while(!isValid) {
                System.out.println("Enter Integer, or type a character to quit:");
                try {
                    if (first) {
                        System.out.println(">>");
                        min = Integer.parseInt(cons.readLine());
                        max = min;
                        input = min;
                        first = false;
                    } else {
                        input = Integer.parseInt(cons.readLine());
                    }
                    isValid = true;
                } catch (NumberFormatException e) {
                    quit = true;
                    break;
                }
            }
            if (input < min) min = input;
            if (input > max) max = input;
            System.out.printf("Max: %d", max);
            System.out.printf("Min: %d", min);
            System.out.println();
        }

    }

}