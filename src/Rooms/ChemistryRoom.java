package Rooms;

import Game.Helper;
import People.Person;

import java.util.Scanner;

public class ChemistryRoom extends  Room
{
    public static boolean done = false;
    private String [] Questions = new String[6];
    private String [] Answers = new String[6];
    private int [] answered = new int [6];
    private static int Qindex = 0;
    /**
     * default constructor.
     */
    public ChemistryRoom()
    {
        Questions[0] = "What is the elemental symbol for Helium?";
        Answers[0] = "he";

        Questions[1] = "What is the elemental symbol for Nitrogen?";
        Answers[1] = "n";

        Questions[2] = "What is the current symbol for the last element on the periodic table?";
        Answers[2] = "og";

        Questions[3] = "True or False: Hydrogen bonding is always the strongest IMF";
        Answers[3] = "false";

        Questions[4] = "What is the name of a Hydrogen isotope that has 1 neutron?";
        Answers[4] = "deuterium";

        Questions[5] = "What is the name of the compound NaCl?";
        Answers[5] = "sodium chloride";
    }


    /**
     * Sets the person in the room to the user.
     * @param x the Person entering the room.
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;

    }

    /**
     * The method that happens when you enter a room.
     * @param x The user.
     */
    @Override
    public void roomAction(Person x) {
        if (!done) {
            Scanner in = new Scanner(System.in);
            String input = "";
            System.out.println("You enter a chemistry room.");
            System.out.println("You see a middle aged man busy writing recommendations.");
            System.out.println("He comes up to you and asks:");
            System.out.println("''What is your name?''");
            input = in.nextLine();
            if (input.toLowerCase().contains(x.getName().toLowerCase())) {
                System.out.println("He says:");
                System.out.println("Nice to meet you," + x.getName());
            } else {
                System.out.println("He says:");
                System.out.println("Some how I feel as though thats not right!");
                System.out.println("I'll give you one more chance, what is your name?");
                input = in.nextLine();
                if (input.toLowerCase().contains(x.getName().toLowerCase())) {
                    System.out.println("Alright, Nice to meet you.");
                } else {
                    System.out.println("You are so discouraged about not correctly writing your name that you drop out of school.");
                    System.exit(0);
                }

            }
            quiz(Questions, Answers, answered, "Chemistry", x);

        }
        else
        {
            System.out.println("Well done! you have already completed my quiz! I am impressed.");


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

    /**
     * Method that has the quiz.
     */
    public void quiz(String [] questions, String [] answers, int [] answered, String className, Person x)
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        int currentInt;
        int score = 0;
        System.out.println("So I am now going to give you a " + className + " quiz.");
        while (x.getHP()>0 && score <2)
        {
            currentInt = Helper.randomInt(0,questions.length-1);
            if (!Helper.intArrayContains(currentInt, answered))
            {
                answered[Qindex] = currentInt;
                Qindex++;
                System.out.println(questions[currentInt]);
                input = in.nextLine();
                if (answers[currentInt].equals(input.toLowerCase()))
                {
                    System.out.println("Well done! you got the question right. Press enter for the next question.");
                    input = in.nextLine();
                }
                else
                {
                    System.out.println("I'm afraid thats incorrect. -1.");
                    x.setHP(x.getHP()-1);
                }
            }
        }
        if (x.getHP() <1)
        {
            System.out.println("You did very bad on the quiz, so you got kicked out of the school. Try again next time!");
            System.exit(0);
        }
        this.answered = answered;

    }




}

