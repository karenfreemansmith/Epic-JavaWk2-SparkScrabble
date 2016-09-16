import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("dog");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void getWord_returnsValidText_String() {
    Word myWord = new Word("dog");
    assertEquals("dog", myWord.getWord());
  }
}
