public class GridPosition {
    int x;
    int y;

    public GridPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goNorth(){
        y++;
    }

    public void goSouth(){
        y--;
    }

    public void goWest(){
        x--;
    }

    public void goEast(){
        x++;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else if (x != ((GridPosition) obj).x || y != ((GridPosition) obj).y) {
            return false;
        } else {
            return true;
        }
    }
}
