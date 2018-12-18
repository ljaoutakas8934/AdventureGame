package Rooms;

import People.Person;

public class StairwayRoom extends Room
{
    private int code;
    public StairwayRoom(int code)
    {
        this.code = code;
    }
    public void roomAction(Person x)
    {
        System.out.println("It Looks like a locked door.");
    }




}
