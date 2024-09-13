
import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  /*
  * Turns the Painter right
  */
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /*
  * The Painter takes all the paint buckets
  */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  /*
  * Turns the Painter around
  */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
  * Moves the Painter continuously
  */
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  /*
  * The Painter paints continuously
  */
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  /*
  * Moves the Painter a certain amount of spaces
  */
  public void moveMore(int spaces) {
    int i = spaces;
    while (i > 0) {
      move();
      i--;
    }
  }

  /*
  * The Painter paints a 2x2 square
  */
  public void paintSquare(String color) {
    while (hasPaint()) {
      move();
      paint(color);
      turnRight();
    }
  }

  /*
  * The Painter paints a 3x3 with no paint in the middle block
  */
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

  /*
  * The Painter paints a diagonal down to the right
  */
  public void paintDiagonal(String color) {
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
  }

  /*
  * The Painter starts a new line to paint
  */
  public void startNewLine(String direction) {
    if (direction == "right") {
      turnRight();
      move();
      turnRight();
      move();
    } else {
      turnLeft();
      move();
      turnLeft();
      move();
    }
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

}