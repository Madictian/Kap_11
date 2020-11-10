import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle t;

    void setup(){
        t = new Triangle(3,3,3, true, "white" );


    }

    @org.junit.jupiter.api.Test
    void getArea() {
        setup();
        assertEquals(3.8971, t.getArea(),0.001);
    }

    @org.junit.jupiter.api.Test
    void get_perimeter() {
        setup();
        assertEquals(9, t.get_perimeter());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        setup();
        assertEquals("triangle: side1 = 3.0 side2 = 3.0 side3 = 3.0", t.toString());

    }
}