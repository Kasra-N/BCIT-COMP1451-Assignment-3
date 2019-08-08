/**
 * 
 * @author Kasra
 * @version 1.0
 * This class models a Boat
 */
public class Boat extends Vehicle implements Steerable {
	private boolean motorized;

	/**
	 * 
	 * @param yearManufactured the year vehicle is manufactured
	 * @param make the make of vehicle
	 * @param model the model of the vehicle
	 * @param motorized whether boat is motorized
	 */
	public Boat(int yearManufactured, String make, String model, boolean motorized) {
		super(yearManufactured, make, model);
		
		setMotorized(motorized);
	}

	/**
	 * 
	 * @param motorized setter
	 */
	public void setMotorized(boolean motorized) {
		this.motorized = motorized;
	}

	/**
	 * 
	 * @return motorized getter
	 */
	public boolean getMotorized() {
		return motorized;
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
        Boat boat = (Boat) obj;
        return motorized == boat.motorized;
	}
	
	/**
	 * @return the instance variables as string
	 */
    @Override
    public String toString() {
        return String.format("This boat is a %d %s %s" ,getYearManufactured(),getMake(),getModel() +
                (getMotorized() ? " (with motor)." : " (without motor)."));
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
      
        Boat boat = (Boat) obj;
        
        return boat.getYearManufactured() - this.getYearManufactured();
    }
	
    @Override
    public void accelerate() {
        System.out.println("jet water");
    }
	
    @Override
    public void steerLeft() {
        System.out.println("turn tiller left");
    }

    @Override
    public void steerRight() {
        System.out.println("turn tiller right");
    }

}
