package tetris.layout;

import java.util.ArrayList;

import tetris.entity.Entity;

public class Map
{
    protected ArrayList<Entity> entityList;

    public Map()
    {
	this.entityList = new ArrayList<Entity>();

	for (int i = 0; i < 10; i++)
	{
	    int x = (i % 5) * 100;
	    int y = ((i - (i % 5)) / 5) * 100;
	    this.entityList.add(new Entity("Entity " + i, x, y));
	}
    }

    public ArrayList<Entity> getEntityList()
    {
	return this.entityList;
    }
}
