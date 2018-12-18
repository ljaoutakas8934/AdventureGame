package Game;
import Items.Item;
public class Helper {
    public static int randomInt(int lower, int higher)
    {
        return (int)(Math.random()*(higher-lower+1))+lower;
    }

    public static Boolean intArrayContains (int test, int [] k )
    {
        for (int i = 0; i < k.length; i++)
        {
            if (k[i] == test) return true;
        }
        return false;
    }

    public static Boolean itemArrayContains (Item test, Item [] k )
    {
        for (int i = 0; i < k.length; i++)
        {

            if (k[i] != null && k[i].getName().equals(test.getName())) return true;
        }
        return false;
    }


}
