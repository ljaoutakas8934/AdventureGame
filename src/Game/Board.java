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
        for(int i = 0; i < building.length; i++)
        {
          return building [i].toString();
        }
        return "";
    }
    
}
