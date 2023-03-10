package pet.com;

import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Entity;
import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	//Pengaturan Screen
	final int originalTileSize = 16;//16
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale;
	public final int maxScreenCol = 16;//16
	public final int maxScreenRow = 12;//12
	public final int screenWidth = tileSize * maxScreenCol;
	public final int screenHeight = tileSize *maxScreenRow;    
	
	//world settings
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;

	
	
	
	// FPS
	int FPS = 60;//60
	
	TileManager tileM = new TileManager(this);
	KeyHandler keyH = new KeyHandler(this);
	
	//sound
	Sound music = new Sound();
	Sound se = new Sound();
	
	public CollisionChecker cChecker  = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	public UI ui = new UI(this);
	Thread gameThread;
	
	public Player player = new Player(this, keyH);
	
	public SuperObject obj[] = new SuperObject[50];
	public Entity monster[] = new Entity[50];
	
	//GAME STATE
	public int gameState;
	public final int titleState = 0;
	public final int playState = 1;
	public final int pauseState = 2;
	public final int storyGame = 3;
	public final int gameOver = 4;

	

	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
		
	}
	
	public void setupGame() {
		aSetter.setObject();
		aSetter.setMonster();
		
		// playMusic(0);
		gameState = titleState;
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	@Override
	 
	
	public void run() {
		
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
				drawCount++;
			}
			
			if(timer >= 1000000000) {
				System.out.println("FPS:" + drawCount);
				drawCount = 0;
				timer = 0;		
			}
			
			
		}
		
	}
	
	
	public void update() {
		
		if(gameState == playState) {
			player.update();
			
			//monster
			for(int i = 0; i < monster.length; i++) {
				if(monster[i] != null) {
					monster[i].update();
				}
			}
			
		}
		if(gameState == pauseState) {
			//nothing
		}
		if(gameState == gameOver) {
			stopMusic();
			
		}
		
		
		
		
	}
	
	  public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//debug
		long drawStart = 0;
		if(keyH.checkDrawTime == true) {
			drawStart = System.nanoTime();
			
		}
		
		
		//title screen
		if(gameState == titleState) {
			ui.draw(g2);
		} else {
			//Tile
			tileM.draw(g2);
			
			//object
			for(int i = 0; i < obj.length; i++) {
				if(obj[i] != null) {
					obj[i].draw(g2, this);
				}
			}
			
			//monster
			for(int i=0; i<monster.length;i++) {
				if(monster[i] != null) {
					monster[i].draw(g2);
				}
			}
			
			//player
			player.draw(g2);
	
			
			//ui
			ui.draw(g2);
			
		}
		
		if(keyH.checkDrawTime == true) {
			long drawEnd = System.nanoTime();
			long passed = drawEnd - drawStart;
			g2.setColor(Color.white);
			g2.drawString("Draw Time : "+ passed, 10, 400);
			System.out.println("Draw :"+passed);
		}
		
		
		
		g2.dispose();
		
	}
	  
	public void retry() {
		
		player.setDefaultPosition();
		player.restoreLife();
		aSetter.setMonster();
	//	ui.playTime +=(double)1/60;
		
	}
	
	public void restart() {
		
		player.setDefaultValues();
		player.setDefaultPosition();
		player.restoreLife();
		aSetter.setObject();
		aSetter.setMonster();
	//	ui.playTime +=(double)1/60;
	}
	
	
	
	public void playMusic(int i) {
		
		music.setFile(i);
		music.play();
		music.loop();
		
	}
	
	public void stopMusic() {
		music.stop();
	}
	
	public void playSE(int i) {
		se.setFile(i);
		se.play();
		
	}
	

}
