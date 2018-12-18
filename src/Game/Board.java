package Game;
import People.Person;
import Rooms.Room;
public class Board {
    Floor [] building;
    int width; int height;
    public Board (Floor [] building)
    {
        this.building = building;
    }

    public Board (int width, int height)
    {
        this.width = width;
        this.height = height;
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
