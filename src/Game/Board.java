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
    
    public String toString()
    {
        String output = "";
        for(int i = 0; i < building.length; i++)
        {
            output = "\n" + "Floor" + i + ":" + "\n";
            if (building [i].toString() != null)
            {
                output = output + building[i].toString();
            }
            else
            {
                output = output + "null";
            }

            output = output + "\n";
        }
        return output;
    }
    public Floor getFloor(Person x)
    {
        return building[x.getFloorNumber()];
    }

}
