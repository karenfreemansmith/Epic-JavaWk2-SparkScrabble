import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private static List<Word> instances = new ArrayList<Word>();
  private List<Definition> mDefinitions;

  public Word(String text) {
    mWord=text;
    mDefinitions=new ArrayList<Definition>();
    instances.add(this);
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

  public static List<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
