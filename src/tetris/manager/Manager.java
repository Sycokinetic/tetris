package tetris.manager;

import java.util.concurrent.TimeUnit;

public abstract class Manager implements Runnable
{
    protected int tickTarget;
    protected TimeUnit tickUnit;
    protected String name;

    public Manager(String n)
    {
	this.name = n;
    }

    public String getName()
    {
	return this.name;
    }
    
    public int getTickTarget()
    {
	return this.tickTarget;
    }

    public TimeUnit getTickUnit()
    {
	return this.tickUnit;
    }

    public void setTickTarget(int target)
    {
	this.tickTarget = target;
    }

    public void setTickUnit(TimeUnit unit)
    {
	this.tickUnit = unit;
    }
    
    public abstract void stop();
}
