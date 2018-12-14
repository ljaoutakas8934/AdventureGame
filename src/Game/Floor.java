package Game;
import Rooms.Room;
import People.Person;
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
            for (int n = 0; n < Floor[i].length; n++)
            {
                if (Floor [i] [n] != null)
                {
                    output = output + "[" + Floor[i][n].toString() + "]";
                }
                else
                {
                    output = output + "[NULL]";
                }
            }
            output = output + "\n";
        }
        return output;
    }
    public void fill()
    {
        for (int i = 0; i < Floor.length; i++)
        {
            for (int n = 0; n < Floor [i].length; n++)
            {
                Floor [i] [n] = new Room(i,n);
            }
        }
    }
    public boolean canNorth(Person x)
    {
        if (x.getyLoc()-1<0)
        {
            return false;
        }
        else return true;
    }

    public boolean canSouth(Person x)
    {
        if (x.getyLoc()+1>Floor.length-1)
        {
            return false;
        }
        else return true;
    }

}
