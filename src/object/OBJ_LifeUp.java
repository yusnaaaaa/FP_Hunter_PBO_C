package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_LifeUp extends SuperObject {
	GamePanel gp;
	public OBJ_LifeUp(GamePanel gp) {
		this.gp = gp;
		
		name = "LifeUp";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/asset1/lifeup.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
			
		}catch (IOException e) {
			e.printStackTrace();
		
		}

}
}
