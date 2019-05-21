import lang.stride.*;

/**
 * This class represents a simple picture. You can draw the picture using the draw method. But wait, there's more: being an electronic picture, it can be changed. You can set it to black-and-white display and back to colors (only after it's been drawn, of course).
 * This class was written as an early example for teaching Java with BlueJ.
 * @author  Michael Kölling and David J. Barnes @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square drive;
    private Square drive1;
    private Square drive2;
    private Square drive3;
    private Square drive4;
    private Square yard;
    private Square yard1;
    private Square yard2;
    private Square garage;
    private Square main;
    private Square main1;
    private Triangle roof1;
    private Square garage2;
    private Square garage3;
    private Square garage4;
    private Square win1;
    private Square win2;
    private Square win3;
    private Square win4;
    private Triangle front;
    private Square door;
    private Square door1;
    private Circle knob;
    private Circle bush;
    private Circle bush1;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        /* nothing to do... instance variables are automatically set to null*/
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall =  new  Square();
        wall.moveVertical(180);
        wall.changeColor("black");
        wall.changeSize(80);
        wall.makeVisible();
        
        drive =  new  Square();
        drive.moveVertical(180);
        drive.moveHorizontal(20);
        drive.changeColor("black");
        drive.changeSize(80);
        drive.makeVisible();
        
        drive1 =  new  Square();
        drive1.moveVertical(180);
        drive1.moveHorizontal(100);
        drive1.changeColor("black");
        drive1.changeSize(80);
        drive1.makeVisible();
        
        drive2 =  new  Square();
        drive2.moveVertical(180);
        drive2.moveHorizontal(180);
        drive2.changeColor("black");
        drive2.changeSize(80);
        drive2.makeVisible();
        
        drive3 =  new  Square();
        drive3.moveVertical(180);
        drive3.moveHorizontal(140);
        drive3.changeColor("black");
        drive3.changeSize(40);
        drive3.makeVisible();
        
        drive4 =  new  Square();
        drive4.moveVertical(180);
        drive4.moveHorizontal(200);
        drive4.changeColor("black");
        drive4.changeSize(40);
        drive4.makeVisible();
        
        yard =  new  Square();
        yard.moveVertical(180);
        yard.moveHorizontal(80);
        yard.changeColor("green");
        yard.changeSize(40);
        yard.makeVisible();
        
        yard1 =  new  Square();
        yard1.moveVertical(180);
        yard1.moveHorizontal(140);
        yard1.changeColor("green");
        yard1.changeSize(40);
        yard1.makeVisible();
        
        yard2 =  new  Square();
        yard2.moveVertical(180);
        yard2.moveHorizontal(200);
        yard2.changeColor("green");
        yard2.changeSize(40);
        yard2.makeVisible();
        
        garage =  new  Square();
        garage.moveVertical(40);
        garage.changeColor("blue");
        garage.changeSize(140);
        garage.makeVisible();
        
        garage2 =  new  Square();
        garage2.moveVertical(100);
        garage2.changeColor("red");
        garage2.changeSize(80);
        garage2.makeVisible();
        
        garage3 =  new  Square();
        garage3.moveVertical(120);
        garage3.moveHorizontal(20);
        garage3.changeColor("white");
        garage3.changeSize(10);
        garage3.makeVisible();
        
        garage4 =  new  Square();
        garage4.moveVertical(120);
        garage4.moveHorizontal(40);
        garage4.changeColor("white");
        garage4.changeSize(10);
        garage4.makeVisible();
        
        main =  new  Square();
        main.moveVertical(80);
        main.moveHorizontal(140);
        main.changeColor("blue");
        main.changeSize(100);
        main.makeVisible();
        
        main1 =  new  Square();
        main1.moveVertical(0);
        main1.moveHorizontal(140);
        main1.changeColor("blue");
        main1.changeSize(100);
        main1.makeVisible();
        
        door =  new  Square();
        door.moveVertical(140);
        door.moveHorizontal(120);
        door.changeColor("red");
        door.changeSize(20);
        door.makeVisible();
        
        door1 =  new  Square();
        door1.moveVertical(160);
        door1.moveHorizontal(120);
        door1.changeColor("red");
        door1.changeSize(20);
        door1.makeVisible();
        
        knob =  new  Circle();
        knob.changeColor("yellow");
        knob.moveHorizontal(175);
        knob.moveVertical(145);
        knob.changeSize(5);
        knob.makeVisible();
        
        window =  new  Square();
        window.changeColor("green");
        window.changeSize(40);
        window.moveHorizontal(180);
        window.moveVertical(180);
        window.makeVisible();
        
        roof =  new  Triangle();
        roof.changeSize(50, 150);
        roof.moveHorizontal(80);
        roof.moveVertical(25);
        roof.changeColor("red");
        roof.makeVisible();
        
        roof1 =  new  Triangle();
        roof1.changeSize(50, 150);
        roof1.moveHorizontal(210);
        roof1.moveVertical(-15);
        roof1.changeColor("red");
        roof1.makeVisible();
        
        front =  new  Triangle();
        front.changeSize(20, 60);
        front.moveHorizontal(140);
        front.moveVertical(140);
        front.changeColor("red");
        front.makeVisible();
        
        win1 =  new  Square();
        win1.moveVertical(10);
        win1.moveHorizontal(160);
        win1.changeColor("white");
        win1.changeSize(20);
        win1.makeVisible();
        
        win2 =  new  Square();
        win2.moveVertical(10);
        win2.moveHorizontal(200);
        win2.changeColor("white");
        win2.changeSize(20);
        win2.makeVisible();
        
        win3 =  new  Square();
        win3.moveVertical(100);
        win3.moveHorizontal(200);
        win3.changeColor("white");
        win3.changeSize(20);
        win3.makeVisible();
        
        win4 =  new  Square();
        win4.moveVertical(100);
        win4.moveHorizontal(160);
        win4.changeColor("white");
        win4.changeSize(20);
        win4.makeVisible();
        
        sun =  new  Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-40);
        sun.moveVertical(-60);
        sun.changeSize(60);
        sun.makeVisible();
        
        bush =  new  Circle();
        bush.changeColor("green");
        bush.moveHorizontal(130);
        bush.moveVertical(140);
        bush.changeSize(30);
        bush.makeVisible();
        
        bush1 =  new  Circle();
        bush1.changeColor("green");
        bush1.moveHorizontal(180);
        bush1.moveVertical(140);
        bush1.changeSize(30);
        bush1.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        /* only if it's painted already...*/
        if (wall != null) {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        /* only if it's painted already...*/
        if (wall != null) {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
