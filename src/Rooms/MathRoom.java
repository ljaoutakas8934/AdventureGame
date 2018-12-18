package Rooms;

import Game.Helper;
import Items.key;
import People.Person;

import java.util.Scanner;

public class MathRoom extends  Room
{
    public static boolean done = false;
    private String [] Questions = new String[6];
    private String [] Answers = new String[6];
    private int [] answered = new int [6];
    private static int Qindex = 0;
    /**
     * default constructor.
     */
    public MathRoom()
    {
        Questions[0] = "What is 2 + 2";
        Answers[0] = "4";

        Questions[1] = "What is the derivative of sin(x)";
        Answers[1] = "cos(x)";

        Questions[2] = "What is 3 * 4?";
        Answers[2] = "12";

        Questions[3] = "What is the square root of 64?";
        Answers[3] = "8";

        Questions[4] = "True or false: The derivative of tan(x) = (sec(x))^2 ";
        Answers[4] = "true";

        Questions[5] = "What is 8*7?";
        Answers[5] = "56";
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
            System.out.println("You enter a Math room.");
            System.out.println("You see a Man that seems very busy on a calculator.");
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
            quiz(Questions, Answers, answered, "Math", x);

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
        else return "M";
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
                    System.out.println("Well done! you got the question right. Press enter to continue.");
                    input = in.nextLine();
                    score++;
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
        System.out.println("Very Well done! I can now give you the key to the third floor!");
        if (Person.inventory[0] == null)
            x.setItem(new key(2),0);
        else if (Person.inventory[1] == null)
            x.setItem(new key(2),1);
        else
            x.setItem(new key(2),1);

        this.answered = answered;

    }




}

