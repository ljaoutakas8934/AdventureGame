package Rooms;

import People.Person;

public class VWall
{
    public void enterRoom(Person x)
    {
        System.out.println("You ran into a wall.");
        Person.setHP(Person.getHP()-1);
    }
    public String printWall(String horizontal)
    {
        return "|";
    }
}
