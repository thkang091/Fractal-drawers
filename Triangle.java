//Written by Taehoon Kang, kang0493 and Yejin Shin shin0390

import java.awt.Color;

public class Triangle {
    private double xpos; // x coordinate of the triangle's bottom left corner
    private double ypos; // y coordinate of the triangle's bottom left corner
    private double width; // the width of the triangle
    private double height; // the height of the triangle
    private Color color; // the color of the triangle

    public Triangle(double xpos, double ypos, double width, double height) { //short variable name
        this.xpos = xpos; // constructs a triangle object for x coordinate of the triangle's bottom left corner
        this.ypos = ypos; // constructs a triangle object for y coordinate of the triangle's bottom left corner
        this.width = width; //constructs a triangle object for width of the triangle
        this.height = height; //constructs a triangle object for height of the triangle
        }

    public double calculatePerimeter() {
        double side = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)); // calculate the perimeter of the triangle
        return side * 2 + width; //returns the perimeter of the triangle
    }


    public double calculateArea() { //calculate the Area of the triangle
        return width * height * 0.5; //return the Area of the triangle
    }

    public void setColor(Color newcolor) {
        color = newcolor; } //the new color to set for triangle

    public void setPos(double new_x, double new_y) {
        xpos = new_x; //the new x coordinate for triangle's bottom left corner is assigned
        ypos = new_y; //the new y coordinate for the triangle's bottom left corner is assigned
    }
    public void setHeight(double new_height)
    {
        height = new_height; //sets the height of the triangle to new height
    }

    public void setWidth(double new_width){
        width = new_width; //sets the width of the triangle to new width
    }
    public Color getColor() {
        return color; //gets the color of the triangle
    }

    public double getXPos(){
        return xpos; //gets the x coordinate of the triangle's bottom left corner
    }
    public double getYPos(){
        return ypos; //gets the y coordinate of the triangle's bottom left corner
    }
    public double getHeight(){
        return height; //gets the height of the triangle
    }
    public double getWidth(){
        return width; //gets the width of the triangle
    }



}