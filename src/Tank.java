public class Tank {

    private int x;
    private int y;
    private int dir = 1;
    private int fuel;

    public void goForward(int traffic) {

        traffic = getTrafik(traffic);
        if (traffic > 0) {
            fuel -= traffic;
        } else {
            fuel += traffic;
        }

        if (dir == 1) {
            x += traffic;
        } else if (dir == 2) {
            y += traffic;
        } else if (dir == 3) {
            x -= traffic;
        } else if (dir == 4) {
            y -= traffic;
        }
    }

    public void goBackward(int traffic) {
        goForward(-traffic);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    public void turnRight() {

        if (dir == 1) {
            dir = 2;
        } else if (dir == 2) {
            dir = 3;
        } else if (dir == 3) {
            dir = 4;
        } else if (dir == 4) {
            dir = 1;
        }
    }

    public void turnLeft() {

        if (dir == 1) {
            dir = 4;
        } else if (dir == 2) {
            dir = 1;
        } else if (dir == 3) {
            dir = 2;
        } else if (dir == 4) {
            dir = 3;
        }
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank() {
        this(0, 0, 100);
    }

    public int getTrafik(int traffic){
        if (Math.abs(traffic) > fuel) {

            if (traffic < 0) {
                traffic = -fuel;
            } else {
                traffic = fuel;
            }
        }
        return traffic;
    }
}