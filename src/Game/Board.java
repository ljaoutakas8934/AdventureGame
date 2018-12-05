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
}
