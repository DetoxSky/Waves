package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class EnemyBoss extends GameObject{

	Image img1;
	private Handler handler;
	Random r = new Random();
	
	private int timer = 60;
	private int timer2 = 50;
	
	public EnemyBoss(int x, int y, ID id, Handler handler){
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 0;
		velY = 2;
		
		try {
		    img1 = ImageIO.read(new File("res/index.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 96, 96);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		if(timer <= 0)	velY = 0;
		else timer--;
		
		if(timer <= 0)	timer2--;
		if(timer2 <= 0){
			if(velX == 0)
				velX = 2;
			if(velX > 0)
				velX += 0.005f;
			else if(velX < 0)
				velX -= 0.005f;
			
			velX = Game.clamp(velX, -10, 10);
			
			int spawn = r.nextInt(6);
			if(spawn == 0)	handler.addObject(new EnemyBossBullet((int)x + 48, (int)y + 48, ID.BasicEnemy, handler));
		}
		
		if(x <= 0 || x >= Game.WIDTH - 96)	velX *= -1;	
		
	}
	
	public void render(Graphics g){
		g.drawImage(img1, (int)x, (int)y, null);
		//g.setColor(Color.yellow);
		//g.fillRect((int) x, (int) y, 96, 96);
	}
	
}