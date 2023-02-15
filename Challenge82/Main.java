public class Main {

    public static void main(String[] args) {

        Customer cust1 = new Customer();
        System.out.println(cust1.getName());
        System.out.println(cust1.getEmail());
        System.out.println(cust1.getCreditLimit());
        System.out.println();
        Customer cust2 = new Customer("Mr Robot","hackmy@email.com");
        System.out.println(cust2.getName());
        System.out.println(cust2.getEmail());
        System.out.println(cust2.getCreditLimit());
        System.out.println();
        Customer cust3 = new Customer("Mr Robotnik", 99999, "eggy@email.com");
        System.out.println(cust3.getName());
        System.out.println(cust3.getEmail());
        System.out.println(cust3.getCreditLimit());
    }

}