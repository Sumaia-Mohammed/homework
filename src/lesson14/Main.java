package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bike> bikes = new ArrayList<>();

        bikes.add(new Bike("Bianchi",800,"yellow",28));
        bikes.add(new Bike("Giant",650,"yellow",28));
        bikes.add(new Bike("Decathlon",1200,"green",26));
        bikes.add(new Bike("Unknown",100,"blue",20));

        Collections.sort(bikes);

        for (Bike b : bikes){
            b.show();
        }
    }
}
