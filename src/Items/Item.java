package Items;


public class Item {
    private String Name;
    private int ScoreVal;
    public Item [] inventory = new Item [5];
    public int inventoryIndex = 0;
    public Item(String Name, int ScoreVal)
    {
        this.Name = Name;
        this.ScoreVal = ScoreVal;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getScoreVal()
    {
        return ScoreVal;
    }
}
