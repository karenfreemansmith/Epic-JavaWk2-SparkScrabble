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

  @Test
  public void find_returnsCorrectPlayer_Barney() {
    assertEquals("Barney", Player.find(2).getPlayerName());
  }

  @Test
  public void drawTile_addsTileToList_2() {
    Tile tile1 = new Tile('A',1);
    Tile tile2 = new Tile('Z',10);
    newPlayer.drawTile(tile1);
    newPlayer.drawTile(tile2);
    assertEquals(2, newPlayer.viewTiles().size());
  }

  @Test
  public void placeTile_returnsTile_true() {
    Tile tile1 = new Tile('A',1);
    Tile tile2 = new Tile('Z',10);
    newPlayer.drawTile(tile1);
    newPlayer.drawTile(tile2);
    assertEquals(true, newPlayer.placeTile(1) instanceof Tile);
  }

  @Test
  public void placeTile_returnsExpectedTile_A() {
    Tile tile1 = new Tile('A',1);
    Tile tile2 = new Tile('Z',10);
    newPlayer.drawTile(tile1);
    newPlayer.drawTile(tile2);
    assertEquals('A', newPlayer.placeTile(0).getMark());
  }

  @After
  public void tearDown() {
    Player.clear();
  }
}
