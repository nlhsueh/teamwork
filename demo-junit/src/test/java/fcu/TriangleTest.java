package fcu;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    void isTriangle() {
        assertEquals(true, triangle.isTriangle(10, 10, 10));
    }

    @Test
    void isTriangle2() {
        assertEquals(true, triangle.isTriangle(1, 10, 10));
    }

}