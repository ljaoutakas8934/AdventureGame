package Items;


public abstract class Item {

    public Item()
    {

    }

    public abstract String getName();
    public abstract void consume();
    public abstract void defaultAction();

}
