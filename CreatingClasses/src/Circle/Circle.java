/*
* Sebastian Callejas
* Period 2
* Project: Circle
 */
package Circle;

/**
 *
 * @author 18051
 */
public class Circle {
//Lets get it done

    private double radius;
    private double diameter;
    private double circumference;

    public Circle(double rad, double dia, double circ) {
        radius = rad;
        diameter = dia;
        circumference = circ;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    public void setRadius(double pRadius) {
        radius = pRadius;
    }

    public void setDiameter(double pDiameter) {
        diameter = pDiameter;
    }

    public void setCircumference(double pCircumference) {
        circumference = pCircumference;
    }

    public String toString() {
        return "Circle with a radius of " + radius + ", diamter of " + diameter
                + ", and circumference of " + circumference;
    }
}
