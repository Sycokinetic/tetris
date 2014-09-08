package tetris;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import tetris.entity.Entity;
import tetris.manager.DataManager;
import tetris.manager.GraphicsManager;
import tetris.manager.Manager;

public class Game
{
    private static class ManagerScheduler
    {
	private ScheduledExecutorService scheduler;
	private ArrayList<Manager> managerList;

	public ManagerScheduler()
	{
	    this.scheduler = Executors.newScheduledThreadPool(3);
	    this.managerList = new ArrayList<Manager>();
	}

	public void addManager(Manager m)
	{
	    this.managerList.add(m);
	}

	public void start()
	{
	    for (Manager m : this.managerList)
		this.scheduler.scheduleAtFixedRate(m, 0, m.getTickTarget(), m.getTickUnit());
	}

	public void stop()
	{
	    this.scheduler.shutdown();
	    for (Manager m : this.managerList)
		m.stop();
	}
    }

    private static final String VERSION = "v0.1";

    private static ManagerScheduler managerScheduler;
    private static DataManager dataManager;
    private static GraphicsManager graphicsManager;

    private static boolean isPaused;

    // private static AudioManager audioManager;

    public static void init()
    {
	dataManager = new DataManager("DATA");
	graphicsManager = new GraphicsManager("GRAPHICS");
	// audioManager = new AudioManager("AUDIO");

	managerScheduler = new ManagerScheduler();
	managerScheduler.addManager(dataManager);
	managerScheduler.addManager(graphicsManager);
	// managerScheduler.addManager(audioManager);

	isPaused = true;
    }

    public static void start()
    {
	managerScheduler.start();
    }

    public static void stop()
    {
	isPaused = true;
	managerScheduler.stop();
    }

    public static String getVersion()
    {
	return VERSION;
    }

    public static ArrayList<Entity> getEntityList()
    {
	return dataManager.getEntityList();
    }

    public static boolean isPaused()
    {
	return isPaused;
    }

    public static void setPaused(boolean b)
    {
	isPaused = b;
    }
}
