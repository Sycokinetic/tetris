package tetris.manager;

import java.util.concurrent.TimeUnit;

public class AudioManager extends Manager
{
    public AudioManager(String n)
    {
	super(n);
	this.tickTarget = 15;
	this.tickUnit = TimeUnit.MILLISECONDS;
    }

    @Override
    public void run()
    {

    }

    @Override
    public void stop()
    {
	
    }

}
