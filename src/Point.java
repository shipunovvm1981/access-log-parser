package src;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String res;
        res = "{" + x + ";" + y + "}";
        return res;
    }
}
