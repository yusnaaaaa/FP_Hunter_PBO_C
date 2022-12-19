package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_Pet extends SuperObject{
	GamePanel gp;
	public OBJ_Pet(GamePanel gp) {
		this.gp = gp;
		
		name = "Pet";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/object/sprite_wnb0.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}

}
