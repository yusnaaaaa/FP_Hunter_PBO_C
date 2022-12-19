package entity;

import java.util.Random;

import pet.com.GamePanel;

public class Monster extends Entity {
	
	public Monster(GamePanel gp) {
		super(gp);
		
		direction = "down";
		speed = 12;
		
		getImage();
	}
public void getImage() {
		
		up1 = setup("/monster/alien_belakang");
		up2 = setup("/monster/alien_belakang");
		down1 = setup("/monster/alien_depan");
		down2 = setup("/monster/alien_depan");
		left1 = setup("/monster/alien_samping_kiri");
		left2 = setup("/monster/alien_samping_kiri");
		right1 = setup("/monster/alien_samping_kanan");
		right2 = setup("/monster/alien_samping_kanan");
		
		
	}


	public void setAction() {
		
		actionLockCounter++;
		
		if(actionLockCounter == 55) {
			
			Random random = new Random();
			int i = random.nextInt(40)+1;
			
			if(i <= 5) {
				direction = "up";
			}
			if(i > 5 && i <= 10) {
				direction = "down";
			}
			if(i > 10 && i <= 15) {
				direction = "left";
			}
			if(i > 15 && i <= 20) {
				direction = "right";
			}
			
			actionLockCounter = 0;

			
		}
		
				
		
	}

}
