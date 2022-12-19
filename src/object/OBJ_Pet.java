package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Pet extends SuperObject{
	public OBJ_Pet() {
		name = "Pet";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/object/sprite_wnb0.png"));
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}

}
