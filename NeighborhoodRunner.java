import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter bg = new MuralPainter();

    bg.paintBackground("royalblue", 12);

    DuckPainter duck = new DuckPainter();

    duck.paintDuck();


    
  }
}