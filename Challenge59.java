public class Main {

    public static void main(String[] args) {
        int[] dayNums = {0,1,2,3,4,5,6,7,8,9};
        for (int i: dayNums){
//            printDayofWeek(i);
            System.out.print(printDayofWeek(i) + "\n");
        }

    }

    public static String printDayofWeek(int day){
//        String dayOfWeek =
        return switch(day){
            case 0 -> {yield "Sunday";} //try removing yield - works without yield?
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        }; //need to add semicolon at end of switch code block

//        System.out.print(dayOfWeek + "\n");
    }
}