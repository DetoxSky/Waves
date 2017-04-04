package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player extends GameObject{
	
	Handler handler;
	HUD hud;
	
	//private BufferedImage player_image;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
		//sprite sheet for Player
		/*SpriteSheet ss = new SpriteSheet(Game.sprite_sheet);
		
		player_image = ss.grabImage(1, 1, 32, 32);*/
	}

	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 38);
		y = Game.clamp(y, 0, Game.HEIGHT - 60);
		
		handler.addObject(new Trail(x, y, ID.Trial, Color.white, 32, 32, 0.05f, handler));
		
		collision();
	}

	public void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy || tempObject.getId() == ID.SmartEnemy || tempObject.getId() == ID.HardSmartEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 2;
				}
			}
			
			if(tempObject.getId() == ID.EnemyBoss || tempObject.getId() == ID.HardEnemy || tempObject.getId() == ID.VeryHardSmartEnemy || tempObject.getId() == ID.BasicFatEnemy || tempObject.getId() == ID.InvisibleEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 5;
				}
			}
			
			if(tempObject.getId() == ID.HardEnemyBoss || tempObject.getId() == ID.EnemyBossTwo || tempObject.getId() == ID.HardFatEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 10;
				}
			}
			
			if(tempObject.getId() == ID.HardEnemyBossTwo){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 15;
				}
			}
			
			if(tempObject.getId() == ID.EasyFinalBoss){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 25;
				}
			}
			
			if(tempObject.getId() == ID.HardFinalBoss){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
					HUD.HEALTH -= 35;
				}
			}
			
			if(tempObject.getId() == ID.RainbowEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					//collision code
						HUD.HEALTH += 15;
				}
			}
			
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x, (int)y, 32, 32);
		
		//image for player
		//g.drawImage(player_image, (int)x, (int)y, null);
	}
	
}