package Rooms;

import Game.Runner;
import Items.PartyHat;
import People.Person;
public class ItemRoom extends  Room
{
    public static int encounters = 0;
    public ItemRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You enter a room, and find a ");

        x.addItem(new PartyHat("Triangle Hat", 5));
    }
}
