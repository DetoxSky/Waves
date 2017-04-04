package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class RainbowEnemy extends GameObject{

	private Handler handler;
	Random r = new Random();
	
	public RainbowEnemy(int x, int y, ID id, Handler handler){
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 9;
		velY = 9;
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 25, 25);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) 
			velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) 
			velX *= -1;	
		
		handler.addObject(new Trail(x, y, ID.Trial, new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)), 25, 25, 0.02f, handler));
	}
	
	public void render(Graphics g){
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		g.fillRect((int) x, (int) y, 25, 25);
	}
	
}