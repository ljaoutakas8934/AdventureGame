package Items;

public class key  extends Item implements Use
{
    int num;
    public key (int num)
    {
        this.num = num;
    }

    public int getNum() {
        return num;
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
