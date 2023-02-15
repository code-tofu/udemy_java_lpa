import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    private static int arrayMax = 20;
    private static int numberMax = 99;
    public static void main(String[] args) {

        //this can be a method
        Random rand = new Random();
        int size = rand.nextInt(arrayMax);
        int[] intArray = new int[size];
        for (int i = 0; i < size;i++){
            intArray[i] = rand.nextInt(numberMax);
        }
        System.out.println(Arrays.toString(intArray));

        //using Array/Collections methods:
//        Arrays.sort(intArray);
//        Collections.reverse(Arrays.asList(intArray)); //note that arrays is not a subclass of collections

        /*
        Arrays.sort(intArray,Collections.reverseOrder()) does not work
        because those methods require reference types (Integer) instead of primitive types (int).
`       */

        //cannot assign like this: intArray = reverseSort(intArray);
        int[] reversedArray = reverseSort(intArray);
//        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseSort(int[] intArray){

        int size = intArray.length;
        for (int i = 0; i < size-1;i++){ //can be -1 to save on last comparison
            int max = intArray[i]; //max should be the starting element not the start of the array
            int swap = 0;
            for (int j = i; j < size; j++){
                if (intArray[j] >= max){
                    max = intArray[j];
                    swap = j;
                }
            }
            //cannot use a swap function because primitives are pass by value;
            int temp = intArray[i];
            intArray[i]=intArray[swap];
            intArray[swap] = temp;
            System.out.println(Arrays.toString(intArray));
        }
        return intArray;
    }


}

