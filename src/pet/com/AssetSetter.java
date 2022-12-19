package pet.com;

import entity.Monster;
import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_LifeUp;
import object.OBJ_Pet;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.obj[0] = new OBJ_Key(gp);//
		gp.obj[0].worldX = 42 * gp.tileSize;
		gp.obj[0].worldY = 42 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key(gp);//
		gp.obj[1].worldX = 27 * gp.tileSize;
		gp.obj[1].worldY = 46 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Key(gp);//
		gp.obj[2].worldX = 42 * gp.tileSize;
		gp.obj[2].worldY = 9 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Door(gp);//
		gp.obj[3].worldX = 29 * gp.tileSize;
		gp.obj[3].worldY = 43 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Door(gp);//
		gp.obj[4].worldX = 28 * gp.tileSize;
		gp.obj[4].worldY = 33 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Door(gp);//
		gp.obj[5].worldX = 7 * gp.tileSize;
		gp.obj[5].worldY = 8 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Chest(gp);
		gp.obj[6].worldX = 8 * gp.tileSize;
		gp.obj[6].worldY = 5 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Boots(gp);
		gp.obj[7].worldX = 37 * gp.tileSize;
		gp.obj[7].worldY = 42 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Pet(gp);
		gp.obj[8].worldX = 35 * gp.tileSize;//
		gp.obj[8].worldY = 9 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Pet(gp);
		gp.obj[9].worldX = 42 * gp.tileSize;//
		gp.obj[9].worldY = 35 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Pet(gp);
		gp.obj[10].worldX = 26 * gp.tileSize;//
		gp.obj[10].worldY = 35 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Pet(gp);
		gp.obj[11].worldX = 17 * gp.tileSize;//
		gp.obj[11].worldY = 42 * gp.tileSize;
		
		gp.obj[12] = new OBJ_LifeUp(gp);
		gp.obj[12].worldX = 27 * gp.tileSize;//
		gp.obj[12].worldY = 42 * gp.tileSize;
		
		gp.obj[13] = new OBJ_LifeUp(gp);
		gp.obj[13].worldX = 37 * gp.tileSize;//
		gp.obj[13].worldY = 40 * gp.tileSize;
		
		
	}
	
	public void setMonster() {
		
		gp.monster[0] = new Monster(gp);
		gp.monster[0].worldX = gp.tileSize*21;
		gp.monster[0].worldY = gp.tileSize*21;
//		gp.monster[0].speed = 10;
		
		gp.monster[1] = new Monster(gp);
		gp.monster[1].worldX = gp.tileSize*20;
		gp.monster[1].worldY = gp.tileSize*20;
//		
		gp.monster[2] = new Monster(gp);
		gp.monster[2].worldX = gp.tileSize*28;
		gp.monster[2].worldY = gp.tileSize*42;
//		gp.monster[2].speed = 8;
//		
		gp.monster[3] = new Monster(gp);
		gp.monster[3].worldX = gp.tileSize*21;
		gp.monster[3].worldY = gp.tileSize*42;
//		gp.monster[3].speed = 15;
//		
//		gp.monster[4] = new Monster(gp);
//		gp.monster[4].worldX = gp.tileSize*24;
//		gp.monster[4].worldY = gp.tileSize*42;
//		gp.monster[4].speed = 6;
//		
//		gp.monster[5] = new Monster(gp);
//		gp.monster[5].worldX = gp.tileSize*36;
//		gp.monster[5].worldY = gp.tileSize*9;
//		gp.monster[5].speed = 12;
//		
//		
		
		
		
			}
	

}
