
public class LimitingRectangle {

    private int[][] points;
    private int x;
    private int x1;
    private int width;
    private int y;
    private int y1;
    private int height;


    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {

        x = points[0][0];
        x1 = points[0][0];

        for (int i = 0; i < points.length; i++) {

            if (points[i][0] > x) {
                x = points[i][0];
            } else if (points[i][0] < x) {
                x1 = points[i][0];
            }
            int width1 = x - x1;

            if (width < width1) {
                width = width1;
            }
        }
        return width;
    }

    public int getHeight() {

        y = points[0][1];
        y1 = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > y) {
                y = points[i][1];
            } else if (points[i][1] < y) {
                y1 = points[i][1];
            }
            int height1 = y - y1;

            if (height < height1) {
                height = height1;
            }
        }
        return height;
    }

    public String getBorders() {

        String extremePoints = y1 + ", " + y + ", " + x1 + ", " + x;
        return extremePoints;
    }
}


