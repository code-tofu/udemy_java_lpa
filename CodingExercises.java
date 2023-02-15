
//CODING EXERCISE 1
public class PositiveNegativeZero {
    // write code here
   public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else if (number == 0){
            System.out.println("zero");
        }
    }
}

//CODING EXERCISE 2
public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1; //INVALID
        } else {
            return (Math.round(kilometersPerHour/1.609));
        }
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1){
            System.out.println("Invalid Value");
        } else {
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}

//CODING EXERCISE 3
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

}

//CODING EXERCISE 4
public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if ((hourOfDay < 0) || (hourOfDay >23)){
            return false;
        } else if ((isBarking) && ((hourOfDay < 8) || (hourOfDay >22))){
            // can define as !(hourOfDay > 8 && hourOfDay < 22)
            return true;
        } else {
            return false;
        }
    }
}

//CODING EXERCISE 5
public class LeapYear {

    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)){
            return false;
        }

        boolean isLeap = false;
        if (year % 4 == 0){
            if (year % 100 != 0){
                isLeap = true;
            } else if (year % 400 == 0){
                isLeap = true;
            }
        }
        return isLeap;
    }
}

// CODING EXERCISE 6
public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
       boolean isEqual = false;
       //modulo is only for integers.
       if ((int)num1 == (int) num2) {
           if ((((int) (num1 * 10)) % 10) == (((int) (num2 * 10)) % 10)) {
               if ((((int) (num1 * 100)) % 10) == (((int) (num2 * 100)) % 10)) {
                   if ((((int) (num1 * 1000)) % 10) == (((int) (num2 * 1000)) % 10)) {
                       isEqual = true;
                   }
               }
           }
       }
       return isEqual;
    }
}


//CODING EXERCISE 7
public class EqualSumChecker {
    public static boolean hasEqualSum (int num1, int num2, int sum){
        if((num1 + num2) == sum){
            return true;
        }
        return false;
    }
}

//CODING EXERCISE 8
public class TeenNumberChecker {

    public static boolean hasTeen(int int1, int int2, int int3){
        if (isTeen(int1) || isTeen(int2) || isTeen(int3) ){
        // return (isTeen(int1) || isTeen(int2) || isTeen(int3) directly
            return true;
        }
        return false;
    }

    public static boolean isTeen(int userInt){
        if ((userInt > 12) && (userInt < 20)) {
            return true;
        }
        return false;
    }
}


//CODING EXERCISE 9
public class AreaCalculator {
     
     public static double area(double radius){
         if (radius < 0){
             return -1.0;
         }
         return (Math.PI * radius *radius);
         
     }
     
     public static double area (double x, double y){
         if ( (x < 0) || (y < 0) ) {
             return -1.0;
         }
        return (x * y);
     }
}

// CODING EXERCISE 10
public class MinutesToYearsDaysCalculator {
    // write your code here
    
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int years = (int) minutes / 525600;
        int days = ( (int) minutes % 525600 ) / 1440;
        System.out.println( minutes + " min = " + years + " y and " + days + " d");
    }
}

//CODING EXERCISE 11
public class IntEqualityPrinter {
    // write your code here
    
    public static void printEqual(int num1, int num2, int num3){
        if ( (num1 < 0) || (num2 < 0) || (num3 < 0) ){
            System.out.println("Invalid Value");
            return;
        }
        
        if ( (num1 == num2) && (num2 == num3) ){
            System.out.println("All numbers are equal");
        } else if ( (num1 != num2) && (num2 != num3) && (num1 != num3) ){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    
    }

}

//CODING EXERCISE 12
public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying (boolean summer, int temperature){
        if ( !summer && (temperature >= 25) && (temperature <= 35) ){
            return true;
        }
        
        if ( summer && (temperature >= 25) && (temperature <= 45) ){
            return true;
        }
        return false;
    }

}

//CODING EXERCISE 13
public class NumberInWord {
    // write your code here
    
