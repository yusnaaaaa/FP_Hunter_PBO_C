package pet.com;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Pet;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.obj[0] = new OBJ_Key();//
		gp.obj[0].worldX = 42 * gp.tileSize;
		gp.obj[0].worldY = 42 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key();//
		gp.obj[1].worldX = 27 * gp.tileSize;
		gp.obj[1].worldY = 46 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Key();//
		gp.obj[2].worldX = 42 * gp.tileSize;
		gp.obj[2].worldY = 9 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Door();//
		gp.obj[3].worldX = 29 * gp.tileSize;
		gp.obj[3].worldY = 43 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Door();//
		gp.obj[4].worldX = 28 * gp.tileSize;
		gp.obj[4].worldY = 33 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Door();//
		gp.obj[5].worldX = 7 * gp.tileSize;
		gp.obj[5].worldY = 8 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Chest();
		gp.obj[6].worldX = 8 * gp.tileSize;
		gp.obj[6].worldY = 5 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Boots();
		gp.obj[7].worldX = 37 * gp.tileSize;
		gp.obj[7].worldY = 42 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Pet();
		gp.obj[8].worldX = 35 * gp.tileSize;//
		gp.obj[8].worldY = 9 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Pet();
		gp.obj[9].worldX = 42 * gp.tileSize;//
		gp.obj[9].worldY = 35 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Pet();
		gp.obj[10].worldX = 26 * gp.tileSize;//
		gp.obj[10].worldY = 35 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Pet();
		gp.obj[11].worldX = 17 * gp.tileSize;//
		gp.obj[11].worldY = 42 * gp.tileSize;
		
		
	}
	

}
