package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_LifeUp extends SuperObject {
	public OBJ_LifeUp() {
		name = "LifeUp";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/asset1/lifeup.png"));
		}catch (IOException e) {
			e.printStackTrace();
		
		}

}
}
