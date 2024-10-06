public class Tank {
    int x;
    int y;
    int coordinates;
    int fuel;
    final String s = "T34";
    private static int tankCount;
    private int n;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++tankCount;
    }


    public void goForward(int i) {
        if (i < 0 && -i > fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;

        if (coordinates == 0) x += i;
        else if (coordinates == 1) y += i;
        else if (coordinates == 2) x -= i;
        else y -= i;

        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank " + s + "-" + n + " is at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
    public void turnLeft() {
        coordinates--;
        if (coordinates == -1) coordinates = 3;
    }

    public void turnRight() {
        coordinates++;
        if (coordinates == 4) coordinates = 0;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
