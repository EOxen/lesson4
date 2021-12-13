package org.example;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.slf4j.LoggerFactory.getLogger;

public class TriangleTest {

    private static final Logger logger = (Logger) getLogger(TriangleTest.class);

    @Test
    public void shouldAnswerWithTrue()
    {
        Triangle triangle = new Triangle(3,4,5);
        logger.info("Checking whether an object with sides " +triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " is a triangle.");
        assertTrue( triangle.triangleOrNot(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) );
        logger.info("The object with sides " +triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " is a triangle.");

    }

    @Test
    public void shouldAnswerWithFalse1()
    {
        Triangle triangle = new Triangle(-1,4,5);
        logger.info("Checking whether an object with sides " +triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " is a triangle.");
        assertFalse( triangle.triangleOrNot(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) );
        logger.info("Incorrect data. The object is not a triangle.");
    }

    @Test
    public void shouldAnswerWithFalse2()
    {
        Triangle triangle = new Triangle(100,4,5);
        logger.info("Checking whether an object with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " is a triangle.");
        assertFalse( triangle.triangleOrNot(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) );
        logger.info("Incorrect data. The object is not a triangle.");
    }

    @Test
    public void shouldCountTriangleArea()
    {
        Triangle triangle = new Triangle(3, 4, 5);
        logger.info("Calculation of the area of a triangle with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());
        assertEquals( 6,triangle.triangleArea(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) );
        logger.info("The area of a triangle with sides "+ triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " is equal to 6.");
    }

    @Test
    public void shouldThrowException() throws RuntimeException
    {
        Triangle triangle = new Triangle(100, 4, 5);
        logger.info("Calculation of the area of a triangle with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());
        Throwable exception = assertThrows(RuntimeException.class, () -> triangle.triangleArea(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        assertEquals(exception.getMessage(), "Incorrect data. The object is not a triangle.");
        logger.info("Incorrect data. The object is not a triangle.");
    }

    @Test
    public void shouldThrowException1() throws RuntimeException
    {
        Triangle triangle = new Triangle(-1, 4, 5);
        logger.info("Calculation of the area of a triangle with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());
        Throwable exception = assertThrows(RuntimeException.class, () -> triangle.triangleArea(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        assertEquals(exception.getMessage(), "Incorrect data. The object is not a triangle.");
        logger.info("Incorrect data. The object is not a triangle.");
    }

    @Test
    public void shouldThrowException2() throws RuntimeException
    {
        Triangle triangle = new Triangle(0, 4, 5);
        logger.info("Calculation of the area of a triangle with sides " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());
        Throwable exception = assertThrows(RuntimeException.class, () -> triangle.triangleArea(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        assertEquals(exception.getMessage(), "Incorrect data. The object is not a triangle.");
        logger.info("Incorrect data. The object is not a triangle.");

    }
}
