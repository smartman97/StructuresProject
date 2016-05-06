package structures.model;

import java.awt.Color;

public class Dish
{
	private boolean isDirty;
	private Color color;
	private int radius;
	
	public Dish(boolean isDirty, Color color, int radius)
	{
		this.isDirty = isDirty;
		this.color = color;
		this.radius = radius;
	}

	public boolean isDirty()
	{
		return isDirty;
	}

	public Color getColor()
	{
		return color;
	}

	public int getRadius()
	{
		return radius;
	}

	public void setDirty(boolean isDirty)
	{
		this.isDirty = isDirty;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	
}
