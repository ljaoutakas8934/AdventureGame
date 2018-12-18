package Items;

public class Pencil extends Item implements Use
{

    public String getName()
    {
        return "Pencil";
    }

    public void consume()
    {
        System.out.println("Did you really just try to eat a pencil?");
        System.out.println("Because that pencil had real lead in it, you die from lead poisoning.");
        System.exit(0);
    }

    @Override
    public void defaultAction() {
        System.out.println("You can't find anything to do here with a pencil. Press enter to continue.");
    }
}
