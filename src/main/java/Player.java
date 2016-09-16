import java.util.List;
import java.util.ArrayList;

public class Player {
  private String mName;
  private static List<Player> instances = new ArrayList<Player>();
  private int mId;

  public Player(String name) {
    mName=name;
    instances.add(this);
    mId=instances.size();
  }

  public String getPlayerName() {
    return mName;
  }

  public int getPlayerId() {
    return mId;
  }

  public static Player find(int id) {
    return instances.get(id-1);
  }

  public static List<Player> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
