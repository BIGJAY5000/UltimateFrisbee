public class Person {
    private String firstName;
    private String lastName;

    //Constructors
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Mutators
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //Accessors
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName();
    }
    public int throwDisc(int pow){
        if (pow > 1) {
            pow = 1;
        }
        else if (pow > 10) {
            pow = 10;
        }
        return 2*pow;
    }
}
