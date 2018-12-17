package Game;
import People.Person;
import Rooms.Room;
public class Board {
    Floor [] building;
    
    public Board (Floor [] building)
    {
        this.building = building;
    }

    public String print(int floor)
    {
        return building[floor].toString();
    }
    

    public Floor getFloor(Person x)
    {
        return building[x.getFloorNumber()];
    }

}
