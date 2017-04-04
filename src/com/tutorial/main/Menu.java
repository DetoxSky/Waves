package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.tutorial.main.Game.STATE;

public class Menu extends MouseAdapter{

	Game game;
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public Menu(Game game, Handler handler, HUD hud){
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu){
			//play button
			if(mouseOver(mx, my, 210, 150, 200, 64)){
				game.gameState = STATE.Select;
				AudioPlayer.getSound("menu_sound").play();
				return;
			}
			
			//help button
			if(mouseOver(mx, my, 210, 250, 200, 64)){
				game.gameState = STATE.Help;
				AudioPlayer.getSound("menu_sound").play();
			}
			
			//exit button
			if(mouseOver(mx, my, 210, 350, 200, 64)){
				System.exit(1);
			}
		}
		
		if(game.gameState == STATE.Select){
			//normal button
			if(mouseOver(mx, my, 210, 150, 200, 64)){
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2 - 32, Game.HEIGHT/2 - 32, ID.Player, handler));
				handler.clearEnemys();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				
				game.diff = 0;
				
				AudioPlayer.getSound("menu_sound").play();
			}
			
			//hard button
			if(mouseOver(mx, my, 210, 250, 200, 64)){
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2 - 32, Game.HEIGHT/2 - 32, ID.Player, handler));
				handler.clearEnemys();
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				
				game.diff = 1;
				
				AudioPlayer.getSound("menu_sound").play();
			}
			
			//back button
			if(mouseOver(mx, my, 210, 350, 200, 64)){
				game.gameState = STATE.Menu;
				AudioPlayer.getSound("menu_sound").play();
				return;
			}
		}
	
		//back button for help
		if(game.gameState == STATE.Help){
			if(mouseOver(mx, my, 210, 350, 200, 64)){
				game.gameState = STATE.Menu;
				AudioPlayer.getSound("menu_sound").play();
				return;
			}
		}
		
		//try again button
		if(game.gameState == STATE.End){
			if(mouseOver(mx, my, 210, 350, 200, 64)){
				game.gameState = STATE.Menu;
				hud.setLevel(1);
				hud.setScore(0);
				hud.B1 = 100;
				hud.B2 = 100;
				hud.B3 = 100;
				hud.bounds = 0;
				handler.spd = 5;
				AudioPlayer.getSound("menu_sound").play();
			}
		}
		
		if(game.gameState == STATE.Over){
			//try again button
			if(mouseOver(mx, my, 210, 250, 200, 64)){
					game.gameState = STATE.Menu;
					hud.setLevel(1);
					hud.setScore(0);
					hud.B1 = 100;
					hud.B2 = 100;
					hud.B3 = 100;
					hud.bounds = 0;
					handler.spd = 5;
					AudioPlayer.getSound("menu_sound").play();
			}
			
			//exit button
			if(mouseOver(mx, my, 210, 350, 200, 64)){
					System.exit(1);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx > x && mx < x + width){
			if(my > y && my < y + height){
				return true;
			}else return false;
		}else return false;
	}
	
	public void render(Graphics g){
		
		if(game.gameState == STATE.Menu){
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.cyan);
			g.drawString("WAVES", 220, 70);
			
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawString("PLAY", 272, 195);
			g.drawRect(210, 150, 200, 64);
			
			g.drawRect(210, 250, 200, 64);
			g.drawString("HELP", 272, 295);
			
			g.drawString("EXIT", 276, 395);
			g.drawRect(210, 350, 200, 64);
		}else if(game.gameState == STATE.Help){
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("HELP", 250, 70);
			
			g.setFont(fnt3);
			g.drawString("Use 'W-A-S-D' keys to move player and dodge enemies.", 55, 150);
			g.drawString("Use 'P' key to pause the game.", 170, 200);
			g.drawString("Use 'SPACE' to shop.", 220, 250);
			g.drawString("© Detox_Sky, 2017", 225, 300);
			
			g.setFont(fnt2);
			g.drawString("BACK", 265, 395);
			g.drawRect(210, 350, 200, 64);
		}else if(game.gameState == STATE.End){
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Game Over", 180, 70);
			
			g.setFont(fnt3);
			g.drawString("You lost with the score of: " + hud.getScore(), 175, 200);
			
			g.setFont(fnt2);
			g.drawString("TRY AGAIN", 230, 395);
			g.drawRect(210, 350, 200, 64);
		}else if(game.gameState == STATE.Over){
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);
			
			g.setFont(fnt);
			g.setColor(Color.cyan);
			g.drawString("<<< WINNER >>>", 110, 110);
			
			g.setFont(fnt3);
			g.drawString("With the score of: " + hud.getScore(), 205, 200);
			
			g.setColor(Color.white);
			g.setFont(fnt2);
			g.drawString("TRY AGAIN", 230, 295);
			g.drawRect(210, 250, 200, 64);
			
			g.drawString("EXIT", 276, 395);
			g.drawRect(210, 350, 200, 64);
		}else if(game.gameState == STATE.Select){
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("SELECT DIFFICULTY", 75, 70);
			
			g.setFont(fnt2);
			g.drawString("Normal", 260, 195);
			g.drawRect(210, 150, 200, 64);
			
			g.drawRect(210, 250, 200, 64);
			g.drawString("Hard", 275, 295);
			
			g.drawString("Back", 275, 395);
			g.drawRect(210, 350, 200, 64);
		}
		
	}
	
	public void tick(){
		
	}
	
}