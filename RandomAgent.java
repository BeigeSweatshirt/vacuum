package vacuum;

import java.util.Random;

public final class RandomAgent extends AbstractAgent {

    @Override
    public final Action react(boolean dirty) {
        Action[] actions = {Action.UP, Action.RIGHT, Action.DOWN, Action.LEFT};
        Random randNum = new Random();
        if (dirty) {
            return Action.SUCK;
        } else {
            return actions[randNum.nextInt(4)];
        }
    }

    @Override
    public void senseObstacle(boolean isObstacle) {}
}
