
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(-50);
        wall.moveHorizontal(-65);
        wall.changeSize(400);
        wall.makeVisible();
       
  
        sun = new Circle();
        sun.changeColor("white");
        sun.moveVertical(-10);
        sun.moveHorizontal(38);
        sun.changeSize(20);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("white");
        sun.moveVertical(-30);
        sun.moveHorizontal(25);
        sun.changeSize(30);
        sun.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(20);
        wall.changeSize(30);
        wall.makeVisible();
        
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveVertical(180);
        wall.moveHorizontal (-60);
        wall.changeSize(500);
        wall.makeVisible();
        
        wall = new Square ();
        wall.changeColor("black");
        wall.moveVertical(50);
        wall.changeSize(30);
        wall.makeVisible();
        
        wall = new Square ();
        wall.changeColor("black");
        wall.moveVertical(50);
        wall.moveHorizontal(70);
        wall.changeSize(30);
        wall.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.changeSize (30);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(60);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(30);
        window.moveVertical(150);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(140, 80);
        roof.moveHorizontal(55);
        roof.moveVertical(200);
        roof.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(45);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
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
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
