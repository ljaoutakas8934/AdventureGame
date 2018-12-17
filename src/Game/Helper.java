package Game;

public class Helper {
    public static int randomInt(int lower, int higher)
    {
        return (int)(Math.random()*(higher-lower+1))+lower;
    }
}
