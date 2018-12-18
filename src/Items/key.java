package Items;

public class key  extends Item implements Use
{
    private int code;
    public key (int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }

    public void consume()
    {
        System.out.println("I'm not going to let you eat a key...");

    }


    public void defaultAction() {
        System.out.println("You can't find any key holes to unlock.");
    }

    public String getName()
    {
        return "Key";
    }
}
