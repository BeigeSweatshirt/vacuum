package vacuum;
import static vacuum.Action.*;

/** An agent for the vacuum world. */
public abstract class AbstractAgent {

	/**
	 * Returns the agent's action in response to the dirtiness state of the
	 * current square.
	 */
	public abstract Action react(boolean dirty);
        public abstract void senseObstacle(boolean isObstacle);

	/**
	 * senses whether the vacuum hit an object or the wall
	 * returns true if it did, false if not
	 public abstract void sense_obstacle(boolean isObstacle);
	 */
    
}
