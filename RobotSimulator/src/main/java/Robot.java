public class Robot {

    GridPosition gridPosition;
    Orientation orientation;
    Orientation[] orientations = Orientation.values();

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public void turnRight() {
        turn(1);
    }

    public void turnLeft() {
        turn(-1);
    }

    public void advance() {
        switch (orientation) {
            case NORTH -> gridPosition.goNorth();
            case SOUTH -> gridPosition.goSouth();
            case WEST -> gridPosition.goWest();
            case EAST -> gridPosition.goEast();
        }
    }

    public void simulate(String instructions) {
        char[] chars = instructions.toCharArray();
        for (char ch : chars) {
            switch (ch) {
                case 'L' -> turnLeft();
                case 'R' -> turnRight();
                case 'A' -> advance();
            }
        }
    }

    private void turn(int direction) {
        if (orientation.equals(orientations[orientations.length - 1]) && direction == 1) {
            orientation = orientations[0];
            return;
        } else if (orientation.equals(orientations[0]) && direction == -1) {
            orientation = orientations[orientations.length - 1];
            return;
        } else {
            for (int i = 0; i < orientations.length; i++) {
                if (orientations[i].equals(orientation)) {
                    orientation = orientations[i + direction];
                    return;
                }
            }
        }

    }
}
