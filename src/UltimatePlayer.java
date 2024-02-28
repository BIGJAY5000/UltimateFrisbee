public class UltimatePlayer extends Person{
    public int jerseyNumber;
    public static int jerseyNumberCounter;
    public String position;


    public UltimatePlayer(String firstName, String lastName, String position, int jerseyNumber){
        super(lastName, firstName);
        setPosition(position);
        setJerseyNumber(jerseyNumber);
    }

    public void setPosition(String position){
        if (position.equalsIgnoreCase("Cutter")) {
            this.position = position;
        } else {
            this.position = "Handler";
        }
    }

    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }

    public void setJerseyNumberCounter(int jerseyNumberCounter){
        this.jerseyNumberCounter = jerseyNumberCounter;
    }
    public String getPosition(){
        return position;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public int throwDisc(int pow){
        if (pow > 1) {
            pow = 1;
        }
        else if (pow > 10) {
            pow = 10;
        }
        return 4*pow;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();
        return s;
    }
}
