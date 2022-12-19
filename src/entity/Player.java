package entity;

import java.awt.Color;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.awt.peer.DialogPeer;
import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;
import pet.com.KeyHandler;
import pet.com.UtilityTool;

public class Player extends Entity {
	
	GamePanel gp;
	KeyHandler keyH;
	
	public final int screenX;
	public final int screenY;
	public int hasKey = 0;
	public int hasPet = 0;
	
	public Player(GamePanel gp, KeyHandler KeyH) {
		
		super(gp);
		
		this.gp = gp;
		this.keyH = KeyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2) ;
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
	
		setDefaultValues();
		getPlayerImage();
	}
	public void setDefaultValues() {
		
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 5;
	   	direction = "down";
	   	
	   	//Player status nyawa
	   	maxLife = 8;
	   	life = maxLife;
		
	}
	public void getPlayerImage() {
		
		up1 = setup("/img/belakang_kanan");
		up2 = setup("/img/belakang_kiri");
		down1 = setup("/img/depan_kanan");
		down2 = setup("/img/depan_kiri");
		left1 = setup("/img/langkah_pendek_kiri");
		left2 = setup("/img/langkah_panjang_kiri");
		right1 = setup("/img/langkah pendek kanan");
		right2 = setup("/img/langkah_panjang_kanan");
		
		try {
			logo = ImageIO.read(getClass().getResourceAsStream("/img/logobig2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	
	public void update() {
		
		if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true ) {
			
			if(keyH.upPressed == true) {
				direction = "up";
			}
			else if(keyH.downPressed == true) {
				direction = "down";
			}
			else if(keyH.leftPressed == true) {
				direction = "left";
			}
			else if(keyH.rightPressed == true) {
				direction = "right";
			}
			
			//check tile collision
			collisionOn = false;
			gp.cChecker.checkTile(this);
			
			// check object collisiom
			int objIndex = gp.cChecker.checkObject(this, true);
			pickUpObject(objIndex);
			
			//check monster coll
			int monsterindex = gp.cChecker.checkEntity(this, gp.monster);
			interactMonster(monsterindex);
			
			
			if(collisionOn == false) {
				switch(direction) {
				case "up": worldY -= speed; break;
				case "down": worldY += speed; break;
				case "left": worldX -= speed; break;
				case "right": worldX += speed; break;
				}
			}
			
			
			spriteCounter++;
			if(spriteCounter > 12) {
				if(spriteNum == 1) {
					spriteNum = 2;
				}
				else if(spriteNum == 2) {
					spriteNum = 1;
				}
				spriteCounter = 0;
			}

			
		}
		
		//cek object
		if(cekObject == true) {
			cekCounterObject++;
			if(cekCounterObject > 60) {
				cekObject = false;
				cekCounterObject = 0;
			}
		}
		
		if(life == 0) {
			gp.gameState = gp.gameOver;
		}

		
	}
	
	public void pickUpObject(int i) {
		
		if(i != 999) {
			String objectName = gp.obj[i].name;
			
			
			switch(objectName) {
			case "Key" :
				gp.playSE(1);
				hasKey++;
				gp.obj[i] = null;
				gp.ui.showMessage("Key Found!");
				
				break;
			case "Door" :
				if(hasKey > 0) {
					gp.playSE(3);
					gp.obj[i] = null;
					hasKey--;
					gp.ui.showMessage("Berhasil buka pintu");
				}
				else {
					gp.ui.showMessage("Cari dulu kuncinya!");
				}
				break;
			case "Boots" :
				gp.playSE(2);
				speed += 4;
				gp.obj[i] = null;
				gp.ui.showMessage("Speed Up!");
				break;
			case "Chest" :
				gp.ui.gameFinished = true;
				gp.stopMusic();
				gp.playSE(4);
				break;
			case "Pet" :
				gp.playSE(2);
				hasPet++;
				gp.obj[i] = null;
				gp.ui.showMessage("yeay you found the pet!");
				break;
			case "LifeUp":
				gp.playSE(2);
				life++;
				gp.obj[i] = null;
				gp.ui.showMessage("Darah bertambah");
				break;
			
			}
		}
	}
	
	
	public void interactMonster(int i) {
		
		if(i != 999) {
			ContactObject(i);
			System.out.println("you monster");
		}
	}
	
	public void draw(Graphics g2) {
		
		// g2.setColor(Color.white);
		
		// g2.fillRect(x, y, gp.tileSize, gp.tileSize);
		
		BufferedImage image = null;
		
		switch (direction) {
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum == 2) {
				image = down2;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			break;
		}
		g2.drawImage(image, screenX, screenY, null);
		
	}
	
	public void ContactObject(int i) {
		
		if(i != 999) {
			
			if(cekObject == false) {
				life -= 1;
				cekObject = true;
			}
			
		}
		
	}


}
