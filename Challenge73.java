import java.io.Console;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = readIntegers(5);
        System.out.println("New Array:");
        System.out.println(Arrays.toString(intArray));

    }

    public static int[] readIntegers(int size){
        int[] intArray = new int[size];
        Console cons = System.console(); //Returns the unique Console object from JVM
        int i = 0;
        int sum = 0;
        while (i < size){
            boolean notValid = true;
            int input = 0;
            while(notValid){
                System.out.println("Input Integer:");
                try
                {
                    input = Integer.parseInt(cons.readLine());
                    notValid = false;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid Number");
                }
            }
            intArray[i] = input;
            i++;
            sum += input;
        }
        System.out.println("Sum:");
        System.out.println(sum);
        return intArray;
    }

}