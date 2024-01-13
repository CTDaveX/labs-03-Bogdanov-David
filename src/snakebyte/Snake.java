package snakebyte;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.ArrayList;

/******************************************************************
 * This class is used in your GitHub Snake Game Project.
 * Update this class to complete the snake game according to the
 * design document description (see Canvas).
 * CLASS DESCRIPTION
 * This class uses an ArrayList to draw the snake body graphics
 * on the game panel.
 ******************************************************************/
public class Snake {

    private final Color         bodyColor;
    private Direction           direction;
    private boolean             isLonger;
    private boolean             isMoving;
    private final List<Point>   snakeBody;

    public static final int  SQUARE     = 8;
    public static final int  START_SIZE = 20;
    public static final int  STARTxCoordinate  = Controller.WIDTH  / 2;
    public static final int  STARTyCoordinate  = Controller.HEIGHT / 2;

    public Snake() {
        bodyColor  = Color.WHITE;
        isMoving   = false;
        isLonger   = false;
        snakeBody  = make();
    }

    public void draw(Graphics graphics) {
        Graphics2D pen = (Graphics2D) graphics;
        pen.setColor(bodyColor);
        double xCoordinate, yCoordinate;

        for (Point point : snakeBody) {
            xCoordinate = point.getX();
            yCoordinate = point.getY();
            Rectangle2D body = new Rectangle2D.Double(xCoordinate, yCoordinate, SQUARE, SQUARE);
            pen.draw(body);
        }
    }

    public Direction getDirection() {
        return direction;

    }

    public double getX() {
        //TODO: return x location of snake on screen.
        return 0;
    }

    public double getY() {
        //TODO: return y location of snake on screen.
        return 0;
    }

    public void grow(boolean isLonger) {
        //TODO: update if snake body has to get longer (grow).
    }

    public boolean hasCollision() {
        double x = getX();				// snake head location X
        double y = getY();				// snake head location Y

        for (int i = 1; i < snakeBody.size(); i++) {
            //TODO: Check if the snake body locations are in the same spot
            //      return true if it does.
        }
        return false;
    }

    public void isInMotion(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public boolean isMoving() {
        return isMoving;
    }

    private ArrayList<Point> make() {

        //TODO: create an ArrayLis of points to make the snake body

        //TODO: add starting point (front of snake) to the array list

        //TODO: add each additional point to create the snake body (use loop)

        //TODO: return the starting snake body
        return null;
    }

    public void move() {

        if (isMoving) {

            Point head    	= snakeBody.get(0);
            Point tail   	= snakeBody.get(snakeBody.size() - 1);

            //new (x, y) location of head of snakeBody
            double   newX    = head.getX() + direction.getX() * SQUARE;
            double   newY    = head.getY() + direction.getY() * SQUARE;

            Point newHead = new Point(newX, newY);

            //update the snake body locations when moving head location
            for (int i = snakeBody.size() - 1; i > 0; i--) {
                snakeBody.set(i, snakeBody.get(i - 1) );
            }
            snakeBody.set(0, newHead);

            // TODO: grow the snake body by one SQUARE when collided with food

        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
