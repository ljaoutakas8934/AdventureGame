package Rooms;

import Game.Runner;
import Items.PartyHat;
import People.Person;
public class ItemRoom extends  Room
{
    public static int encounters = 0;

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;

        System.out.println("You enter a room, and find a ");

        x.addItem(new PartyHat("Triangle Hat", 5));
    }

    public String toString()
    {
        return "I";
    }
}
