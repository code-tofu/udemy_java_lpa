package Challenge92;



public class Worker {
    protected final String name;
    protected final String birthDate;
    protected String endDate = null;

    private static int current_year = 2025;

    public int getAge(){
        return current_year - Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }



}
