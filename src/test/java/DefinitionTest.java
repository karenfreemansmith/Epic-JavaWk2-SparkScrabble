import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {
  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDef = new Definition("an animal that barks");
    assertEquals(true, myDef instanceof Definition);
  }

  @Test
  public void getDefinition_returnsValidText_String() {
    Definition myDef = new Definition("an animal that barks");
    assertEquals("an animal that barks", myDef.getDefinition());
  }

}
