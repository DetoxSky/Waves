package com.tutorial.main;

import java.util.Random;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private Game game;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud, Game game){
		this.handler = handler;
		this.hud = hud;
		this.game = game;
	}
	
	public void tick(){
		scoreKeep++;
		
		if(scoreKeep >= 250){
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			if(game.diff == 0){
				if(hud.getLevel() == 2){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 3){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 4){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 6){
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 8){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 10){
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 12){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
				}else if(hud.getLevel() == 14){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 17){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 20){
					handler.clearEnemys();
					handler.addObject(new EnemyBoss(Game.WIDTH / 2 - 48, -120, ID.EnemyBoss, handler));
				}else if(hud.getLevel() == 30){
					handler.clearEnemys();
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
				}else if(hud.getLevel() == 37){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 40){
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
				}else if(hud.getLevel() == 45){
					handler.clearEnemys();
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
				}else if(hud.getLevel() == 48){
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 55){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 60){
					handler.clearEnemys();
					handler.addObject(new EnemyBossTwo(Game.WIDTH / 2 - 48, -120, ID.EnemyBossTwo, handler));
				}else if(hud.getLevel() == 70){
					handler.clearEnemys();
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicFatEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicFatEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicFatEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicFatEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicFatEnemy, handler));
				}else if(hud.getLevel() == 80){
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
				}else if(hud.getLevel() == 95){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 100){
					handler.clearEnemys();
					handler.addObject(new EasyFinalBoss(Game.WIDTH / 2 - 48, -120, ID.EasyFinalBoss, handler));
				}
			}else if(game.diff == 1){
				if(hud.getLevel() == 2){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 3){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
				}else if(hud.getLevel() == 4){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
				}else if(hud.getLevel() == 6){
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 8){
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 10){
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 12){
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
				}else if(hud.getLevel() == 14){
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
				}else if(hud.getLevel() == 17){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 20){
					handler.clearEnemys();
					handler.addObject(new HardEnemyBoss(Game.WIDTH / 2 - 48, -120, ID.HardEnemyBoss, handler));
				}else if(hud.getLevel() == 30){
					handler.clearEnemys();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
				}else if(hud.getLevel() == 37){
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 40){
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 45){
					handler.clearEnemys();
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
					handler.addObject(new VeryHardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.VeryHardSmartEnemy, handler));
				}else if(hud.getLevel() == 48){
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
				}else if(hud.getLevel() == 55){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 60){
					handler.clearEnemys();
					handler.addObject(new HardEnemyBossTwo(Game.WIDTH / 2 - 48, -120, ID.HardEnemyBossTwo, handler));
				}else if(hud.getLevel() == 70){
					handler.clearEnemys();
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
					handler.addObject(new HardFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
				}else if(hud.getLevel() == 80){
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new InvisibleEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.InvisibleEnemy, handler));
					handler.addObject(new BasicFatEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardFatEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
					handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardSmartEnemy, handler));
				}else if(hud.getLevel() == 95){
					handler.clearEnemys();
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
					handler.addObject(new RainbowEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RainbowEnemy, handler));
				}else if(hud.getLevel() == 100){
					handler.clearEnemys();
					handler.addObject(new HardFinalBoss(Game.WIDTH / 2 - 48, -120, ID.HardFinalBoss, handler));
				}
			}
			
		}
	}
	
}