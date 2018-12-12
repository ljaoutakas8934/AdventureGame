package Game;
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
            System.out.println(i);
            output = output + "\n";
        }
        return output;
    }
    public Floor toFloor()
    {
        for(int i = 0; i < building.length; i++)
        {
            return building [i];
        }
        return building[1];
    }

}
