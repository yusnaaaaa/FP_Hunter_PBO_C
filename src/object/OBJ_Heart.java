package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_Heart extends SuperObject{
	
	public OBJ_Heart () {
		
		
		name = "Heart";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/object/heart_full.png"));
			image2 = ImageIO.read(getClass().getResourceAsStream("/object/heart_half.png"));
			image3 = ImageIO.read(getClass().getResourceAsStream("/object/heart_blank.png"));
			
			
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}

}
