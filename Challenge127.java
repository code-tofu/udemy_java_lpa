import java.io.Console;
import java.util.Arrays;

public class Main {
    private static int maxLen = 5;
    public static void main(String[] args) {

        int[] intArray = readIntegers(maxLen);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(reverse(intArray)));

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

    public static int[] reverse(int[] intArray){
        int min = intArray[0];
        for(int i = 0; i < (intArray.length/2) ; i++){
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        return intArray;
    }

}