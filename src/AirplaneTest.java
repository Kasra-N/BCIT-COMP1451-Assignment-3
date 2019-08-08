import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AirplaneTest {


    @Test
    public void testMIN_HP_DIFFERENCE(){
        assertEquals(1000, Airplane.MAX_DIFFERENCE, 0.1);
    }

    @Test
    public void testSetMaximumHeightFeet1(){
        int maximumHeightFeet = 10000;
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 10000);
        instance.setMaximumHeightFeet(maximumHeightFeet);

        assertEquals(instance.getMaximumHeightFeet(),10000);
    }

    @Test
    public void testSetMaximumHeightFeet2(){
        int maximumHeightFeet = 5000;
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 5000);
        instance.setMaximumHeightFeet(maximumHeightFeet);

        assertEquals(instance.getMaximumHeightFeet(),5000);
    }

    @Test
    public void testGetMaximumHeightFeet1(){
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 10000);
        int expResult = 10000;
        instance.setMaximumHeightFeet(10000);
        int result = instance.getMaximumHeightFeet();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMaximumHeightFeet2(){
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 5000);
        int expResult = 5000;
        instance.setMaximumHeightFeet(5000);
        int result = instance.getMaximumHeightFeet();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode1() {
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 10000);
        Airplane instance2 = new Airplane(1998, "ABC Motors", "Comac", 10000);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void testHashCode2() {
        Airplane instance = new Airplane(2018, "DEF Motors", "DEF", 5000);
        Airplane instance2 = new Airplane(2018, "DEF Motors", "DEF", 5000);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void equals1() {
        Airplane instance = new Airplane(1990, "CDE Motors", "ABC", 9000);
        Airplane instance2 = new Airplane(1998, "ABC Motors", "Comac", 10000);

        assertEquals(instance, instance2);
    }

    @Test
    public void equals2() {
        Airplane instance = new Airplane(1990, "CDE Motors", "ABC", 10000);
        Airplane instance2 = new Airplane(1998, "ABC Motors", "Comac", 9000);

        assertEquals(instance, instance2);
    }

    @Test
    public void toString1() {
        Airplane instance = new Airplane(1998, "ABC Motors", "Comac", 10000);
        String expected = "This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.";

        assertEquals(expected, instance.toString());
    }

    @Test
    public void toString2() {
        Airplane instance = new Airplane(1940, "Boeing", "84", 45000);
        String expected = "This airplane is a 1940 Boeing 84 that can reach 45000 feet.";

        assertEquals(expected, instance.toString());
    }
}