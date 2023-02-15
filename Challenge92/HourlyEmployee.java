package Challenge92;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;
    private final static int HOURS_A_WEEK = 40;
    private int overtimeHours = 0;
    public double getDoublePay(){
        return (hourlyPayRate * 2 * overtimeHours);
    }

    public HourlyEmployee(String name, String birthDate, long employeeID, String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeID, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return (hourlyPayRate * HOURS_A_WEEK) + getDoublePay();
    }

    public void OvertimeHoursDone(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
