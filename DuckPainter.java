import org.code.neighborhood.*;

public class DuckPainter extends MuralPainter {

  /*
  * Combines all methods in DuckPainter
  */
  public void paintDuck() {
    paintBody();
    paintBeak();
    paintEye();
    paintWing();
    paintSparkle();
    moveToCorner();
    turnRight();
    moveFast();
  }

  /*
  * Paints the head of the duck
  */
  public void paintHead() {
    
  // Moves Painter to starting point
    moveMore(2);
    turnRight();
    moveMore(3);
    turnLeft();

  // Starts painting duck head
    paintLine("gold", 3);
    startNewLine("right");

    paintLine("gold", 3);
    startNewLine("left");

    paintLine("gold", 3);
  }

  /*
  * Paints the body of the duck
  */
  public void paintBody() {
    paintHead();

  // Moves Painter to starting point
    moveMore(4);
    turnRight();
    move();
    turnRight();

  // Starts painting duck body
    paintLine("gold", 7);
    turnLeft();
    move();
    turnLeft();

    paintLine("gold", 7);
    startNewLine("right");
    move();

    paintLine("gold", 6);
    startNewLine("left");
    move();

    paintLine("gold", 4);
  }

  /*
  * Paints the beak of the duck
  */
  public void paintBeak() {
    
  // Moves Painter to starting point
    turnAround();
    moveMore(6);
    turnRight();
    moveMore(4);

  // Paints duck beak
    setPaint(1);
    paint("darkorange");
  }

  /*
  * Paints the eye of the duck
  */
  public void paintEye() {
    
  // Moves Painter to starting points
    move();
    turnRight();
    moveMore(2);

  // Paints duck eye
    setPaint(1);
    paint("black");
  }

  /*
  * Paints the wing of the duck
  */
  public void paintWing() {

  // Moves Painter to starting point
    moveMore(3);
    turnRight();
    moveMore(3);

  // Paints the wings of the duck
    setPaint(2);
    
    paint("orange");

    move();
    turnRight();
    move();

    paint("orange");
  }

  /*
  * Paints the sparkle
  */
  public void paintSparkle() {

  // Moves Painter to starting point
    turnRight();
    moveMore(6);
    turnRight();
    moveMore(3);

  // Starts to paint the sparkle
    paintLine("lavenderblush", 3);

    startNewLine("right");
    move();
    turnRight();

    paintLine("lavenderblush", 3);
  }
  
}
