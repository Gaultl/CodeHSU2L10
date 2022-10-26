public class RectangleTester
{
    public static void main(String[] args)
    {
        // Can call static methods
        // WITHOUT creating an object
        // Classname.method();
        Rectangle.rectEquations();
        
        // Cannot call non-static methods without
        // an object
        
        // WRONG
        //int area = Rectangle.area();
        
        // RIGHT
        Rectangle rect1 = new Rectangle(17,20);
        int area = rect1.area();
        System.out.println(area);
        
        //area.rectEquations(); will work, but AP will deduct points for
        //calling a static method on an object
    }
}