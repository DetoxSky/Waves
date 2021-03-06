package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class HardFinalBossEnemy2 extends GameObject{

	private Handler handler;
	Random r = new Random();
	
	public HardFinalBossEnemy2(int x, int y, ID id, Handler handler){
		super(x, y, id);
		
		this.handler = handler;
		
		velX = (r.nextInt(5 - -5) + -5);
		velY = 7;
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		if(y >= Game.HEIGHT) handler.removeObject(this);
		
		handler.addObject(new Trail(x, y, ID.Trial, Color.black, 16, 16, 0.02f, handler));
	}
	
	public void render(Graphics g){
		g.setColor(Color.black);
		g.fillRect((int) x, (int) y, 16, 16);
	}
	
}