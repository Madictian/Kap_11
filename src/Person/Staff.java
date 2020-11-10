package Person;

import java.util.Date;

public class Staff extends Employee {
    private String title;

    public Staff(String name) {
        super(name);
    }

    public String toString(){
        return "Person Name: " + this.getName();
    }
}
