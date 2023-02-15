package Challenge92;

import java.util.Date;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public void retire(){
        Date today = new Date();
        this.isRetired = true;
        System.out.println("Congratulations!");
        this.endDate = today.toString();
    }

    public SalariedEmployee(String name, String birthDate, long employeeID, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, employeeID, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public double collectPay() {
        if (isRetired){
            System.out.println("Employee has retired");
            return 0;
        }
        return annualSalary/12;
    }
}
