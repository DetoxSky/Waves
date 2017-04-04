package com.tutorial.main;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class AudioPlayer {

	public static Map<String, Sound> soundMap = new HashMap<String, Sound>();
	public static Map<String, Music> musicMap = new HashMap<String, Music>();
	
	public static void load(){
		
		try {
			soundMap.put("menu_sound", new Sound("res/click.ogg"));
			musicMap.put("music", new Music("res/Don_Diablo_-_Switch_Original_Mix_.ogg"));
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Music getMusic(String key){
		return musicMap.get(key);
	}
	
	public static Sound getSound(String key){
		return soundMap.get(key);
	}
	
}