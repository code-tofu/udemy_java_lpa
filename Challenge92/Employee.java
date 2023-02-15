package Challenge92;

import java.util.Date;

public class Employee extends Worker{
    protected long employeeID;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeID, String hireDate) {
        super(name, birthDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }
    public void hire(String hireDate){
        this.hireDate = hireDate;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
