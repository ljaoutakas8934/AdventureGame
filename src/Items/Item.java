package Items;


public abstract class Item implements Use {

    public Item()
    {

    }

    public abstract String getName();
    public abstract void consume();
    public abstract void defaultAction();
    public abstract int getCode();

}
