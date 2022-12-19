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
		gp.obj[0].worldX = 23 * gp.tileSize;
		gp.obj[0].worldY = 3 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key(gp);//
		gp.obj[1].worldX = 35 * gp.tileSize;
		gp.obj[1].worldY = 7 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Key(gp);//
		gp.obj[2].worldX = 38 * gp.tileSize;
		gp.obj[2].worldY = 42 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Door(gp);//
		gp.obj[3].worldX = 10 * gp.tileSize;
		gp.obj[3].worldY = 11 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Door(gp);//
		gp.obj[4].worldX = 8 * gp.tileSize;
		gp.obj[4].worldY = 27 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Door(gp);//
		gp.obj[5].worldX = 12 * gp.tileSize;
		gp.obj[5].worldY = 23 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Chest(gp);
		gp.obj[6].worldX = 10 * gp.tileSize;
		gp.obj[6].worldY = 7 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Boots(gp);
		gp.obj[7].worldX = 37 * gp.tileSize;
		gp.obj[7].worldY = 42 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Pet(gp);
		gp.obj[8].worldX = 25 * gp.tileSize;//s
		gp.obj[8].worldY = 6 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Pet(gp);
		gp.obj[9].worldX = 39 * gp.tileSize;//s
		gp.obj[9].worldY = 7 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Pet(gp);
		gp.obj[10].worldX = 34 * gp.tileSize;//s
		gp.obj[10].worldY = 12 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Pet(gp);
		gp.obj[11].worldX = 24 * gp.tileSize;//s
		gp.obj[11].worldY = 2 * gp.tileSize;
		
		gp.obj[12] = new OBJ_LifeUp(gp);
		gp.obj[12].worldX = 36 * gp.tileSize;//
		gp.obj[12].worldY = 8 * gp.tileSize;
		
		gp.obj[13] = new OBJ_LifeUp(gp);
		gp.obj[13].worldX = 37 * gp.tileSize;//
		gp.obj[13].worldY = 40 * gp.tileSize;
		
		gp.obj[14] = new OBJ_Door(gp);//
		gp.obj[14].worldX = 38 * gp.tileSize;
		gp.obj[14].worldY = 15 * gp.tileSize;
		
		gp.obj[15] = new OBJ_Door(gp);//
		gp.obj[15].worldX = 23 * gp.tileSize;
		gp.obj[15].worldY = 11 * gp.tileSize;
		
		gp.obj[16] = new OBJ_Key(gp);//
		gp.obj[16].worldX = 12 * gp.tileSize;
		gp.obj[16].worldY = 43 * gp.tileSize;
		
		gp.obj[17] = new OBJ_Key(gp);//
		gp.obj[17].worldX = 5 * gp.tileSize;
		gp.obj[17].worldY = 11 * gp.tileSize;
		
		gp.obj[18] = new OBJ_Door(gp);//
		gp.obj[18].worldX = 3 * gp.tileSize;
		gp.obj[18].worldY = 15 * gp.tileSize;
		
		gp.obj[19] = new OBJ_Key(gp);//
		gp.obj[19].worldX = 10 * gp.tileSize;
		gp.obj[19].worldY = 3 * gp.tileSize;
		
		gp.obj[20] = new OBJ_Pet(gp);
		gp.obj[20].worldX = 13 * gp.tileSize;//s
		gp.obj[20].worldY = 45 * gp.tileSize;
		
		gp.obj[21] = new OBJ_Pet(gp);
		gp.obj[21].worldX = 25 * gp.tileSize;//s
		gp.obj[21].worldY = 42 * gp.tileSize;
		
		gp.obj[22] = new OBJ_LifeUp(gp);
		gp.obj[22].worldX = 15 * gp.tileSize;//
		gp.obj[22].worldY = 46 * gp.tileSize;
		
		gp.obj[23] = new OBJ_Pet(gp);
		gp.obj[23].worldX = 34 * gp.tileSize;//s
		gp.obj[23].worldY = 42 * gp.tileSize;
		
		gp.obj[24] = new OBJ_Pet(gp);
		gp.obj[24].worldX = 33 * gp.tileSize;//s
		gp.obj[24].worldY = 37 * gp.tileSize;
		
		gp.obj[25] = new OBJ_LifeUp(gp);
		gp.obj[25].worldX = 3 * gp.tileSize;//
		gp.obj[25].worldY = 42 * gp.tileSize;
		
		gp.obj[26] = new OBJ_Pet(gp);
		gp.obj[26].worldX = 4 * gp.tileSize;//s
		gp.obj[26].worldY = 46 * gp.tileSize;
		
		gp.obj[27] = new OBJ_Pet(gp);
		gp.obj[27].worldX = 6 * gp.tileSize;//s
		gp.obj[27].worldY = 40 * gp.tileSize;
		
		gp.obj[28] = new OBJ_Pet(gp);
		gp.obj[28].worldX = 4 * gp.tileSize;//s
		gp.obj[28].worldY = 13 * gp.tileSize;

		gp.obj[29] = new OBJ_Pet(gp);
		gp.obj[29].worldX = 12 * gp.tileSize;//s
		gp.obj[29].worldY = 3 * gp.tileSize;
		
		gp.obj[30] = new OBJ_Pet(gp);
		gp.obj[30].worldX = 7 * gp.tileSize;//s
		gp.obj[30].worldY = 4 * gp.tileSize;

	
	}
	
	
	public void setMonster() {
		
		gp.monster[0] = new Monster(gp);
		gp.monster[0].worldX = gp.tileSize*21;
		gp.monster[0].worldY = gp.tileSize*21;
	//	gp.monster[0].speed = 10;
		
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
//		gp.monster[3].speed = 12;
//		
		gp.monster[4] = new Monster(gp);
		gp.monster[4].worldX = gp.tileSize*24;
		gp.monster[4].worldY = gp.tileSize*42;
//		gp.monster[4].speed = 6;
//		
		gp.monster[5] = new Monster(gp);
		gp.monster[5].worldX = gp.tileSize*36;
		gp.monster[5].worldY = gp.tileSize*9;
		gp.monster[5].speed = 12;
		
		gp.monster[6] = new Monster(gp);
		gp.monster[6].worldX = gp.tileSize*24;
		gp.monster[6].worldY = gp.tileSize*4;
		gp.monster[6].speed = 12;
		
		gp.monster[7] = new Monster(gp);
		gp.monster[7].worldX = gp.tileSize*23;
		gp.monster[7].worldY = gp.tileSize*6;
		gp.monster[7].speed = 12;
		
		gp.monster[8] = new Monster(gp);
		gp.monster[8].worldX = gp.tileSize*25;
		gp.monster[8].worldY = gp.tileSize*5;
		gp.monster[8].speed = 12;
		
		
		gp.monster[9] = new Monster(gp);
		gp.monster[9].worldX = gp.tileSize*22;
		gp.monster[9].worldY = gp.tileSize*7;
		gp.monster[9].speed = 12;
		
		gp.monster[10] = new Monster(gp);
		gp.monster[10].worldX = gp.tileSize*23;
		gp.monster[10].worldY = gp.tileSize*5;
		gp.monster[10].speed = 12;
//		
		
		gp.monster[11] = new Monster(gp);
		gp.monster[11].worldX = gp.tileSize*23;
		gp.monster[11].worldY = gp.tileSize*23;
	//	gp.monster[0].speed = 10;
		
		gp.monster[12] = new Monster(gp);
		gp.monster[12].worldX = gp.tileSize*24;
		gp.monster[12].worldY = gp.tileSize*25;
		
		gp.monster[13] = new Monster(gp);
		gp.monster[13].worldX = gp.tileSize*21;
		gp.monster[13].worldY = gp.tileSize*25;
	//	gp.monster[0].speed = 10;
		
		gp.monster[14] = new Monster(gp);
		gp.monster[14].worldX = gp.tileSize*26;
		gp.monster[14].worldY = gp.tileSize*22;
		
		gp.monster[15] = new Monster(gp);
		gp.monster[15].worldX = gp.tileSize*34;
		gp.monster[15].worldY = gp.tileSize*6;
	//	gp.monster[0].speed = 10;
		
		gp.monster[16] = new Monster(gp);
		gp.monster[16].worldX = gp.tileSize*35;
		gp.monster[16].worldY = gp.tileSize*8;
		
		gp.monster[17] = new Monster(gp);
		gp.monster[17].worldX = gp.tileSize*36;
		gp.monster[17].worldY = gp.tileSize*5;
	//	gp.monster[0].speed = 10;
		
		gp.monster[18] = new Monster(gp);
		gp.monster[18].worldX = gp.tileSize*34;
		gp.monster[18].worldY = gp.tileSize*9;
		
		gp.monster[19] = new Monster(gp);
		gp.monster[19].worldX = gp.tileSize*37;
		gp.monster[19].worldY = gp.tileSize*42;
		
		gp.monster[20] = new Monster(gp);
		gp.monster[20].worldX = gp.tileSize*34;
		gp.monster[20].worldY = gp.tileSize*42;
		
		gp.monster[21] = new Monster(gp);
		gp.monster[21].worldX = gp.tileSize*35;
		gp.monster[21].worldY = gp.tileSize*43;
		
		gp.monster[22] = new Monster(gp);
		gp.monster[22].worldX = gp.tileSize*34;
		gp.monster[22].worldY = gp.tileSize*37;
		
		gp.monster[23] = new Monster(gp);
		gp.monster[23].worldX = gp.tileSize*36;
		gp.monster[23].worldY = gp.tileSize*34;
			
		gp.monster[24] = new Monster(gp);
		gp.monster[24].worldX = gp.tileSize*12;
		gp.monster[24].worldY = gp.tileSize*43;
		
		gp.monster[25] = new Monster(gp);
		gp.monster[25].worldX = gp.tileSize*11;
		gp.monster[25].worldY = gp.tileSize*44;
		
		gp.monster[26] = new Monster(gp);
		gp.monster[26].worldX = gp.tileSize*13;
		gp.monster[26].worldY = gp.tileSize*42;
		
		gp.monster[27] = new Monster(gp);
		gp.monster[27].worldX = gp.tileSize*3;
		gp.monster[27].worldY = gp.tileSize*43;
		
		gp.monster[28] = new Monster(gp);
		gp.monster[28].worldX = gp.tileSize*4;
		gp.monster[28].worldY = gp.tileSize*41;
		
		gp.monster[29] = new Monster(gp);
		gp.monster[29].worldX = gp.tileSize*5;
		gp.monster[29].worldY = gp.tileSize*44;
		
		gp.monster[30] = new Monster(gp);
		gp.monster[30].worldX = gp.tileSize*6;
		gp.monster[30].worldY = gp.tileSize*42;
		
		gp.monster[31] = new Monster(gp);
		gp.monster[31].worldX = gp.tileSize*12;
		gp.monster[31].worldY = gp.tileSize*34;
		
		gp.monster[32] = new Monster(gp);
		gp.monster[32].worldX = gp.tileSize*6;
		gp.monster[32].worldY = gp.tileSize*43;
		
		gp.monster[33] = new Monster(gp);
		gp.monster[33].worldX = gp.tileSize*13;
		gp.monster[33].worldY = gp.tileSize*36;
		
		gp.monster[34] = new Monster(gp);
		gp.monster[34].worldX = gp.tileSize*7;
		gp.monster[34].worldY = gp.tileSize*3;
		
		gp.monster[35] = new Monster(gp);
		gp.monster[35].worldX = gp.tileSize*5;
		gp.monster[35].worldY = gp.tileSize*3;
		
		gp.monster[36] = new Monster(gp);
		gp.monster[36].worldX = gp.tileSize*5;
		gp.monster[36].worldY = gp.tileSize*4;
		
		gp.monster[37] = new Monster(gp);
		gp.monster[37].worldX = gp.tileSize*13;
		gp.monster[37].worldY = gp.tileSize*3;
		
		gp.monster[38] = new Monster(gp);
		gp.monster[38].worldX = gp.tileSize*12;
		gp.monster[38].worldY = gp.tileSize*3;
		
		gp.monster[39] = new Monster(gp);
		gp.monster[39].worldX = gp.tileSize*3;
		gp.monster[39].worldY = gp.tileSize*13;

		gp.monster[40] = new Monster(gp);
		gp.monster[40].worldX = gp.tileSize*4;
		gp.monster[40].worldY = gp.tileSize*12;

		
	

	}
	

}
