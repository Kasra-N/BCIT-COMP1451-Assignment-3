/**
 * 
 * @author Kasra
 * @version 1.0
 * This class models a vehicle
 */
public abstract class Vehicle implements Comparable<Vehicle>{
	private int yearManufactured;
	private String make;
	private String model;
	public static final int MIN_YEAR = 0;
	public static final int MAX_YEAR = 2019;
	
	/**
	 * 
	 * @param yearManufactured the year vehicle is manufactured
	 * @param make the make of vehicle
	 * @param model the model of the vehicle
	 */
	public Vehicle(int yearManufactured, String make, String model) {
		super();
		
		this.yearManufactured = yearManufactured;
		this.make = make;
		this.model = model;
	}

	/**
	 * 
	 * @param yearManufactured setter
	 */
	public void setYearManufactured(int yearManufactured) {
		if (yearManufactured < MIN_YEAR || yearManufactured > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year: " + yearManufactured);
        }
        this.yearManufactured = yearManufactured;
	}
	
	/**
	 * 
	 * @param make setter
	 */
	public void setMake(String make) {
		if (make == null) {
            throw new NullPointerException("make cannot be null");
        } else if (make.isEmpty()) {
            throw new IllegalArgumentException("make cannot be empty");
        }
		this.make = make;
	}
 
	/**
	 * 
	 * @param model setter
	 */ 
	public void setModel(String model) {
		if (model == null) {
            throw new NullPointerException("model cannot be null");
        } else if (model.isEmpty()) {
            throw new IllegalArgumentException("model cannot be empty");
        }
		this.model = model;
	}

	/**
	 * 
	 * @return yearManufactured getter
	 */
	public int getYearManufactured() {
		return yearManufactured;
	}

	/**
	 * 
	 * @return make getter
	 */
	public String getMake() {
		return make;
	}

	/**
	 * 
	 * @return model getter
	 */
	public String getModel() {
		return model;
	}	
}
