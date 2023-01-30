public class Challenge39 {
    public static void main (String[] args) {
        double var1 = 20.00d, var2 = 80.00d;
        double var3 = (var1 + var2) * 100.00d;
        double remainder = var3 % 40.00d;
        boolean isZero = (remainder == 0);
        System.out.println(isZero);
        if (!isZero){
            System.out.println("Got Some Remainder");
        }
    }
}
