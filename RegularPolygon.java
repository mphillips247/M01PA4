import java.text.DecimalFormat;

public class RegularPolygon {
	//declare variables
    private int n;
    private double side;
    private double x;
    private double y;

    DecimalFormat df = new DecimalFormat("##.##");
//constructor
    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
//parameterized constructor
    public RegularPolygon(int N, double SIDE) {
        n = N;
        side = SIDE;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int N, double SIDE, double x, double y) {
        n = N;
        side = SIDE;
        this.x = x; 
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int N) {
        n = N;
    }

    public void setSide(double SIDE) { // Change the parameter type to double
        side = SIDE;
    }

    public void setX(double X) { // Change the parameter name to X
        x = X;
    }

    public void setY(double Y) { // Change the parameter name to Y
        y = Y;
    }
//calculate perimeter
    public double getPerimeter() {
        return n * side;
    }
//calculate area
    public double getArea() {
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / n); // Use Math.PI instead of 3.142
        return numerator / denominator;
    }
}
