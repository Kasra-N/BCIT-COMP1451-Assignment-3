import org.junit.Test;

import static junit.framework.Assert.*;

public class BoatTest {

    @Test
    public void TestSetMotorized1(){
        Boat instance = new Boat(1980, "Bayliner", "Extreme", true);
        instance.setMotorized(true);

        assertTrue(instance.getMotorized());
    }

    @Test
    public void TestSetMotorized2(){
        Boat instance = new Boat(1980, "Bayliner", "Extreme", false);
        instance.setMotorized(false);

        assertFalse(instance.getMotorized());
    }

    @Test
    public void TestGetMotorized1(){
        Boat instance = new Boat(1980, "Bayliner", "Extreme", true);
        instance.setMotorized(true);
        boolean result = instance.getMotorized();

        assertTrue(result);
    }

    @Test
    public void TestGetMotorized2(){
        Boat instance = new Boat(1980, "Bayliner", "Extreme", false);
        instance.setMotorized(false);
        boolean result = instance.getMotorized();

        assertFalse(result);
    }

    @Test
    public void testHashCode1() {
        Boat instance = new Boat(1980, "Bayliner", "Extreme", true);
        Boat instance2 = new Boat(1980, "Bayliner", "Extreme", true);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void testHashCode2() {
        Boat instance = new Boat(1980, "Bayliner", "Extreme", false);
        Boat instance2 = new Boat(1980, "Bayliner", "Extreme", false);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void equals1() {
        Boat instance = new Boat(1980, "Bayliner", "Extreme", true);
        Boat instance2 = new Boat(1980, "Yamaha", "Speed", true);

        assertEquals(instance, instance2);
    }

    @Test
    public void equals2() {
        Boat instance = new Boat(1980, "Bayliner", "Extreme", false);
        Boat instance2 = new Boat(1980, "Yamaha", "Speed", false);

        assertEquals(instance, instance2);
    }

    @Test
    public void toString1() {
        Boat instance = new Boat(1980, "Bayliner", "Extreme", true);
        String expected = "This boat is a 1980 Bayliner Extreme (with motor).";

        assertEquals(expected, instance.toString());
    }

    @Test
    public void toString2() {
        Boat instance = new Boat(2010, "Boesch", "Journey", false);
        String expected = "This boat is a 2010 Boesch Journey (without motor).";

        assertEquals(expected, instance.toString());
    }
}