package Rooms;

import People.Person;

import java.util.Scanner;

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
        Scanner in = new Scanner (System.in);
        String input = "";
        System.out.println("You enter a chemistry room.");
        System.out.println("You see a middle aged man busy writing recommendations.");
        System.out.println("He comes up to you and asks:");
        System.out.println("''What is your name?''");
        input = in.nextLine();
        if (input.toLowerCase().contains(x.getName().toLowerCase()))
        {
            System.out.println("He says:");
            System.out.println("''Nice to meet you,''" + x.getName());
        }
        else
        {
            System.out.println("He says:");
            System.out.println("''Some how I feel as though thats not right!''");
            System.out.println("'' I'll give you one more chance, what is your name?''");
            input = in.nextLine();
            if (input.toLowerCase().contains(x.getName().toLowerCase()))
            {
                System.out.println("Alright, Nice to meet you.");
            }
            else
            {
                System.out.println("He kicks you out of his room, and you are so sad that you drop out of school.");
                System.exit(0);
            }
        }



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
