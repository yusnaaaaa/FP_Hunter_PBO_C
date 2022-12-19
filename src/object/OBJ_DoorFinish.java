package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import pet.com.GamePanel;

public class OBJ_DoorFinish extends SuperObject {

	GamePanel gp;
	public OBJ_DoorFinish(GamePanel gp) {
		this.gp = gp;
		
		name = "DoorFinish";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/asset1/door_closed.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch (IOException e) {
			e.printStackTrace();
		}
		collision = true;
		
	}

}
