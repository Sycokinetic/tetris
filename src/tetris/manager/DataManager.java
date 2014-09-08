package tetris.manager;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import tetris.entity.Entity;
import tetris.layout.Map;

public class DataManager extends Manager
{
    protected Map map;

    public DataManager(String n)
    {
	super(n);
	this.tickTarget = 5;
	this.tickUnit = TimeUnit.MILLISECONDS;

	this.map = new Map();
    }

    @Override
    public void run()
    {
//	System.out.println(this.name + ":");

	for (Entity e : map.getEntityList())
	{
	    e.update();
	}
    }

    @Override
    public void stop()
    {

    }

    public ArrayList<Entity> getEntityList()
    {
	return this.map.getEntityList();
    }
}
