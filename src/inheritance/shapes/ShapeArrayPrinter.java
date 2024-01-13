package inheritance.shapes;

import java.text.DecimalFormat;

public class ShapeArrayPrinter {

    /******************************************************
     * method: task
     * 		   prints out the behaviors of shape 
     ******************************************************/
    public static void task(Shape[] shapes) {

        for (Shape geometricShape : shapes) {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("--------" + geometricShape.thisShape() + "-------- ");
            System.out.println("Coordinate X: " + geometricShape.getX());
            System.out.println("Coordinate Y: " + geometricShape.getY());
            System.out.println("Parameters: "   + geometricShape);
            System.out.println("Area: "         + df.format(geometricShape.area()));
            System.out.println("Perimeter: "    + df.format(geometricShape.perimeter()));

            if (geometricShape instanceof Circle) {
                System.out.println("Radius: " + ((Circle) geometricShape).getRadius());
            }
            System.out.println();
        }
    }

    /******************************************************
     * method: equalArea
     * 		   checks if the areas of two geometrical examples.animate.shapes
     * 		   are equal to two decimal places
     ******************************************************/
    public static void main(String[] args) {

        Shape[] shapes = {  new Circle(5.0),
                            new Rectangle(8.0, 4.0),
                            new Triangle(1.0, Math.sqrt(3.0), 2.0)
                         };

        task(shapes);
    }

}
