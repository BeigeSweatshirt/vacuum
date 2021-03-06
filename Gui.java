package vacuum;

/** Graphic view of the vacuum world. */
public final class Gui {

	/** Draws the current state of  world. */
	public final static void draw(World world) {
		StdDraw.clear();
		for (int x = 0; x < world.getWidth(); x++) {
			for (int y = 0; y < world.getWidth(); y++) {
				Square s = world.getSquare(x, y);
				if (s.isObstacle()) {
					// Draw obstacle
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledRectangle(x + 0.5, y + 0.5, 0.5, 0.5);
				} else if (s.isDirty()) {
					// Draw dirt
					StdDraw.setPenColor(StdDraw.ORANGE);
					StdDraw.filledRectangle(x + 0.5, y + 0.5, 0.5, 0.5);
				}
				// Draw outline of square
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.rectangle(x + 0.5, y + 0.5, 0.5, 0.5);
			}
		}
		// Draw agent
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(world.getAgentX() + 0.5, world.getAgentY() + 0.5, 0.5);
		// Display everything and pause briefly
		StdDraw.show(10);
	}
	
	/** Creates the world and agent, then animates them forever. */
	public final static void main(String[] args) {
		World world = new World(25);
		AbstractAgent agent = new StateAgent();
		StdDraw.setScale(0, world.getWidth());
		StdDraw.show(0); // Wait until everything is drawn before first display
		draw(world);
		while (true) {
			world.step(agent);
			draw(world);
		}
	}
	
}
