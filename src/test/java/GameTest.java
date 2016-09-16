import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {
  private Game myGame = new Game();

  @Test
  public void Game_instantiatesCorrectly_true() {
    assertEquals(true, myGame instanceof Game);
  }
}
