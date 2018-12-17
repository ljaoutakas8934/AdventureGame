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
        System.out.println("s: " +Floor[3][3].toString());
        return output;
    }

    public void fill(int FloorNum)
    {
        for (int i = 0; i < Floor.length; i++)
        {
            for (int n = 0; n < Floor [i].length; n++)
            {
                Floor [i] [n] = new Room();
            }
        }
    }
    public boolean canNorth(Person x)
    {

        if (x.getyLoc()-1 < 0)
        {
            System.out.println("Something is blocking you from moving north!");
            return false;
        }
        return true;
    }

    public boolean canSouth(Person x)
    {
        if (x.getyLoc() +2 > Floor.length)
        {
            System.out.println("Something is blocking you from moving south!");
            return false;
        }
        return true;
    }

    public boolean canEast(Person x)
    {
        if (x.getxLoc()+2>Floor[x.getxLoc()].length)
        {
            System.out.println("Something is blocking you from moving east!");
            return false;
        }
        return true;
    }

    public boolean canWest(Person x)
    {
        if (x.getxLoc()-1<0)
        {
            System.out.println("Something is blocking you from moving west!");
            return false;
        }
        return true;
    }

    public Room getRoom(Person x)
    {
        return Floor [x.getyLoc()] [x.getxLoc()];
    }

    public void addRoom (Room a, int x, int y)
    {
        Floor [x] [y] = a;
    }
}