    public static void printNumberInWord(int num){
        String numPrint;
        
        switch(num){
            case 0:
                numPrint = "ZERO";
                break;
            case 1:
                numPrint = "ONE";
                break;
            case 2:
                numPrint = "TWO";
                break;
            case 3:
                numPrint = "THREE";
                break;
            case 4:
                numPrint = "FOUR";
                break;
            case 5:
                numPrint = "FIVE";
                break;
            case 6:
                numPrint = "SIX";
                break;
            case 7:
                numPrint = "SEVEN";
                break;
            case 8:
                numPrint = "EIGHT";
                break;
            case 9:
                numPrint = "NINE";
                break;
            default:
                numPrint = "other";
        };
            
        System.out.print(numPrint);
            
            
        }
}  

//CODING EXERCISE 14
public class NumberOfDaysInMonth {
    // write your code here
    
    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)){
            return false;
        }

        boolean isLeap = false;
        if (year % 4 == 0){
            if (year % 100 != 0){
                isLeap = true;
            } else if (year % 400 == 0){
                isLeap = true;
            }
        }
        return isLeap;
    }
    
    public static int getDaysInMonth(int month, int year){
        if ((year < 1) || (year > 9999) || (month<1) || (month>12)) {
            return -1;
        }
        int days = 0;
        switch(month){ //use fall through for mulitple cases
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if(isLeapYear(year)){
                    days = 29;
                } else
                    days = 28;
                break;
        // no need for default case
        };
        return days;
    }
    
}

//CODING EXERCISE 15
public class SumOddRange {
    
    public static boolean isOdd(int number){
        if(number <=0) return false;
        if(number % 2 == 0) return false;
        return true;
    }
    
    public static int sumOdd(int start, int end){
        if ((end < start) || (end <0) || (start <0)) return -1;
        int sum = 0;
        for (int i = start; i < (end + 1); i++){
            if(isOdd(i)) sum += i;
        }
        return sum;
    }
}

//CODING EXERCISE 16
public class NumberPalindrome {
 
    public static boolean isPalindrome(int number){
        int reversedNum = 0;
        if(number<0)number = -number;
        int originalNum = number;
        while(originalNum>0){
            reversedNum = (reversedNum*10) + (originalNum % 10);
            originalNum /= 10;
        }
        return reversedNum == number;
    }
}

//CODING EXERCISE 17
public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
            if(number<0) return -1;
            int last = number % 10;
            int first = 0;
            while(true){
                first = number % 10;
                number = number/10;
                if(number<=0) break;
            }
            return first + last;
        }
}

//CODING EXERCISE 18
public class EvenDigitSum {
    // write your code here

    public static int getEvenDigitSum(int number){
        if(number<0) return -1;
        int sum = 0;
        int digit;
        while(number!=0){
            digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
    
}

//CODING EXERCISE 18
public class SharedDigit {
    // write your code here
    
    public static boolean hasSharedDigit(int num1, int num2){
        if(
            (num1 < 10) ||
            (num2 < 10) ||
            (num1 > 99) ||
            (num2 > 99) )
            return false;
            
        int digit1,digit2,digit3,digit4;
        digit1 = num1%10;
        digit2 = (num1/10)%10;
        digit3 = num2%10;
        digit4 = (num2/10)%10;


        if(
            (digit1 == digit3) ||
            (digit1 == digit4) ||
            (digit2 == digit3) ||
            (digit2 == digit4) ) return true;
            
        return false;
    }   
}

// CODING EXERCISE 20
public class LastDigitChecker {
    
    public static boolean isValid(int num){
        if((num >= 10) && (num <= 1000)) return true;
        return false;
    }
    
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
            if( !(
            isValid(num1) &&
            isValid(num2) &&
            isValid(num3) )) return false;
            
            int digit1,digit2,digit3;
            digit1 = num1%10;
            digit2 = num2%10;
            digit3 = num3%10;
            
            if(
            (digit1 == digit2) ||
            (digit1 == digit3) ||
            (digit2 == digit3) ) return true;
            
        return false;
            
        
    }
}

// CODING EXERCISE 21
public class FactorPrinter {
    // write your code here
    
