/**
 *
 * @author Kasra
 * @version 1.0
 * This class models a Car
 */
public class Car extends Vehicle implements Steerable {
    private int horsepower;

    public static final int MIN_HP_DIFFERENCE = 10;

    /**
     *
     * @param yearManufactured the year vehicle is manufactured
     * @param make the make of vehicle
     * @param model the model of the vehicle
     * @param horsepower of the car
     */
    public Car(int yearManufactured, String make, String model, int horsepower) {
        super(yearManufactured, make, model);

        setHorsepower(horsepower);
    }

    /**
     *
     * @param horsepower setter
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    /**
     *
     * @return horsePower getter
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * return the hash code of the object
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @return whether this.object is equal to the object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car other = (Car) obj;

        return (Math.abs(horsepower - other.horsepower) <= MIN_HP_DIFFERENCE);

    }

    /**
     * @return the instance variables as string
     */
    @Override
    public String toString() {
        return String.format("This car is a %d %s %s with %d hp.",getYearManufactured(), getMake(), getModel() ,getHorsepower());
    }

    /**
     * @return compare parameter obj this.object to the object
     */
    @Override
    public int compareTo(Vehicle obj) {
        if (obj == null) {
            throw new NullPointerException();
        }

        else if (obj.getClass() != this.getClass()) {
            throw new IllegalArgumentException();
        }

        Car car = (Car) obj;

        return car.getHorsepower() - this.getHorsepower();
    }


    @Override
    public void accelerate() {
        System.out.println("fire pistons, turn wheels");
    }

    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");
    }

    @Override
    public void steerRight() {
        System.out.println("turn wheels right");
    }
}