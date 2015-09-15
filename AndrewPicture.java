/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class AndrewPicture
{
    private Square building1;
    private Square building2;
    private Square building3;
    private Square building4;
    private Triangle roof;
    private Circle sun;
    private Person dude;

    /**
     * Constructor for objects of class Picture
     */
    public AndrewPicture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        building1 = new Square();
        building1.moveHorizontal(-140);
        building1.moveVertical(20);
        building1.changeSize(120);
        building1.makeVisible();
        
        building2 = new Square();
        building2.changeColor("black");
        building2.moveHorizontal(-120);
        building2.moveVertical(40);
        building2.changeSize(40);
        building2.makeVisible();
        
        building3 = new Square();
        building3.moveHorizontal(-140);
        building3.moveVertical(20);
        building3.changeSize(120);
        building3.makeVisible();
        
        building2 = new Square();
        building2.changeColor("black");
        building2.moveHorizontal(-120);
        building2.moveVertical(40);
        building2.changeSize(40);
        building2.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (building1 != null)   // only if it's painted already...
        {
            building1.changeColor("black");
            building2.changeColor("black");
            building3.changeColor("black");
            building4.changeColor("black");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
