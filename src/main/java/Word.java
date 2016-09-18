import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Word {
  private String mWord;
  private static List<Word> instances = new ArrayList<Word>();
  private List<Definition> mDefinitions;
  private int mId;

  public Word(String text) {
    mWord=text;
    mDefinitions=new ArrayList<Definition>();
    instances.add(this);
    mId=instances.size();
  }

  public String getWord() {
    return mWord;
  }

  public int getId() {
    return mId;
  }

  public void addDefinition(Definition newDef) {
    mDefinitions.add(newDef);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public static Word find(int id) {
    return instances.get(id-1);
  }

  public static List<Word> all() {
    Collections.sort(instances, (word1, word2) ->  word1.mWord.compareTo(word2.mWord));
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
