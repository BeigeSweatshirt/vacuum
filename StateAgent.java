package vacuum;

import java.util.*;
import java.lang.Math.*;

public final class StateAgent extends AbstractAgent {

    private static final Action[] action = {Action.DOWN, Action.RIGHT, Action.UP, Action.LEFT};
    private static int i = 0;
    private static int x = 0;
    private static int y = 0;
//    private static int sideProg = 1; //Side Progress
//    private static int sideLength = 0; //Side Length
    private static List obsList; //Obstacle coordinates

    @Override
    public final void senseObstacle(boolean isObstacle) {
        if (isObstacle) {
            Obstacle obs = new Obstacle(x, y);
            obsList.add(obs);
        }
    }

    @Override
    public final Action react(boolean dirty) {
        if (dirty) {
            return Action.SUCK;
        } else {
            if ((action[i] == Action.DOWN && x > y)
                    || (action[i] != Action.DOWN && Math.abs(x) == Math.abs(y))) {
                 i = (i + 1) % 4;
            }
            updateXY();
            return action[i];
        }
    }

    public final void updateXY() {
        switch (action[i]) {
            case DOWN:
                y = y - 1;
                break;
            case RIGHT:
                x++;
                break;
            case UP:
                y++;
                break;
            case LEFT:
                x--;
                break;
        }
    }
}
