import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {
  private Player newPlayer = new Player("Fred");
  private Player anotherPlayer = new Player("Barney");

  @Test
  public void Player_instantiatesCorrectly_true() {
    assertEquals(true, newPlayer instanceof Player);
  }

  @Test
  public void getPlayerName_returnsCorrectName_String() {
    assertEquals("Fred", newPlayer.getPlayerName());
  }

  @Test
  public void all_returnsMultiplePlayers_2() {
    assertEquals(2, Player.all().size());
  }

  @After
  public void tearDown() {
    Player.clear();
  }
}