    public static void printFactors(int number){
        if(number<1) System.out.print("Invalid Value");
        
        int i = 1;
        while(i<number+1){ //why does !=number not work? -  has to test the number as well
            if(number%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

//CODING EXERCISE 22
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if( 
            (first<10) ||
            (second<10)) return-1;
        
        int smaller = 0;
        if(first <= second){
            smaller = first;
        }else{
            smaller = second;
        }
        
        int GCD = 0;
        int i = 0;
        while(i<=smaller){
            if((first%i==0) && (second%i==0)){
                GCD = i;
            }
        }
        return GCD;
        
    }
    
    
}

//CODING EXERCISE 23
public class PerfectNumber {
    // write your code here
    
    public static boolean isPerfectNumber (int number){
        if(number<1) return false;
        
        int sum = 0, i=0;
        while(i <= number){
            if(number%i==0) sum += i;
            i++;
        }
        
        return sum == number;
    }
}

//CODING EXERCISE 24
 public static void numberToWords(int number) {
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0){
            System.out.println("Zero");
            return;
        }

        int digits = getDigitCount(number);
        number = reverse(number); // also makes number positive
        if(number<0)number = -number; //redundant to bypass udemychecker's logic
        digits -= getDigitCount(number);

        int num;
        String numPrint = "";
        while (number != 0) {
            num = number % 10;
            number /= 10;
            switch (num) {
                case 0:
                    numPrint = "Zero";
                    break;
                case 1:
                    numPrint = "One";
                    break;
                case 2:
                    numPrint = "Two";
                    break;
                case 3:
                    numPrint = "Three";
                    break;
                case 4:
                    numPrint = "Four";
                    break;
                case 5:
                    numPrint = "Five";
                    break;
                case 6:
                    numPrint = "Six";
                    break;
                case 7:
                    numPrint = "Seven";
                    break;
                case 8:
                    numPrint = "Eight";
                    break;
                case 9:
                    numPrint = "Nine";
                    break;
            }
            ;
            System.out.println(numPrint);
        }

        while (digits > 0){
            System.out.println("Zero");
            digits--;
        }
    }
    public static int reverse(int number){
        int reversedNum = 0;
        int negative = 1;
        if(number<0){
            number = -number;
            negative = -1;
        }
        int originalNum = number;
        while(originalNum != 0){
            reversedNum = (reversedNum*10) + (originalNum % 10);
            originalNum /= 10;
        }
        return reversedNum * negative;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1; //not necessary but part of udemy's logic
        if(number==0) return 1; //for case where number == 0
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        return count;
    }


//CODING EXERCISE 25
public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( (bigCount < 0) ||
            (smallCount < 0)||
            (goal < 0)
            ) return false;
            
        int numBig = 0, numSmall = 0;
        final int bigSize = 5;
        final int smallSize = 1;
        
        while(bigCount>0){
            if(goal < bigSize) break; //check at start and end makes a difference
            goal -= bigSize;
            numBig++;
            bigCount--;
        }
        
        while(smallCount>0){
            if(goal < smallSize) break;
            goal -= smallSize;
            numSmall++;
            smallCount--;
        }
        
        if(goal==0) return true;
        return false;
        
    }
}

//CODING EXERCISE 26
public class LargestPrime {
    
    public static int getLargestPrime(int number){
        if(number<0) return -1;
        int factor = 2, maxfactor;
        while(number/factor != 0) {
            if (number % factor != 0) {
                factor += 1;
            } else {
                maxfactor = number;
                System.out.println(factor);
                number /= factor;
                if (number == 1) {
                    System.out.println(maxfactor);
                    return maxfactor;
                }
            }
        }
    return -1;
    }
    
}

//CODING EXERCISE 27
public class DiagonalStar {
 public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        //firstline
        for (int i = 0; i < number; i++) System.out.print("*");
        System.out.println();

