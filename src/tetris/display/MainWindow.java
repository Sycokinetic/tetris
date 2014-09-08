package tetris.display;

import java.awt.Rectangle;

import javax.swing.JFrame;

import tetris.Game;

public class MainWindow extends JFrame
{
    private static final long serialVersionUID = 1L;

    protected int width = 900;
    protected int height = width / 16 * 9;
    protected Rectangle winSize;

    protected GamePanel mainPanel;

    public MainWindow()
    {
	mainPanel = new GamePanel();
	
	this.setResizable(false);

	this.setContentPane(mainPanel);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setTitle(Game.getVersion());

	winSize = new Rectangle(width, height);
	this.setUndecorated(false);
	this.setSize(width, height);
	this.setVisible(true);
    }

    public void update()
    {
	this.mainPanel.repaint();
    }
}
