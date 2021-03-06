package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class HardFatEnemy extends GameObject{

	private Handler handler;
	
	public HardFatEnemy(int x, int y, ID id, Handler handler){
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 6;
		velY = 6;
		
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 48, 48);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) 
			velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) 
			velX *= -1;	
		
		handler.addObject(new Trail(x, y, ID.Trial, new Color(0, 204, 255), 48, 48, 0.02f, handler));
	}
	
	public void render(Graphics g){
		g.setColor(new Color(0, 204, 255));
		g.fillRect((int) x, (int) y, 48, 48);
	}
	
}