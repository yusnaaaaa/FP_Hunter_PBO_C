package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_Door extends SuperObject{
	
	GamePanel gp;
	public OBJ_Door(GamePanel gp) {
		this.gp = gp;
		
		name = "Door";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/asset1/door_closed.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch (IOException e) {
			e.printStackTrace();
		}
		collision = true;
		
	}

}
