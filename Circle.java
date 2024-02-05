//Written by Taehoon Kang, kang0493 and Yejin Shin shin0390

import java.awt.Color;

public class Circle {
    private double xpos; //x coordinate of the circle's center
    private double ypos;//y coordinate of the circle's center
    private double radius; //the radius of the circle
    private double perimeter; // the calculated perimeter of the circle
    private double Area; //the calculated area of the circle
    private Color color; //the color of the circle

    public Circle(double xpos, double ypos, double radius){ //short variable name{
        this.xpos = xpos; //constructs a circle object for x coordinate of the circle center
        this.ypos = ypos; //constructs a circle object for y coordinate of the circle center
        this.radius = radius; //constructs a circle object for radius of the circle
    }

    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius; //calculate the perimeter of the circle
        return perimeter; //returns the perimeter of the circle
    }

    public double calculateArea() {
        Area = Math.PI * Math.pow(radius, 2); //calculate the Area of the circle
        return Area; //return the Area of the circle
    }

    public void setColor (Color newcolor){
        color = newcolor; //the new color to set for circle

    }

    public void setPos(double newx, double newy){
        xpos = newx; //the new x coordinate for circle's center is assigned
        ypos = newy; //the new y coordinate for the circle's center is assigned

    }

    public void setRadius(double newradius){
        radius = newradius; //sets the radius of the circle to newradius
    }



    public Color getColor(){
        return color; //gets the color of the circle
    }
    public double getXPos(){
        return xpos; //gets the x coordinate of the circle's center

    }

    public double getYPos(){
        return ypos; //gets the y coordinate of the circle's center

    }

    public double getRadius(){
        return radius; //gets the radius of the circle

    }

}