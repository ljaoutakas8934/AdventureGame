package Rooms;

import Game.Runner;
import Items.PartyHat;
import People.Person;
public class ChemistryRoom extends  Room
{
    public static int encounters = 0;
    public ChemistryRoom(int x, int y)
    {
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
        System.out.println("You enter a chemistry room!");
        System.out.println("You see a teacher who's busy writing recs.");
        System.out.println("He comes to you and says:");
        System.out.println("");

        x.addItem(new PartyHat("Triangle Hat", 5));
    }
}
