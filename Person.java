public class Person {
    private  String firstName;
    private  String lastName;
    private double height;
    private int heightFeet;
    private int heightInches;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private double getHeight(){
        return height;
    }
    public int getHeightFeet() {
        return this.heightFeet;
    }

    public int getHeightInches() {
        return this.heightInches;
    }
    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setHeight(double height){
        this.height=height;
    }

}

