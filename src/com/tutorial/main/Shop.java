package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.tutorial.main.Game.STATE;

public class Shop extends MouseAdapter{

	Game game;
	Handler handler;
	HUD hud;
	Graphics g;
	
	public Shop(Handler handler, HUD hud){
		this.handler = handler;
		this.hud = hud;
	}
	
	public void render(Graphics g){
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", 0, 48));
		g.drawString("SHOP", Game.WIDTH / 2 - 70, 50);
		
		//box 1
		g.setColor(Color.GREEN);
		g.setFont(new Font("arial", 0, 12));
		g.drawString("Up/full your Health", 70, 120);
		g.setFont(new Font("arial", 0, 15));
		g.drawString("Cost: " + hud.B1, 70, 140);
		g.drawString("Now Level: " + ((hud.B1 / 100) - 1), 70, 160);
		g.drawRect(50, 100, 140, 80);
		
		//box 2
		g.setColor(Color.BLUE);
		g.setFont(new Font("arial", 0, 12));
		g.drawString("Upgrade your Speed", 265, 120);
		g.setFont(new Font("arial", 0, 15));
		g.drawString("Cost: " + hud.B2, 265, 140);
		g.drawString("Now Level: " + ((hud.B2 / 100) - 1), 265, 160);
		g.drawRect(250, 100, 140, 80);
		
		//box 3
		g.setColor(Color.yellow);
		g.setFont(new Font("arial", 0, 12));
		g.drawString("Refill your Health", 475, 120);
		g.setFont(new Font("arial", 0, 15));
		g.drawString("Cost: " + hud.B3, 475, 140);
		g.drawRect(450, 100, 140, 80);
		
		g.setFont(new Font("arial", 0, 30));
		g.setColor(Color.red);
		g.drawString("<<< Your SCORE: " + hud.getScore() + " >>>", Game.WIDTH / 2 - 175, 300);
		g.setFont(new Font("arial", 0, 20));
		g.setColor(Color.white);
		g.drawString("Press SPACE to go back", Game.WIDTH / 2 - 115, 350);
	}
	
	public void mousePressed(MouseEvent e){
		
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Shop){
			//box 1
			if(mx >= 50 && mx <= 190){
				if(my >= 100 && my <= 180){
					//you`ve selected box 1
					//System.out.println("box 1");
					if(hud.getScore() >= hud.B1){
						hud.setScore(hud.getScore() - hud.B1);
						hud.B1 += 100;
						hud.bounds += 20;
						hud.HEALTH = (100 + (hud.bounds / 2));
						if((hud.B1 / 100) > 26){
							hud.B1 = 2600;
							hud.bounds = 500;
							hud.setScore(hud.getScore() + hud.B1);
						}
					}
				}
			}
			
			//box 2
			if(mx >= 250 && mx <= 390){
				if(my >= 100 && my <=180){
					//you`ve selected box 2
					//System.out.println("box 2");
					if(hud.getScore() >= hud.B2){
						hud.setScore(hud.getScore() - hud.B2);
						hud.B2 += 100;
						handler.spd++;
					}
				}
			}
	
			//box 3
			if(mx >= 450 && mx <= 590){
				if(my >= 100 && my <=180){
					//you`ve selected box 3
					//System.out.println("box 3");
					if(hud.getScore() >= hud.B3){
						hud.setScore(hud.getScore() - hud.B3);
						hud.B3 += 100;
						hud.HEALTH = (100 + (hud.bounds / 2));
					}
				}
			}
		}
	}
	
}