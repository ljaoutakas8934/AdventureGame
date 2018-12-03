package Game;
import Rooms.Room;
public class Floor {
    private Room [] [] Floor;

    public Floor (Room [] [] Floor)
    {
        this.Floor = Floor;
    }


    public String toString()
    {
        String output = "";
        for (int i = 0; i < Floor.length; i++)
        {
            output = output + "\n";
        }
    }
}
