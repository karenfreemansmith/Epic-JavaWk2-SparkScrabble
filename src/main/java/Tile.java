public class Tile {
  private int mValue;
  private char mMark;
  private boolean mUsed;

  public Tile(char mark, int value) {
    mValue=value;
    mMark=mark;
    mUsed=false;
  }

  public int getValue() {
    return mValue;
  }

  public char getMark() {
    return mMark;
  }

  public boolean getStatus() {
    return mUsed;
  }
}
