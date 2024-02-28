public class Captain extends UltimatePlayer{
    //variables
    public boolean type;

    //Constructor
    public Captain(String firstName, String lastName, String position, int jerseyNumber, boolean type){
        super(firstName, lastName, position, jerseyNumber);
        this.type = type;
    }

    //Accessors
    public boolean getType(){
        return type;
    }

    public int throwDisc(int pow){
        if (pow > 1) {
            pow = 1;
        }
        else if (pow > 10) {
            pow = 10;
        }
        return 5*pow;
    }

    //Mutators
    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();
        if (getType()) {
            s += "\n   Captain: Offense";
        } else {
            s += "\n   Captain: Defense";
        }
        return s;
    }
}
