package pet.com;

import java.awt.Color;


import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.imageio.ImageIO;

import object.OBJ_Heart;
import object.OBJ_Key;
import object.OBJ_Pet;
import object.SuperObject;

public class UI {
	
	GamePanel gp;
	Font arial_40, arial_80B;
	Graphics2D g2;
	BufferedImage heart_full, heart_half, heart_blank;
	BufferedImage keyImage, petImage, imagestory;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0;
	public boolean gameFinished = false;
	public int commandNum = 0;
//	public BufferedImage image1, imagepause;
	
	double playTime;
	DecimalFormat dFormat = new DecimalFormat("#0.00");
	
	public UI(GamePanel gp) {
		this.gp = gp;
		
		arial_40 = new Font("Arial", Font.PLAIN, 40);
		arial_80B = new Font("Arial", Font.BOLD, 80);
		OBJ_Key key = new OBJ_Key ();
		keyImage = key.image;
		OBJ_Pet pet = new OBJ_Pet();
		petImage = pet.image;
		
		//create hud object
		OBJ_Heart Heart = new OBJ_Heart();
		heart_full = Heart.image;
		heart_half = Heart.image2;
		heart_blank = Heart.image3;
		
	}
	
	
	public void showMessage(String text) {
		message = text;
		messageOn = true;
	}
	
	public void draw(Graphics2D g2) {
		
		if(gameFinished == true) {
			
			 g2.setFont(arial_40);
			 g2.setColor(Color.white);

			
			String text;
			int textLength;
			int x;
			int y;
			
			text = "pet returned to cage";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			 x = gp.screenWidth/2 - textLength/2;
			 y = gp.screenHeight/2 - (gp.tileSize*3);
			 g2.drawString(text, x, y);
			 
			 
			text = "Time :"+dFormat.format(playTime) + "!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 + (gp.tileSize*4);
			g2.drawString(text, x, y);

			 
			 
			 g2.setFont(arial_80B);
			 g2.setColor(Color.WHITE);
			 
				text = "Congratulations!";
				textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
				 x = gp.screenWidth/2 - textLength/2;
				 y = gp.screenHeight/2 + (gp.tileSize*2);
				 g2.drawString(text, x, y);
			
				 gp.gameThread = null;
		}
		else {
			g2.setFont(arial_40);
			g2.setColor(Color.white);
			g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
			g2.drawString("x = "+ gp.player.hasKey, 74, 65);
			
			g2.drawImage(petImage, gp.tileSize/2, 80, gp.tileSize, gp.tileSize, null);
			g2.drawString("x = "+ gp.player.hasPet, 74, 120);
			
			
			
			//time
			if(gp.gameState == gp.playState) {
				playTime +=(double)1/60;
				g2.drawString("Time:"+dFormat.format(playTime), gp.tileSize*11, 65);
				
			}
		
			
			//massage
			if(messageOn == true) {
				g2.setFont(g2.getFont().deriveFont(30F));
				g2.drawString(message, gp.tileSize/2, gp.tileSize*5);
				
				messageCounter++;
				
				if(messageCounter > 120) {
					messageCounter = 0;
					messageOn = false;
				}
			}
			
		}
		
		
		this.g2 = g2;
		
		g2.setFont(arial_40);
		g2.setColor(Color.white);
		
		if(gp.gameState == gp.titleState) {
			drawTitleScreen();
		}
		
		if(gp.gameState == gp.playState) {
			drawPlayerLife();
		}
		if(gp.gameState == gp.pauseState) {
			drawPlayerLife();
			drawPauseScreen();
		}
		if(gp.gameState == gp.storyGame) {
			drawStoryGame();
		}
		if(gp.gameState == gp.gameOver) {
			drawGameOver();
		}
		
		
		
	}
	
	
	public void drawPlayerLife() {
		
		
		int x = 540;
		int y = 75;
		int i = 0;
		
		//blank heart
		while(i < gp.player.maxLife/2) {
			g2.drawImage(heart_blank, x, y, gp.tileSize, gp.tileSize, null);
			i++;
			x += gp.tileSize;
		}
		
		//reset  
		 x = 540;
		 y = 75;
		 i = 0;

		
		//draw current life
		while(i < gp.player.life) {
			g2.drawImage(heart_half, x, y, gp.tileSize, gp.tileSize, null);
			i++;
			if(i < gp.player.life) {
				g2.drawImage(heart_full, x, y, gp.tileSize, gp.tileSize, null);
			}
			i++;
			x += gp.tileSize;
		}
		 
	}
	
	
	public void drawTitleScreen() {
		
		g2.setColor(new Color(0,0,0));
		g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
		
		//title nama
		g2.setFont(g2.getFont().deriveFont(Font.BOLD,66F));
		String text = "LOST PET";
		int x = getXforCenteredText(text);
		int y = gp.tileSize*3;
		
		//shadow
		g2.setColor(Color.gray);
		g2.drawString(text, x+5, y+5);
		
		g2.setColor(Color.white);
		g2.drawString(text, x, y);
		
		//image
		x = gp.screenWidth/2 - (gp.tileSize*2)/2;
		y += gp.tileSize*2;
		g2.drawImage(gp.player.logo, x-75, y-100, gp.tileSize*5, gp.tileSize*5, null);
		
		//menu
		g2.setFont(g2.getFont().deriveFont(Font.BOLD,48F));
		
		
	//	try {
	//		image1 = ImageIO.read(getClass().getResourceAsStream("/asset1/Start.png"));
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
		
		text = "PLAY GAME";
		x = getXforCenteredText(text);
		y += gp.tileSize*3.5;
	//	g2.drawImage(image1, x-10, y-10, null);
		g2.drawString(text, x, y);
		if(commandNum == 0) {
			g2.drawString(">", x-gp.tileSize, y);
		}
		
		
		text = "STORY GAME";
		x = getXforCenteredText(text);
		y += gp.tileSize;
		g2.drawString(text, x, y);
		if(commandNum == 1) {
			g2.drawString(">", x-gp.tileSize, y);
		}

		
		
		text = "QUIT";
		x = getXforCenteredText(text);
		y += gp.tileSize;
		g2.drawString(text, x, y);
		if(commandNum == 2) {
			g2.drawString(">", x-gp.tileSize, y);
		}

	}
	
