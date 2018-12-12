package People;

import Items.Item;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	private static int HP;
	private String name;
	private static int xLoc, yLoc, floor;
	private Item[] inventory = new Item [5];
	private int inventoryIndex = 0;

	public int getxLoc() {
		return xLoc;
	}

	public static void setHP (int set) { HP = set; }

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public static int getFloor() {return floor;}

	public void setFloor(int floor) {this.floor = floor;}

	public static int getHP() {return HP;}
	public Person (String name, int xLoc, int yLoc, int floor)
	{
		this.name = name;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.floor = floor;
	}

	public void addItem(Item add)
	{
		inventory[inventoryIndex] = add;
		inventoryIndex++;
	}




}
