package tetris.display;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import tetris.Game;
import tetris.entity.Entity;

public class GamePanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	
	for (Entity e : Game.getEntityList())
	{
	    Point p = e.getPos();
	    g.drawRect(p.x, p.y, 75, 30);
	}
    }
}
