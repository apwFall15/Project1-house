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
    private Square building5;
    private Square sky;
    private Triangle road;
    private Triangle mountain1;
    private Triangle mountain2;
    private Square roadMiddle;
    private Triangle road2;
    private Triangle roadCap;
    private Square grass;
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
        sky.changeSize(500,300);
        sky.moveTo(0,300);
        sky.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(500,100);
        grass.moveTo(0,300);
        grass.makeVisible();
        
        building2 = new Square();
        building2.changeColor("medGray");
        building2.changeSize(65,150);
        building2.moveTo(30,200);
        building2.makeVisible();
        
        building4 = new Square();
        building4.changeColor("medGray");
        building4.changeSize(40,80);
        building4.moveTo(120,200);
        building4.makeVisible();
                
        building1 = new Square();
        building1.changeColor("lightGray");
        building1.changeSize(50,90);
        building1.moveTo(10,200);
        building1.makeVisible();
     
        building5 = new Square();
        building5.changeColor("lightGray");
        building5.changeSize(40,60);
        building5.moveTo(70,200);
        building5.makeVisible();
        
        building3 = new Square();
        building3.changeColor("lightGray");
        building3.changeSize(55,120);
        building3.moveTo(150,200);
        building3.makeVisible();

        road = new Triangle();  
        road.changeColor("black");
        road.changeSize(100, 60);
        road.moveTo(120,300);
        road.makeVisible();

        roadMiddle = new Square();
        roadMiddle.changeColor("black");
        roadMiddle.changeSize(10,100);
        roadMiddle.moveTo(110,300);
        roadMiddle.makeVisible();

        road2 = new Triangle();  
        road2.changeColor("black");
        road2.changeSize(100, 60);
        road2.moveTo(110,300);
        road2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(45);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();

        mountain2 = new Triangle();
        mountain2.changeColor("medGray");
        mountain2.changeSize(120,160);
        mountain2.moveTo(370,230);
        mountain2.makeVisible();        

        mountain1 = new Triangle();
        mountain1.changeColor("lightGray");
        mountain1.changeSize(130,170);
        mountain1.moveTo(400,240);
        mountain1.makeVisible();
        
        dude = new Person();
        dude.changeColor("orange");
        dude.changeSize(20,15);
        dude.moveTo(180,270);
        dude.makeVisible();
       
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (building1 != null)   // only if it's painted already...
        {
            sky.changeColor("white");
            grass.changeColor("black");
            building2.changeColor("black");
            building4.changeColor("black");
            building1.changeColor("black");
            building3.changeColor("black");
            building5.changeColor("black");
            road.changeColor("white");
            road2.changeColor("white");
            roadMiddle.changeColor("white");
            mountain2.changeColor("black");
            mountain1.changeColor("black");
            dude.changeColor("white");
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
            sky.changeColor("blue");
            grass.changeColor("green");
            building2.changeColor("medGray");
            building4.changeColor("medGray");
            building1.changeColor("lightGray");
            building3.changeColor("lightGray");
            building5.changeColor("lightGray");
            road.changeColor("black");
            road2.changeColor("black");
            roadMiddle.changeColor("black");
            mountain2.changeColor("medGray");
            mountain1.changeColor("lightGray");
            dude.changeColor("orange");
            sun.changeColor("yellow");
            
        }
    }
}
