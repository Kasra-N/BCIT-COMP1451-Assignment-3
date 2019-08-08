import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CarTest {


    @Test
    public void testMIN_HP_DIFFERENCE(){
        assertEquals(10, Car.MIN_HP_DIFFERENCE, 0.1);
    }

    @Test
    public void testSetHorsepower1(){
        int horsePower = 500;
        Car instance = new Car(1980, "Lamborghini" , "Countach", 500);
        instance.setHorsepower(horsePower);

        assertEquals(instance.getHorsepower(),500);
    }

    @Test
    public void testSetHorsepower2(){
        int horsePower = 800;
        Car instance = new Car(1993, "Toyota" , "Supra", 800);
        instance.setHorsepower(horsePower);

        assertEquals(instance.getHorsepower(),800);
    }

    @Test
    public void testGetHorsePower1(){
        Car instance = new Car(1980, "Lamborghini" , "Countach", 500);
        int expResult = 500;
        instance.setHorsepower(500);
        int result = instance.getHorsepower();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHorsePower2(){
        Car instance = new Car(1993, "Toyota" , "Supra", 800);
        int expResult = 800;
        instance.setHorsepower(800);
        int result = instance.getHorsepower();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode1() {
        Car instance = new Car(1980, "Lamborghini" , "Countach", 500);
        Car instance2 = new Car(1980, "Lamborghini" , "Countach", 500);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void testHashCode2() {
        Car instance = new Car(1993, "Toyota" , "Supra", 800);
        Car instance2 = new Car(1993, "Toyota" , "Supra", 800);

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void equals1() {
        Car instance = new Car(2019, "Nissan" , "GTR", 490);
        Car instance2 = new Car(1980, "Lamborghini" , "Countach", 500);

        assertEquals(instance, instance2);
    }

    @Test
    public void equals2() {
        Car instance = new Car(2019, "Nissan" , "GTR", 490);
        Car instance2 = new Car(2001, "BMW" , "M3", 480);

        assertEquals(instance, instance2);
    }

    @Test
    public void toString1() {
        Car instance = new Car(1980, "Lamborghini" , "Countach", 500);

        String expected = "This car is a 1980 Lamborghini Countach with 500 hp.";

        assertEquals(expected, instance.toString());
    }

    @Test
    public void toString2() {
        Car instance = new Car(2019, "Nissan" , "GTR", 490);

        String expected = "This car is a 2019 Nissan GTR with 490 hp.";

        assertEquals(expected, instance.toString());
    }
}