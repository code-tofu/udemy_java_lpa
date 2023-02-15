import java.io.Console;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = readIntegers(5);
        System.out.println("New Array:");
        System.out.println(Arrays.toString(intArray));
        System.out.printf("Minimum Element: %d", findMin(intArray));

    }

    public static int[] readIntegers(int size){
        int[] intArray = new int[size];
        Console cons = System.console(); //Returns the unique Console object from JVM
        int i = 0;
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
        }
        return intArray;
    }

    public static int findMin(int[] intArray){
        int min = intArray[0];
        for(int i = 0; i < intArray.length ; i++){
            if(intArray[i]< min) min = intArray[i];
        }
        return min;
    }

}