package Person;

import java.util.Date;

public class Faculty extends Employee {
    private double office_hours;
    private int rank;

    public Faculty(String name) {
        super(name);
    }

    public String toString(){
        return "Person Name: " + this.getName();
    }
}
