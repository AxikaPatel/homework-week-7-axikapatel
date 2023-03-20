package homeworkweek7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall
 */
public class Programme15Wall
{
    double width;
    double height;

    public static void main(String[] args)
    {

        Programme15Wall wall = new Programme15Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    //calling no parameter constructor
    public Programme15Wall()
    {

    }

    //calling parameter constructor
    public Programme15Wall(double width,double height)
    {
        this.width = width;
        this.height = height;
        if (width < 0 || height < 0)
        {
            width = 0;
            height = 0;
        }
    }

    //calling  instance method without parameter
    public double getWidth()
    {
        return width;
    }

    //calling  instance method without parameter
    public double getHeight()
    {
        return height;
    }

    //calling  instance method with parameter
    public double setWidth(double width)
    {
        if (this.width < 0)
        {
            this.width = width;
        }
        else
        {
            this.width=0;

        }
        return this.width;
    }

    //calling  instance method with parameter
    public void setHeight(double height)
    {
        if(height <0)
        {
            this.height =0;
        }else
        {
            this.height=height;
        }
    }

    //calling  instance method without parameter
    public double getArea ()
    {
        double area = width * height;
        return area;
    }
}
