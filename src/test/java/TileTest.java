import org.junit.*;
import static org.junit.Assert.*;

public class TileTest {
  private Tile newTile = new Tile('A', 1);

  @Test
  public void Tile_instantiatesCorrectly_true() {
    assertEquals(true, newTile instanceof Tile);
  }

  @Test
  public void getValue_returnsCorrectValue_1() {
    assertEquals(1, newTile.getValue());
  }
  @Test
  public void getMark_returnsCorrectValue_A() {
    assertEquals('A', newTile.getMark());
  }
  @Test
  public void getStatus_returnsCorrectValue_false() {
    assertEquals(false, newTile.getStatus());
  }
}
