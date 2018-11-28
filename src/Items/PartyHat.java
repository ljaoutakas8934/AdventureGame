package Items;

public class PartyHat extends Item{
    private String Name;
    private int ScoreVal;

    public PartyHat(String Name, int ScoreVal)
    {
        super(Name, ScoreVal);
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