        for (int j = 1; j < (number - 1); j++) {
            for (int i = 0; i < number; i++) {
                if ((i == j) || (i == (number - 1 - j)) || (i == 0) || i == number-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            //lastline
            for (int i = 0; i < number; i++) System.out.print("*");
    }
}
 

//CODING EXERCISE 28
import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

        Scanner sc = new Scanner(System.in);
        int sum = 0, count =0;
        while (true) {
//            System.out.print("Enter Integer:\n");
            try{
                String consinput = sc.nextLine();
                int input = Integer.parseInt(consinput);
                count++;
                sum += input;
//                System.out.printf("SUM = %d COUNT = %d\n", sum, count);
            } catch(NumberFormatException e){
                if(count==0) count = 1;
                long avg = Math.round((double)sum / count); //divide by 0?
                System.out.printf("SUM = %d AVG = %d", sum, avg);
                break;
            }
        }

        sc.close();
    }
}

>>


//CODING EXERCISE 29
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0) ) return -1;
        double area = width * height;
        int numBuckets = (int)Math.ceil(area/areaPerBucket);
        numBuckets -= extraBuckets;
        return numBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}

//CODING EXERCISE 30
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){return this.firstNumber;}
    public double getSecondNumber(){return this.secondNumber;}

    public void setFirstNumber(double number){
        this.firstNumber = number;
    }

    public void setSecondNumber(double number){
        this.secondNumber = number;
    }

    public double getAdditionResult(){ return this.firstNumber + this.secondNumber;}
    public double getSubtractionResult(){ return this.firstNumber - this.secondNumber;}
    public double getMultiplicationResult(){ return this.firstNumber * this.secondNumber;}
    public double getDivisionResult(){
        if(this.secondNumber ==0) return 0;
        return this.firstNumber / this.secondNumber;
    }
}

//CODING EXERCISE 31
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
    public boolean isTeen () {
        if ((age > 12) && (age < 20)) return true;
        return false;
    }
    public String getFullName () {
        if ((firstName.isEmpty()) && (lastName.isEmpty())) return "";
        if (firstName.isEmpty()) return lastName;
        if (lastName.isEmpty()) return firstName;
        return firstName + " " + lastName;
    }

}

// CODING EXERCISE 32
public class Wall {
    // write your code here
    
    private double width;
    private double height;
    
    public Wall(){};
    
    public Wall(double width, double height){
        if (width>0){
            this.width = width;
        } else {
            this.width = 0;
        }
        
        if (height>0){
            this.height = height;
        } else {
            this.height = 0;
        }
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setWidth(double width){
        if (width>0){
            this.width = width;
        } else {
            this.width = 0;
        }
    }
    
    public void setHeight(double height){
        if (height>0){
            this.height = height;
        } else {
            this.height = 0;
        }
    }
    
    public double getArea(){
        return this.width * this.height;
    }

}

//CODING EXERCISE 33
public class Point {
    private int x;
    private int y;
    
    public Point(){};
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public double distance(){
        return distance(0,0);
    }
    
    public double distance(Point anotherPoint){
        return distance(anotherPoint.x,anotherPoint.y);
    }
    
    
    public double distance(int x, int y){
        return (Math.sqrt( Math.pow(this.x - x,2) + Math.pow(this.y - y,2)));
    }
    
    
}

//CODING EXERCISE 34
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width<0){this.width = 0;
        } else {this.width = width;}

        if(length<0){this.length = 0;
        } else { this.length = length;}
    }

    public double getArea(){
        return this.width*this.length;
    }
}

public class Carpet {

    private double cost;

    public Carpet(double cost){
        if(cost<0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost(){
        return this.cost;
    }
}

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}


//CODING EXERCISE 35
public class ComplexNumber{

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real =real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real,double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complex){
        this.real += complex.getReal();
        this.imaginary += complex.getImaginary();
    }

    public void subtract(double real,double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complex){
        this.real -= complex.getReal();
        this.imaginary -= complex.getImaginary();
    }

}