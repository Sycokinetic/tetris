package tetris.entity;

import java.awt.Point;

public class Entity
{
    protected String name;
    protected Point pos;
    protected int add;

    public Entity(String nm)
    {
	this.name = nm;
	this.pos = new Point(0, 0);

	this.add = 0;
    }

    public Entity(String nm, Point p)
    {
	this.name = nm;
	this.pos = p;

	this.add = 0;
    }

    public Entity(String nm, int x, int y)
    {
	this.name = nm;
	this.pos = new Point(x, y);

	this.add = 0;
    }

    public String getName()
    {
	return this.name;
    }

    public Point getPos()
    {
	return this.pos;
    }

    public void update()
    {
	if (this.add == 100)
	{
	    this.pos = new Point(this.pos.x - 100, this.pos.y - 100);
	    this.add = 0;
	}
	else
	{
	    this.pos = new Point(this.pos.x + 1, this.pos.y + 1);
	    add++;
	}
    }
}
