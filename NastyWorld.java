package vacuum;

public class NastyWorld extends World {
	
	public NastyWorld(int width) { super(width); }

	@Override
	void setUp(int width) {
		this.width = width;
		
		int centerX = width/2, centerY = centerX;
		
		for(int x = 0; x < width; x++) for(int y = 0; y < width; y++) {
			if(isOdd(checkerboardDistance(x, y, centerX, centerY))) {
				if(x == centerX && isEven(y / 2)) makeDirty(x, y);
				else makeObstacle(x, y);
			}
			else makeDirty(x, y);
		}
	}

	private int width;
	
	private void trySettingSquare(int x, int y, boolean isObstacle, boolean isDirty) {
		if(x >= 0 && x < width && y >= 0 && y < width) {
			Square s = getSquare(x, y);
			s.setObstacle(isObstacle);
			s.setDirty(isDirty);
		}
	}
	
	private void makeDirty(int x, int y) { trySettingSquare(x, y, false, true); }
	private void makeObstacle(int x, int y) { trySettingSquare(x, y, true, false); }
	
	private boolean isEven(int x) { return x % 2 == 0; }
	private boolean isOdd(int x) { return x % 2 != 0; }
	private int checkerboardDistance(int ax, int ay, int bx, int by) { return Math.max(Math.abs(bx - ax), Math.abs(by - ay)); }
}