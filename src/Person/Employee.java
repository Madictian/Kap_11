package Person;

import java.util.Date;

public class Employee extends Person {
    private double office;
    private double salary;
    private Date hired;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, double office, double salary, Date hired) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.hired = hired;
    }

    public String toString(){
        return "Person Name: " + this.getName();
    }
}
