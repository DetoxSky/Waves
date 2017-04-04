package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {

	public int B1 = 100;
	public int B2 = 100;
	public int B3 = 100;
	public int bounds = 0;
	public static float HEALTH = 100;
	private float greenValue = 255;
	
	public  int score = 0;
	public int level = 1;
	
	public void tick(){		
		HEALTH = Game.clamp(HEALTH, 0, 100 + (bounds / 2));
		greenValue = HEALTH * 2;
		greenValue = Game.clamp(greenValue, 0, 255);
		
		score++;
	}
	
	public void render(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect(15, 15, 200 + bounds, 32);
		g.setColor(new Color(75, (int)greenValue, 0));
		g.fillRect(15, 15, (int)HEALTH * 2, 32);
		g.setColor(Color.WHITE);
		g.drawRect(15, 15, 200 + bounds, 32);
		g.setFont(new Font("arial", 1, 12));
		
		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		g.drawString("Press SPACE for Shop", 15, 95);
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
}
