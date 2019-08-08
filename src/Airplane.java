/**
 * 
 * @author Kasra
 * @version 1.0
 * This class models an Airplane
 */
public class Airplane extends Vehicle implements Steerable {
    private int maximumHeightFeet;
	
    public static final int MAX_DIFFERENCE = 1000;

    /**
     *
     * @param yearManufactured the year vehicle is manufactured
     * @param make the make of vehicle
     * @param model the model of the vehicle
     * @param maximumHeightFeet maximum height feet airplane can travel
     */
    public Airplane(int yearManufactured, String make, String model, int maximumHeightFeet) {
        super(yearManufactured, make, model);
		
        setMaximumHeightFeet(maximumHeightFeet);
    }

    /**
     *
     * @param maximumHeightFeet setter
     */
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
    }

    /**
     *
     * @return maximumHeighFeet getter
     */
    public int getMaximumHeightFeet() {
        return maximumHeightFeet;
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

        Airplane airplane = (Airplane) obj;

        return Math.abs(maximumHeightFeet - airplane.maximumHeightFeet)
                <= MAX_DIFFERENCE;
    }

    /**
     * @return the instance variables as string
     */
    @Override
    public String toString() {
        return String.format("This airplane is a %d %s %s that can reach %d feet.", getYearManufactured(), getMake(), getModel(), getMaximumHeightFeet());
    }
	
    /**
     * @return compare parameter obj this.object to the object
     */
    @Override
    public int compareTo(Vehicle obj) {
        if (obj == null) {
            throw new NullPointerException();
        }

        if (obj.getClass() != this.getClass()) {
            throw new IllegalArgumentException();
        }
      
        Airplane airplane = (Airplane) obj;

        return airplane.getMaximumHeightFeet() - this.getMaximumHeightFeet();
    }
	
    @Override
    public void accelerate() {
        System.out.println("fire engines on wings");
    }

    @Override
    public void steerLeft() {
        System.out.println("lift wing flaps to turn left");
    }
    @Override
    public void steerRight() {
        System.out.println("lift wing flaps to turn right");
    }
}