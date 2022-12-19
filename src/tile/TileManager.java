package tile;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.im.InputContext;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.IllegalFormatCodePointException;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.INPUT_STREAM;

import pet.com.GamePanel;
import pet.com.UtilityTool;

public class TileManager {
	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum[][];
	
	
	public TileManager(GamePanel gp) {
		this.gp = gp;
		
		tile = new Tile[20];
		mapTileNum = new int [gp.maxWorldCol][gp.maxWorldRow];
		
		getTileImage();
		loadMap("/maps/map1.txt");
		
	}
	
	public void getTileImage() {
			
			setup(0,"jalan new", false);
			setup(1,"pagar rumput new" , true);
			setup(2,"rumput", false);
			setup(3,"new rumput", false);
			setup(4,"pagar rumput new", true);
			setup(5,"jalan new", false);
			
			setup(6,"jalan01", false);
			setup(7,"jalan02" ,false);
			setup(8,"jalan03", false);
			setup(9,"jalan04", false);
			setup(10,"jalan05", false);
			setup(11,"jalan06", false);
			setup(12,"jalan07", false);
			setup(13,"jalan08" , false);
			setup(14,"jalan09", false);
			setup(15,"jalan10", false);
			setup(16,"jalan11", false);
			setup(17,"jalan12", false);
			
			setup(18, "transisi rumput kiri", true);
			setup(19, "transisi rumput kanan", true);
			


			
			
			
						
		
	}
	
	public void setup(int index, String imageName, boolean collision) {
		UtilityTool uTool = new UtilityTool();
		
		try {
			tile[index] = new Tile();
			tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName +".png"));
			tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
			tile[index].collision = collision;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadMap(String filePath) {
		
		try {
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col < gp.maxWorldCol && row < gp.maxWorldCol) {
				
				String line = br.readLine();
				
				while(col < gp.maxWorldCol) {
					
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mapTileNum[col][row] = num;
					col++;
				}
				if(col == gp.maxWorldCol) {
					col = 0;
					row++;
				}
				
			}
			br.close();
			
			
		}catch(Exception e) {
			
		}
	}
	
	public void draw(Graphics g2) {
		
		int worldCol = 0;
		int worldRow = 0;
		
		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			
			int tileNum = mapTileNum[worldCol][worldRow];
			
			int worldX = worldCol * gp.tileSize;
			int worldY = worldRow * gp.tileSize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			
			if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
				worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
				worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
				worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
				
				g2.drawImage(tile[tileNum].image, screenX, screenY, null );
			}
			
			worldCol++;
		
			
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
			}
			
		}
	}


}
