package People;

import Items.Item;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String name;
	int xLoc, yLoc;
	public Item[] inventory = new Item [5];
	public int inventoryIndex = 0;

	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String name, int xLoc, int yLoc)
	{
		this.name = name;

		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	public void addItem(Item add)
	{
		inventory[inventoryIndex] = add;
		inventoryIndex++;
	}

}
