public class Main {

    public static void main(String[] args) {

        Account myAcc = new Account();
        System.out.println(myAcc);
        //non-overridden returns Account@1b28cdfa
        //overridden non-static returns "Account Details:...."
        System.out.println(myAcc.toString());
        //non-overridden returns Account@1b28cdfa
        //overridden non-static returns "Account Details:...."
        System.out.println(myAcc.getAccValue());
        myAcc.setBalance(10000);
        myAcc.setAccNumber("12345A");
        System.out.println(myAcc.getAccValue());
        myAcc.setCustName("Mr. Robot");
        System.out.println(myAcc.getAccOwner());
        myAcc.depositAmt(2000);
        System.out.println(myAcc.getAccValue());
        myAcc.withdrawAmt(11000);
        System.out.println(myAcc.getAccValue());
        myAcc.withdrawAmt(11000);
        System.out.println(myAcc.getAccValue());
    }

}