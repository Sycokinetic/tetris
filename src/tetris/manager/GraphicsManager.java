package tetris.manager;

import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

import tetris.display.MainWindow;

public class GraphicsManager extends Manager
{
    protected MainWindow mainWindow;

    public GraphicsManager(String n)
    {
	super(n);
	this.tickTarget = 8333333;
	this.tickUnit = TimeUnit.NANOSECONDS;

	this.mainWindow = new MainWindow();
    }

    @Override
    public void run()
    {
//	System.out.println(this.name + ":");
	this.mainWindow.update();
    }

    @Override
    public void stop()
    {
	this.mainWindow.dispatchEvent(new WindowEvent(this.mainWindow, WindowEvent.WINDOW_CLOSING));
    }
}
