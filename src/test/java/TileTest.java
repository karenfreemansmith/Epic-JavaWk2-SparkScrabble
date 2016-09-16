import org.junit.*;
import static org.junit.Assert.*;

public class TileTest {
  private Tile newTile = new Tile();

  @Test
  public void Tile_instantiatesCorrectly_true() {
    assertEquals(true, newTile instanceof Tile);
  }
}
