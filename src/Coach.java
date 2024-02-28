public class Coach extends Person{
    public String role;

    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        setRole(role);
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\n   Role: " + getRole();
        return s;
    }
}
