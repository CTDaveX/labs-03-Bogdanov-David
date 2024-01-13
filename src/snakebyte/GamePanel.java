package snakebyte;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.Serial;
import javax.swing.JPanel;

/******************************************************************
 * This class is used in for the Snake Game Project.
 * Update this class to complete the snake game according to the
 * design document description (see Canvas).
 * CLASS DESCRIPTION
 * This class is used to display and animate the snake graphics.
 ******************************************************************/
public class GamePanel extends JPanel {

    @Serial
    private static final long serialVersionUID = 5L;
    public static final int WIDTH  = 600;
    public static final int HEIGHT = 600;

    Food     food;
    boolean  isOver;
    boolean  isPaused;
    Snake 	 snake;

    Color   backGroundColor ;
    Color   fontColor;
    Color   scoreColor;

    public GamePanel(){
        backGroundColor = Color.BLACK;
        scoreColor      = Color.GRAY;
        fontColor       = Color.RED;
        isOver          = false;
        isPaused        = false;
        snake           = new Snake();
        food            = new Food(snake);
    }

    public void checkGameOver(Graphics graphics){
        //TODO: logic to check if game is over goes here.
    }


    public void draw(Graphics graphics){
        repaint();
        graphics.setColor(backGroundColor);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(scoreColor);
        graphics.setFont( new Font("Verdana", Font.BOLD, 20) );
        graphics.drawString("Score : " + food.getScore() , WIDTH / 20, HEIGHT / 20);
        snake.draw(graphics);
        food.draw(graphics);
    }

    public void gameOver(Graphics graphics){
        repaint();
        graphics.setColor(fontColor);
        graphics.setFont( new Font("Lucida Grande", Font.BOLD, 60) );
        graphics.drawString("Game Over", WIDTH / 4, HEIGHT / 2);
        graphics.drawString("Score : " + food.getScore() ,  WIDTH / 4, 2 * HEIGHT / 3);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
        checkGameOver(graphics);
    }

    public void update(Graphics graphics) {
        super.update(graphics);
        paintComponent(graphics);
    }
}
