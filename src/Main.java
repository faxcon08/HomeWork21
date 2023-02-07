import lesson_21.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void printRace(HashMap<Transport, ArrayList<Mechanic>> race) {
        for (Map.Entry<Transport, ArrayList<Mechanic>> entry : race.entrySet()) {
            System.out.print(entry.getKey() + " Mechanics: ");
            for (Mechanic mechanic: entry.getValue()){
                System.out.print(mechanic+", ");
            }
            System.out.println();
        }//for
    }
    public static void main(String[] args) {

        ArrayList<Mechanic> mechanicsList = new ArrayList<>();
        ArrayList<Mechanic> mechanicsList2 = new ArrayList<>();

        mechanicsList.add(new Mechanic("Vasiliy","Petrovich", "OOO Servis"));
        mechanicsList.add(new Mechanic("Ivan","Fedorovich", "OOO Primus"));
        mechanicsList.add(new Mechanic("Aleksandr","Simonov", "OOO Remont"));

        mechanicsList2.add(new Mechanic("Anatoliy","Irorevich", "OOO Pochinim"));
        mechanicsList2.add(new Mechanic("Denis","Vasiliev", "OOO Remont"));

        HashMap<Transport, ArrayList<Mechanic>> race = new HashMap<>();
        race.put(new Car("Lada", "Vesta", 1.5),mechanicsList );
        race.put(new Car("Lada", "XRay", 1.8) ,mechanicsList2 );
        race.put(new Bus("Икарус", "553", 3),mechanicsList2 );
        race.put(new Truck("Scania", "S580 Highline", 5),mechanicsList );

        printRace(race);

        race.put(new Bus("Икарус", "553", 3),mechanicsList2 );
        race.put(new Bus("Икарус", "553", 3),mechanicsList );
        System.out.println("--------------- change mechanics list in Bus && try to put same Bus ----------------");

        printRace(race);
    }// main
}