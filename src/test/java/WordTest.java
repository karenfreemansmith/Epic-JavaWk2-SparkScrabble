import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

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

  @Test
  public void addDefinition_addedToList_2() {
    Word myWord = new Word("dog");
    Definition myDef1 = new Definition("an animal that barks");
    Definition myDef2 = new Definition("derogatory slang");
    myWord.addDefinition(myDef1);
    myWord.addDefinition(myDef2);
    assertEquals(2, myWord.getDefinitions().size());
  }

  @Test
  public void all_returnsListAllWords_2() {
    Word myWord1 = new Word("dog");
    Word myWord2 = new Word("cat");
    assertEquals(2, Word.all().size());
  }

  @Test
  public void find_returnsCorrectWord_cat() {
    Word myWord1 = new Word("dog");
    Word myWord2 = new Word("cat");
    assertEquals("cat", Word.find(2).getWord());
  }

  @After
  public void tearDown() {
    Word.clear();
  }
}
