import java.util.ArrayList;
import java.util.Collections;

public class Vehicles {
    private static ArrayList<Vehicle> cars;
    private static ArrayList<Vehicle> boats;
    private static ArrayList<Vehicle>  airplanes;

    public Vehicles() {

        cars = new ArrayList<>();
        boats = new ArrayList<>();
        airplanes = new ArrayList<>();

        cars.add(new Car(2000, "Lamborghini" , "Diablo", 700));
        cars.add(new Car(1997, "Dodge" , "Ram", 175));
        cars.add(new Car(1940, "Buggati" , "Veyron", 135));
        cars.add(new Car(2014, "Honda" , "Civic", 143));
        cars.add(new Car(2011, "Honda" , "Civic", 143));
        cars.add(new Car(1999, "Toyota" , "Corrola", 140));

        boats.add(new Boat(1980, "Bayliner", "Extreme", true));
        boats.add(new Boat(2014, "Bayliner", "Extreme II", true));
        boats.add(new Boat(2000, "American Skier", "Journey", false));
        boats.add(new Boat(2010, "Boesch", "Journey", false));

        airplanes.add(new Airplane(1998, "ABC Motors", "Comac", 10000));
        airplanes.add(new Airplane(1940, "Boeing", "84", 45000));
        airplanes.add(new Airplane(2012, "Boeing", "737", 80000));
        airplanes.add(new Airplane(2014, "Abrams", "Motorhead", 70000));
    }

    /**
     * @return unsorted list of cars
     */
    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    /**
     * @return sorted list of cars
     */
    public ArrayList<Vehicle> getCarsSorted() {
        Collections.sort(cars);
        return cars;
    }

    /**
     * @return unsorted list of boats
     */
    public ArrayList<Vehicle> getBoats() {
        return boats;
    }

    /**
     * @return sorted list of boats
     */
    public ArrayList<Vehicle> getBoatsSorted() {
        Collections.sort(boats);
        return boats;
    }

    /**
     * @return unsorted list of air planes
     */
    public ArrayList<Vehicle> getAirplanes() {
        return airplanes;
    }

    /**
     * @return sorted list of air planes
     */
    public ArrayList<Vehicle> getAirplanesSorted() {
        Collections.sort(airplanes);
        return airplanes;
    }
}