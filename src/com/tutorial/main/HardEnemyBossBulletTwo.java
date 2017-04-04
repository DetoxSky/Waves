package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class HardEnemyBossBulletTwo extends GameObject{

	private GameObject player;
	private Handler handler;
	Random r = new Random();
	
	public HardEnemyBossBulletTwo(int x, int y, ID id, Handler handler){
		super(x, y, id);
		this.handler = handler;
		
		for(int i = 0; i < handler.object.size(); i++){
			if(handler.object.get(i).getId() == ID.Player)
				player = handler.object.get(i);
		}
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		float diffX = x - player.getX() - 16;
		float diffY = y - player.getY() - 16;
		float distance = (float) Math.sqrt((x - player.getX())*(x - player.getX()) + (y - player.getY())*(y - player.getY()));
		
		velX = ((-1 / distance) * diffX * 3);
		velY = ((-1 / distance) * diffY * 3);
		
		handler.addObject(new Trail(x, y, ID.Trial, Color.cyan, 16, 16, 0.02f, handler));
	}
	
	public void render(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect((int)x, (int)y, 16, 16);
	}
	
}