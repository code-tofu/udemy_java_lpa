public class Account {

    private String accNumber;
    private float balance;
    private String custName;
    private String custEmail;
    private String custPhone;

    public Account(){};

    public Account(String accNumber, float balance, String custName, String custEmail, String custPhone) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhone = custPhone;
    }

    public String getAccValue() {
        //Returns the result of calling toString for a non- null argument and "null" for a null argument.
        return "Account Num: %s | Balance: %.2f".formatted(accNumber,balance);
    };

    public String getAccOwner() {
        //Returns the result of calling toString for a non- null argument and "null" for a null argument.
        return "Account Num: %s | Customer Name: %s".formatted(accNumber,custName);
    };

    //self generated
    public String getAccNumber() { return accNumber;}
    public void setAccNumber(String accNumber){ this.accNumber = accNumber;}

    //auto generated
    public void setBalance(float balance) {this.balance = balance;}
    public void setCustName(String custName) {this.custName = custName;}
    public void setCustEmail(String custEmail) {this.custEmail = custEmail;}
    public void setCustPhone(String custPhone) {this.custPhone = custPhone;}
    public float getBalance() { return balance;}
    public String getCustName() { return custName;}
    public String getCustEmail() { return custEmail;}
    public String getCustPhone() { return custPhone;}

    //getter/setters are not static, require instance this
    public void depositAmt(float amount){
        this.setBalance(this.getBalance() + amount);
    }

    public void withdrawAmt(float amount){
//        if((this.getBalance()-amount)<0){
//            setBalance(0);
//            System.out.println("Insufficient Funds!");
//        }
        if((this.getBalance()-amount)<0){
            System.out.println("Insufficient Funds!");
            return;
        }
        this.setBalance(this.getBalance() - amount);
    }



}


