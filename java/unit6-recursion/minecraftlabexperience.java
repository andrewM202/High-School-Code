public void spreadWaterRecurse(int x, int y, int counter, int clickedGroundLevel){
		if(x < 0 || y < 0 || y > gridSize || x > gridSize)
			return;
		if(counter > waterGrowthRate)
			return;
		if(counter == 1) {
			blocks[x][y].setColor(Block.WATER);
			spreadWaterRecurse(x+1, y+0, 2, 0);
			spreadWaterRecurse(x-1, y+0, 2, 0);
			spreadWaterRecurse(x+0, y+1, 2, 0);
			spreadWaterRecurse(x+0, y-1, 2, 0);
		}
		if(blocks[x][y].getColor() != Block.WATER){
			blocks[x][y].setColor(Block.WATER);
			spreadWaterRecurse(x+1, y+0, counter+1, 0);
			spreadWaterRecurse(x-1, y+0, counter+1, 0);
			spreadWaterRecurse(x+0, y+1, counter+1, 0);
			spreadWaterRecurse(x+0, y-1, counter+1, 0);
		}
		
		
		
	}

