/**
 * This is the main class to display the vehicles
 * @author Kasra
 *
 */
public class Main {
    public static void main(String[] args) {
        Vehicles v = new Vehicles();

        System.out.println("Unsorted List of vehicles:\n");

        for(int i = 0; i < v.getCars().size(); i++){
            System.out.println(v.getCars().get(i));
        }
        System.out.println();

        for(int i = 0; i < v.getBoats().size(); i++){
            System.out.println(v.getBoats().get(i));
        }
        System.out.println();

        for(int i = 0; i <  v.getAirplanes().size(); i++){
            System.out.println(v.getAirplanes().get(i));
        }

        System.out.println("\nSorted List of vehicles:\n");

        for(int i = 0; i < v.getCars().size(); i++){
            System.out.println(v.getCarsSorted().get(i));
        }
        System.out.println();

        for(int i = 0; i < v.getBoats().size(); i++){
            System.out.println(v.getBoatsSorted().get(i));
        }
        System.out.println();

        for(int i = 0; i < v.getAirplanes().size(); i++){
            System.out.println(v.getAirplanesSorted().get(i));
        }
    }
}