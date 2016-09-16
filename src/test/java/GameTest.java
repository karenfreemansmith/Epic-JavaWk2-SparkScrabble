import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {
  private Game myGame = new Game();

  @Test
  public void Game_instantiatesCorrectly_true() {
    assertEquals(true, myGame instanceof Game);
  }

  @Test
  public void Game_instantiates100TilesCorrectly_Z() {
    //checks that last tile created is in the last spot of array of 100
    assertEquals('Z', myGame.getTile(100).getMark());
  }

  @Test
  public void Game_instantiatesSquaresCorrectly_4() {
    //checks that the last square created (14,14) has the triple word premium (4)
    assertEquals(4, myGame.getSquare(14,14).getPremium());
  }

  @Test
  public void getSquares_returnsAllSquares_15() {
    assertEquals(15, myGame.getSquares().length);
  }

  @Test
  public void getTiles_returnsAllTiles_100() {
    assertEquals(100, myGame.getTiles().length);
  }

  @Test
  public void addPlayers_returnsAllPlayers_2() {
    Player.clear();
    Player player1 = new Player("Fred");
    Player player2 = new Player("Barney");
    myGame.addPlayers(Player.all());
    assertEquals(2, myGame.getPlayers().size());
  }
}
