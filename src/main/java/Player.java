import java.util.List;
import java.util.ArrayList;

public class Player {
  private String mName;
  private static List<Player> instances = new ArrayList<Player>();

  public Player(String name) {
    mName=name;
    instances.add(this);
  }

  public String getPlayerName() {
    return mName;
  }

  public static List<Player> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
