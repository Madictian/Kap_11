public class Triangle extends Geometric_object {
    private double side_1,side_2,side_3 = 1.0;

    public double getSide_1() {
        return side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public double getSide_3() {
        return side_3;
    }

    public Triangle(){
    }

    public Triangle(double side_1, double side_2, double side_3, boolean filled, String color) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
        this.setFilled(false);
        this.setColor("white");
    }

    public double getArea(){
        double s = (this.side_1 + this.side_2 + this.side_3) / 2;
        double area = Math.sqrt(s * (s - this.side_3) * (s - this.side_2) * (s - this.side_1));
        return area;
    }

    public double get_perimeter(){
        double perimeter = this.side_1 + this.side_2 + this.side_3;
        return perimeter;
    }
    public String toString(){
        return "triangle: side1 = " + this.side_1 + " side2 = " + this.side_2 + " side3 = " + this.side_3;
    }
}
