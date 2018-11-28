package Rooms;

import Game.Runner;
import Items.PartyHat;
import People.Person;
public class PartyRoom extends  Room
{
    public PartyRoom(int x, int y) {
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
        System.out.println("You found a room with a party table. You now have a party hat.");
        inventory [inventoryIndex] = new PartyHat("Triangle Hat", 5);
    }
}
