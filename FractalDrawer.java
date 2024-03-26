
////Written by Taehoon Kang, kang0493 and Yejin Shin shin0390

// FractalDrawer class draws a fractal of a shape 

// FractalDrawer class draws a fractal of a shape indicated by user input

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {}  // constructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas canvas = new Canvas(750,750); // create a canvas for drawing
        Color color = new Color(0,0,0); // set color for shape
        if ("rectangle".equals (type)){ //draw a rectangle if user inputs rectangle
            drawRectangleFractal(250, 300,200,150, color, canvas,1);  //calls drawRectangleFractal to draw Rectangle from x coordinate of the circle's center of 250, y coordinate of the circle's center of 300, width of 200, height of 150 with set color and canvas from level 1

        }
        else if ("triangle".equals(type)){ //draw a triangle if user inputs triangle
            drawTriangleFractal(250, 400,150,150, color, canvas,1); //calls drawTriangleFractal to draw Triangle from x position of 250, y position of 400, width of 150, height of 150 with set color and canvas from level 1

        }
        else if ("circle".equals(type)){ //draw a circle if user inputs circle
            drawCircleFractal(100, 350,350, color, canvas,1);  // calls drawCircleFractal to draw Circle from raidus of 100, x positon of 350, y position of 350 with set color and canvas from level 1


        }
        return totalArea; // return total Area of the drawn fractal

    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double x, double y, double width, double height, Color c, Canvas can, int level){
        if (level == 7){ //checks if the level parameter is equal to 7
            Triangle triangle = new Triangle(x, y, width, height);  //Create a new triangle with parameters of x,y,width,height
            triangle.setColor(c); //the c is assigned to fill the triangle
            can.drawShape(triangle); //draw single triangle shape on the canvas
            totalArea += triangle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
    }
        else {
            Triangle triangle  = new Triangle(x, y, width, height); //Create a new triangle with parameters of x,y,width,height
            Random randomNumber = new Random(); // create random color with variable 'colorandom' and generate using with random class for the triangle.
            int color1 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color2 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color3 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            Color colorrandom = new Color(color1, color2, color3); //creates new Color object which represent red,green, and blue called colorandom using value of color1,color2,color3
            triangle.setColor(colorrandom); //the variable colorrandom is set to color randomly
            can.drawShape(triangle); //draw shape on the canvas that is written as can
            totalArea += triangle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
            drawTriangleFractal(x + 3*width/4, y - height/2, width/2, height/2,  c , can, level + 1); //shifts the center of the next triangle to the right and up and increment level by 1
            drawTriangleFractal(x - width/4 , y - height/2, width/2, height/2 , c, can, level + 1); //shifts the bottom left corner next triangle to the left and up and increment level by 1
            drawTriangleFractal(x + width/4, y + height/2 , width/2, height/2,  c ,can, level +1 ); //shifts the bottom left corner next triangle to the right and down and increment the level by 1
    }
}


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level == 7){ //checks if the level parameter is equal to 7
            Circle circle = new Circle(x, y, radius); //Create a new circle with parameters of x,y,and radius
            circle.setColor(c); //the c is assigned to fill the circle
            can.drawShape(circle); //draw single circle shape on the canvas
            totalArea += circle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
        }    
        else {
            Circle circle = new Circle(x, y, radius); //Create a new circle with parameters of x,y,radius
            Random randomNumber = new Random(); // create random color with variable 'colorandom' and generate using with random class for the circle
            int color1 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color2 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color3 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            Color colorrandom = new Color(color1, color2, color3); //creates new Color object which represent red,green, and blue called colorandom using value of color1,color2,color3
            circle.setColor(colorrandom); //the variable colorrandom is set to color randomly
            can.drawShape(circle); //draw shape on the canvas that is written as can
            totalArea += circle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
            drawCircleFractal(radius/2, x, y - 2*radius, c , can, level + 1); //shifts the center of the next circle to the up and increment level by 1
            drawCircleFractal(radius/2,x + 2*radius, y, c, can, level + 1); //shifts the center of the next circle to the right and increment level by 1
            drawCircleFractal(radius/2,x - 2*radius, y, c ,can, level +1 ); //shifts the center of the next circle to the left and increment level by 1
            drawCircleFractal( radius/2, x, y + 2*radius, c ,can, level + 1); //shifts the center of the next circle to the down and increment level by 1
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double x, double y, double width, double height,  Color c, Canvas can, int level) {
        if (level == 7){ //checks if the level parameter is equal to 7
            Rectangle rectangle = new Rectangle(x, y, width, height); //Create a new rectangle with parameters of x,y,width,height
            rectangle.setColor(c); //the c is assigned to fill the rectangle
            can.drawShape(rectangle); //draw single rectangle shape on the canvas
            totalArea += rectangle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
        } else {
            Rectangle rectangle = new Rectangle(x, y, width, height); //Create a new rectangle with parameters of x,y,width,height
            Random randomNumber = new Random(); // create random color with variable 'colorandom' and generate using with random class for the rectangle
            int color1 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color2 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            int color3 = randomNumber.nextInt(0,255); //assigned random integer between 0 and 255
            Color colorrandom = new Color(color1, color2, color3); //creates new Color object which represent red,green, and blue called colorandom using value of color1,color2,color3
            rectangle.setColor(colorrandom); //the variable colorrandom is set to color randomly
            can.drawShape(rectangle); //draw shape on the canvas that is written as can
            totalArea += rectangle.calculateArea(); //the area is calculated and added to the 'totalArea' variable
            drawRectangleFractal(x + 3 * width / 2 , y - 2 * height / 2, width / 2, height / 2,  c , can, level + 1); //shifts the upper left corner of the next rectangle to the right and up and increment level by 1
            drawRectangleFractal(x - 2 * width/2 , y - 2 * height / 2, width / 2, height / 2, c, can, level + 1); //shifts the upper left corner of the next rectangle to the left and up and increment level by 1
            drawRectangleFractal(x - 2 * width/2, y + 3 * height / 2, width / 2, height / 2,  c ,can, level +1); //shifts the upper left corner of the next rectangle to the left and down and increment level by 1
            drawRectangleFractal(x + 3 * width / 2, y + 3 * height / 2, width / 2, height / 2, c ,can, level + 1); //shifts the upper left corner of the next rectangle to the right and down and increment level by 1




        }


    }


    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.

    public static void main(String[] args){
        System.out.print("Choose from circle, triangle, rectangle: ");
        Scanner myScanner = new Scanner(System.in);
        String choice = myScanner.nextLine();
        FractalDrawer fd = new FractalDrawer();
        System.out.print(fd.drawFractal(choice));

    }
}
