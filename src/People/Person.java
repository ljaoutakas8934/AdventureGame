package People;

import Items.Item;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	private static int HP;
	private String name;
	private static int yLoc, xLoc, floor;
	private Item[] inventory = new Item [5];
	private int inventoryIndex = 0;

	public int getyLoc() {
		return yLoc;
	}

	public static void setHP (int set) { HP = set; }

	public void setxLoc(int xLoc) {
		this.yLoc = xLoc;
	}

	public int getxLoc() {
		return xLoc;
	}

	public void setyLoc(int yLoc) {
		this.xLoc = yLoc;
	}

	public static int getFloorNumber() {return floor;}

	public void setFloor(int floor) {this.floor = floor;}

	public void moveNorth()
	{
		xLoc = xLoc + 1;
	}

	public void moveSouth()
	{
		xLoc = xLoc + 1;
	}

	public void moveEast()
	{
		yLoc = yLoc + 1;
	}

	public void moveWest()
	{
		yLoc = yLoc - 1;
	}




	public static int getHP() {return HP;}
	public Person (String name, int yLoc, int xLoc, int floor)
	{
		this.name = name;
		this.yLoc = yLoc;
		this.xLoc = xLoc;
		this.floor = floor;
	}

	public void addItem(Item add)
	{
		inventory[inventoryIndex] = add;
		inventoryIndex++;
	}




}
