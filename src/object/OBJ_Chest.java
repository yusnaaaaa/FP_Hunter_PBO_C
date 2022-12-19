package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_Chest extends SuperObject {
	
	GamePanel gp;
	public OBJ_Chest(GamePanel gp) {
		this.gp = gp;
		
		name = "Chest";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/asset1/kandang.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
