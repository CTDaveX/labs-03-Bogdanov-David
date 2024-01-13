package snakebyte;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/******************************************************************
 * This class is a part of your GitHub project
 * Update this class to complete the snake game according to the
 * design document description (see Canvas).
 * CLASS DESCRIPTION
 * This class is used to draw the food graphics on the game panel.
 ******************************************************************/
public class Food {

    private final double    n;
    private double          x;
    private double          y;
    private int    	        score;
    private final Snake     snake;

    private final Color     foodColor;

    public static final int SIZE  = 10;

    public Food(Snake snake) {
        this.foodColor  = Color.GREEN;
        this.n          = 1.5;
        this.score 	    = 0;

        //TODO : connect snake to food
        this.snake 	    = null;

        //TODO : set snake location on screen
    }

    public void checkCollision() {
        double snakeHeadX = snake.getX() + Snake.SQUARE / 2.0;
        double snakeHeadY = snake.getY() + Snake.SQUARE / 2.0;

        //TODO: create logic for snake collision with the food.
        if (snakeHeadX >= (x - 1) && snakeHeadX <= (x + SIZE ) ) {
            if (snakeHeadY >= (y - 1) && snakeHeadY <= (y + SIZE) ) {

                //TODO: increment score when snake collides with food.

                //TODO: grow snake when snake collides with food.
            }
        }
    }

    public void draw(Graphics graphics) {
        Graphics2D 	pen 	= (Graphics2D) graphics;
        Rectangle2D food 	= new Rectangle2D.Double(x, y, SIZE, SIZE);
        
        //TODO: draw food
    }

    public int getScore() {
        return score;
    }

    public void setLocation() {
        x     =  (Math.random() * ( Controller.WIDTH  - n * SIZE ) );
        y     =  (Math.random() * ( Controller.HEIGHT - n * SIZE ) );

        if (x < 0) {
            x = -x;
        }

        if (x > Controller.WIDTH - SIZE) {
            x = Controller.WIDTH - 2 * SIZE;
        }

        if (y < 0) {
            y = -y;
        }

        if (y > Controller.HEIGHT - SIZE) {
            y = Controller.HEIGHT - 2 * SIZE;
        }
    }

}
