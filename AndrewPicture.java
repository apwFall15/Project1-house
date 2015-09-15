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
    private Square sky;
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
        sky = new Square();
        sky.changeColor("blue");
        sky.moveVertical(-5300);
        sky.moveHorizontal(-500);
        sky.changeSize(5000,5000);
        sky.makeVisible();
        
        building1 = new Square();
        building1.changeColor("lightGray");
        building1.moveHorizontal(-140);
        building1.moveVertical(80);
        building1.changeSize(50,90);
        building1.makeVisible();
        
        building2 = new Square();
        building2.changeColor("medGray");
        building2.moveHorizontal(-200);
        building2.moveVertical(80);
        building2.changeSize(65,150);
        building2.makeVisible();
        
        building3 = new Square();
        building3.moveHorizontal(-130);
        building3.changeColor("lightGray");
        building3.moveVertical(80);
        building3.changeSize(55,120);
        building3.makeVisible();
        
        building4 = new Square();
        building4.changeColor("medGray");
        building4.moveHorizontal(-100);
        building4.moveVertical(80);
        building4.changeSize(40,80);
        building4.makeVisible();
        


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
        if (building1 != null)   // only if it's painted already...
        {
            building1.changeColor("lightGray");
            building2.changeColor("medGray");
            building3.changeColor("lightGray");
            building4.changeColor("medGray");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
