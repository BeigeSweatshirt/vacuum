package vacuum;

/** One square in the vacuum world. */
public final class Square {

	/** True if there is dirt in this square. */
	private boolean dirty;
	
	/** True if there is an obstacle that prevents an agent from entering this square. */
	private boolean obstacle;

	/** Returns true if this square is dirty. */
	public final boolean isDirty() {
		return dirty;
	}

	/** Returns true if this square is an obstacle. */
	public final boolean isObstacle() {
		return obstacle;
	}

	/** Sets the dirtiness of this square. */
	public final void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	/** Sets whether there is an obstacle in this square. */
	public final void setObstacle(boolean obstacle) {
		this.obstacle = obstacle;
	}

}
