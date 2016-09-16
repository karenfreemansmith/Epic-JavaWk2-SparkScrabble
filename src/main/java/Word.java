import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private List<Definition> mDefinitions;

  public Word(String text) {
    mWord=text;
    mDefinitions=new ArrayList<Definition>();
  }

  public String getWord() {
    return mWord;
  }

  public void addDefinition(Definition newDef) {
    mDefinitions.add(newDef);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }
}
