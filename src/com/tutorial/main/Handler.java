package com.tutorial.main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {

	ArrayList<GameObject> object = new ArrayList<GameObject>();
	
	public int spd = 5;
	
	public void tick(){
		try{
			for(int i = 0; i < object.size(); i++){
				GameObject tempObject = object.get(i);
				
				tempObject.tick();
			}
		}catch(Exception e){
			
		}
	}
	
	public void render(Graphics g){
		try{
				for(int i = 0; i < object.size(); i++){
					GameObject tempObject = object.get(i);
					
					tempObject.render(g);
				}
		}catch(Exception e){
			
		}
	}
	
	public void clearEnemys(){
		for(int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() == ID.Player){
				object.clear();
				if(Game.gameState != Game.STATE.End && Game.gameState != Game.STATE.Over)
					addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
			}
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	
}