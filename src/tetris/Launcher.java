package tetris;

public class Launcher
{
    public static void main(String[] args)
    {
	Game.init();
	System.out.println(Game.getVersion());

	boolean isRunning = true;
	long start = System.currentTimeMillis();

	Game.start();

	while (isRunning)
	{
	    long curTime = System.currentTimeMillis();
	    long dif = curTime - start;
	    if (dif > 10000)
	    {
		Game.stop();
		isRunning = false;
	    }
	}
    }
}
