package nl.han.oose.openclosed;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeometryUtilsTest {

    private GeometryUtils sut;

    @Before
    public void setUp() throws Exception {
        sut = new GeometryUtils();
    }

    @Test
    public void testCalculateArea() {
        Shape rectangle = new Rectangle(2, 3);
        assertEquals(6, sut.calculateArea(Arrays.asList(rectangle)), 0);
    }

    @Test
    public void testCalculateAreaTwoShapes() {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(1);
        assertEquals(6 + Math.PI, sut.calculateArea(Arrays.asList(rectangle, circle)), 0.1);
    }

    @Test
    public void testLiskovNotViolated() {
        Rectangle rectangle = new Square(2);
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        assertEquals(6, sut.calculateArea(Arrays.asList((Shape) rectangle)), 0);
    }
}