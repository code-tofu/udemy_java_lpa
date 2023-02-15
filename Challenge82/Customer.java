public class Customer{

    private String name;
    private float creditLimit;
    private String email;

    private static final float defaultLimit = 10000; //has to be static because it is not instance specific

    public String getName() {return name;}
    public float getCreditLimit() {return creditLimit;}
    public String getEmail() {return email;}

    public Customer(){
        this("Nameless", 9001f, "noemail@email.com");
        // remember this is a method call, has to be this instead of Customer() if not it will be recursive
    }

    public Customer(String name, float creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this( name, defaultLimit , email);
    }


}
