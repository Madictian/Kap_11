package Person;

public class Student extends Person {
    private final int level;

    public Student(String name, int level) {
        super(name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public Student(int level) {
        this.level = level;
    }
    public String toString(){
        return "Person Name: " + this.getName();
    }
}
