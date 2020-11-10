import java.util.Date;

public class Geometric_object {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public Geometric_object(){}
    public Geometric_object(String color, boolean filled){}

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }
}
