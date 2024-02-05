
//Written by Taehoon Kang, kang0493 and Yejin Shin shin0390

import java.awt.Color;


public class Rectangle{
    private double xposition; // x coordinate of the rectangle's upper left corner
    private double yposition; // y coordinate of the rectangle's upper left corner
    private double width; // the width of the rectangle
    private double height; // the height of the rectangle
    private Color color; // the color of the rectangle

    public Rectangle(double xposition, double yposition, double width, double height) {
        this.xposition = xposition; // constructs a rectangle object for x coordinate of the rectangle's upper left corner
        this.yposition = yposition; // constructs a rectangle object for y coordinate of the rectangle's upper left corner
        this.width = width; //constructs a rectangle object for width of the rectangle
        this.height = height; //constructs a rectangle object for height of the rectangle

    }
    public double calculatePerimeter(){
        return (width + height) * 2; // calculate and return the perimeter of the rectangle


    }

    public double calculateArea(){ // calculate the Area of the rectangle
        return width * height; // return the Area of the rectangle
    }

    public void setColor(Color colorofshape){
        color = colorofshape; //the new color of shape to set for rectangle

    }

    public void setPos(double x, double y) {
        xposition = x; // the new x coordinate for rectangle's upper left corner is assigned
        yposition = y; // the new y coordinate for rectangle's upper left corner is assigned
    }

    public void setHeight (double h){
        height = h; //sets the height of the rectangle to new height

    }

    public void setWidth(double w){
        width = w; //sets the width of the rectangle to new width
    }

    public Color getColor(){
        return color; //gets the color of the rectangle
    }

    public double getXPos(){
        return xposition; //gets the x coordinate of the rectangle's upper left corner
    }
    public double getYPos(){
        return yposition; //gets the y coordinate of the rectangle's upper left corner
    }

    public double getHeight(){
        return height; //gets the height of the rectangle
    }
    public double getWidth(){
        return width; //gets the width of the rectangle
    }
}