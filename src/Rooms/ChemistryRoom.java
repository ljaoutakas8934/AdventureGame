package Rooms;

import Game.Runner;
import Items.PartyHat;
import People.Person;
public class ChemistryRoom extends  Room
{
    public static int encounters = 0;

    public ChemistryRoom()
    {

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;

    }
    @Override
    public void roomAction(Person x)
    {
        System.out.println("You enter a chemistry room.");



    }
    @Override
    public String toString ()
    {
        if (occupant != null) {
            return "x";
        }
        else return "C";
    }
}
