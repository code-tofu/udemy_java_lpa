public class Challenge53 {

    public static void main(String[] args){

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(65,145));

    }
    public static String getDurationString(int secs){
        if (secs < 0){
            return ("Meaningful Message");
        }
        return getDurationString(secs/60, secs%60);
    }

    public static String getDurationString(int mins, int secs){

        if ((mins < 0) || ((secs < 0) || (secs > 60))) {
            return ("Meaningful Message");
        }
        int hours = mins/60;
        int remainderMins = (mins) % 60;
        int remainderSecs = (secs % 60);
        return (hours + "h " + remainderMins + "m " + remainderSecs + "s");     // 'XXh YYm ZZs'
    }
}


// take time in sec into hours
// display hours in string
// first method calls second method