import java.util.ArrayList;

public class POI {

    public POI(String title, ArrayList<Coordinates> coords){
        this.title = title;
        this.coordinates = coords;
    }
    private String title;


    private ArrayList<Coordinates> coordinates;

    //uses function intoMeter (Building) for whole list
    public ArrayList<Coordinates> newList(ArrayList<Coordinates> coordinatesRoom, ArrayList<Coordinates> coordinatesBuilding) {
        Coordinates zero = Convert.findZero(coordinatesBuilding);
        ArrayList<Coordinates> newCoords = new ArrayList<Coordinates>();
        for (int j = 0; j < coordinatesRoom.size(); j++) {
            newCoords.add(j, Convert.intoMeter(coordinatesRoom.get(j), zero));

        }
        return newCoords;
    }
    public boolean isBeacon(String name) {
        if(this.title == name) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Coordinates> getCoordinates() {
        return coordinates;
    }
}
