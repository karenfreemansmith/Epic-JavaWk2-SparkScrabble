import java.util.List;
import java.util.ArrayList;

public class Game {
  private Square mSquares[][] = new Square[15][15];
  private Tile mTiles[] = new Tile[100];
  private List<Player> mPlayers;
  private boolean inProgress;

  public Game() {
    inProgress = false;
    //setup squares on board
    for(int i=0; i<=14; i++) {
      for(int j=0; j<=14; j++) {
        mSquares[i][j] = new Square(i,j);
      }
    }
    //set up tiles
    int t = 0; //tracks total tiles
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile(' ', 0);
      t++;
    }
    for(int i=1; i<=12; i++) {
      mTiles[t] = new Tile('E', 1);
      t++;
    }
    for(int i=1; i<=9; i++) {
      mTiles[t] = new Tile('A', 1);
      t++;
    }
    for(int i=1; i<=9; i++) {
      mTiles[t] = new Tile('I', 1);
      t++;
    }
    for(int i=1; i<=8; i++) {
      mTiles[t] = new Tile('O', 1);
      t++;
    }
    for(int i=1; i<=6; i++) {
      mTiles[t] = new Tile('N', 1);
      t++;
    }
    for(int i=1; i<=6; i++) {
      mTiles[t] = new Tile('R', 1);
      t++;
    }
    for(int i=1; i<=6; i++) {
      mTiles[t] = new Tile('T', 1);
      t++;
    }
    for(int i=1; i<=4; i++) {
      mTiles[t] = new Tile('L', 1);
      t++;
    }
    for(int i=1; i<=4; i++) {
      mTiles[t] = new Tile('S', 1);
      t++;
    }
    for(int i=1; i<=4; i++) {
      mTiles[t] = new Tile('U', 1);
      t++;
    }
    for(int i=1; i<=4; i++) {
      mTiles[t] = new Tile('D', 2);
      t++;
    }
    for(int i=1; i<=3; i++) {
      mTiles[t] = new Tile('G', 2);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('B', 3);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('C', 3);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('M', 3);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('P', 3);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('F', 4);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('H', 4);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('V', 4);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('W', 4);
      t++;
    }
    for(int i=1; i<=2; i++) {
      mTiles[t] = new Tile('Y', 4);
      t++;
    }
    mTiles[t] = new Tile('K', 5);
    t++;
    mTiles[t] = new Tile('J', 8);
    t++;
    mTiles[t] = new Tile('X', 8);
    t++;
    mTiles[t] = new Tile('Q', 10);
    t++;
    mTiles[t] = new Tile('Z', 10);
    t++;
  }

  public Tile getTile(int id) {
    return mTiles[id-1];
  }

  public Square getSquare(int row, int col) {
    return mSquares[row][col];
  }

  public Square[][] getSquares() {
    return mSquares;
  }

  public Tile[] getTiles() {
    return mTiles;
  }

  public void addPlayers(List<Player> players) {
    mPlayers = players;
  }

  public List<Player> getPlayers() {
    return mPlayers;
  }

  public void startGame() {
    inProgress=true;
  }

  public boolean isStarted() {
    return inProgress;
  }
}