	public void drawPauseScreen() {
	
		g2.setFont(g2.getFont().deriveFont(Font.PLAIN,40F));
		String text = "PAUSED";
		int x = getXforCenteredText(text);
	
		int y = gp.screenHeight/2;
		
		g2.drawString(text,x,y);
	}
	public int getXforCenteredText(String text) {

		int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
		int x = gp.screenWidth/2 - length/2;
		return x;
	}
	
	public void drawStoryGame() {
		g2.setColor(new Color(0,0,0));
		g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
		
		//title nama
		g2.setFont(g2.getFont().deriveFont(Font.BOLD,66F));
		String text = "STORY GAME";
		int x = getXforCenteredText(text);
		int y = gp.tileSize*3;
		
		//shadow
		g2.setColor(Color.gray);
		g2.drawString(text, x+5, y+5);
		  
		g2.setColor(Color.white);
		g2.drawString(text, x, y);
		
//		Scanner scanner = new Scanner(System.in);
//		while(scanner.hasNext()) {
//			int answer = scanner.nextInt();
//			
//			System.out.println("answer : " +answer);
//			
//			text = "answer :"+answer;
//			
//			g2.drawString(text, 300, 300);
//			
//			
//		}
		
		
		//STORY
		
		try {
			imagestory = ImageIO.read(getClass().getResourceAsStream("/asset1/story2.png"));
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		x = gp.screenWidth/2 - (gp.tileSize*2)/2;
		y += gp.tileSize*2;
		g2.drawImage(imagestory, x-250, y-20, gp.tileSize*12, gp.tileSize*6, null);
		
//		g2.setFont(g2.getFont().deriveFont(Font.BOLD,20F));
//		
//		text = "Sebuah game java 2 dimensi yang boleh dibilang secara tampilan mirip dengan RPG";
//		x = 50;
//		y = 300;
//		g2.drawString(text, x, y);
		
	}
	
	public void drawGameOver() {

		
		g2.setColor(new Color(0,0,0));
		g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
		
		//title nama
		g2.setFont(g2.getFont().deriveFont(Font.BOLD,66F));
		String text = "GAME OVER";
		int x = getXforCenteredText(text);
		int y = gp.tileSize*3;
		
		//shadow
		g2.setColor(Color.gray);
		g2.drawString(text, x+5, y+5);
		
		g2.setColor(Color.white);
		g2.drawString(text, x, y);
		
		//image
	//	x = gp.screenWidth/2 - (gp.tileSize*2)/2;
	//	y += gp.tileSize*2;
	//	g2.drawImage(gp.player.logo, x-75, y-100, gp.tileSize*5, gp.tileSize*5, null);
		
		//menu
		g2.setFont(g2.getFont().deriveFont(Font.BOLD,48F));
		
		
	//	try {
	//		image1 = ImageIO.read(getClass().getResourceAsStream("/asset1/Start.png"));
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
		
		text = "QUIT";
		x = getXforCenteredText(text);
		y += gp.tileSize*3.5;
	//	g2.drawImage(image1, x-10, y-10, null);
		g2.drawString(text, x, y);
		if(commandNum == 0) {
			g2.drawString(">", x-gp.tileSize, y);
		}
		

		
		
//		text = "QUIT";
//		x = getXforCenteredText(text);
//		y += gp.tileSize;
//		g2.drawString(text, x, y);
//		if(commandNum == 1) {
//			g2.drawString(">", x-gp.tileSize, y);
//		}

	}

}
