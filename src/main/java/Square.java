public class Square {
  private int mPremium;
  private int mRow;
  private int mCol;
  private Tile mTile;

  public Square(int row, int col) {
    mRow=row;
    mCol=col;
    if(
      (mRow==0&&mCol==0)||(mRow==0&&mCol==7)||(mRow==0&&mCol==14)||
      (mRow==7&&mCol==0)||(mRow==7&&mCol==14)||
      (mRow==14&&mCol==0)||(mRow==14&&mCol==7)||(mRow==14&&mCol==14)
    ) {
      mPremium=4; //triple word square
    } else if(
    (mRow==1&&mCol==1)||(mRow==1&&mCol==13)||
    (mRow==2&&mCol==2)||(mRow==2&&mCol==12)||
    (mRow==3&&mCol==3)||(mRow==3&&mCol==11)||
    (mRow==4&&mCol==4)||(mRow==4&&mCol==10)||
    (mRow==7&&mCol==7)||
    (mRow==10&&mCol==4)||(mRow==10&&mCol==10)||
    (mRow==11&&mCol==3)||(mRow==11&&mCol==11)||
    (mRow==12&&mCol==2)||(mRow==12&&mCol==12)||
    (mRow==13&&mCol==1)||(mRow==13&&mCol==13)
    ) {
      mPremium=3; //double word square
    } else if(
    (mRow==0&&mCol==3)||(mRow==0&&mCol==11)||
    (mRow==2&&mCol==6)||(mRow==2&&mCol==8)||
    (mRow==3&&mCol==0)||(mRow==3&&mCol==7)||(mRow==3&&mCol==14)||
    (mRow==6&&mCol==2)||(mRow==6&&mCol==6)||(mRow==6&&mCol==8)||(mRow==6&&mCol==12)||
    (mRow==7&&mCol==3)||(mRow==7&&mCol==11)||
    (mRow==8&&mCol==2)||(mRow==8&&mCol==7)||(mRow==8&&mCol==8)||(mRow==8&&mCol==12)||
    (mRow==11&&mCol==0)||(mRow==11&&mCol==7)||(mRow==11&&mCol==14)||
    (mRow==12&&mCol==6)||(mRow==12&&mCol==8)||
    (mRow==14&&mCol==3)||(mRow==14&&mCol==11)
    ) {
      mPremium=2; //triple letter square
    } else if(
    (mRow==1&&mCol==5)||(mRow==1&&mCol==9)||
    (mRow==5&&mCol==1)||(mRow==5&&mCol==5)||(mRow==5&&mCol==9)||(mRow==5&&mCol==13)||
    (mRow==9&&mCol==1)||(mRow==9&&mCol==5)||(mRow==9&&mCol==9)||(mRow==9&&mCol==13)||
    (mRow==13&&mCol==5)||(mRow==13&&mCol==9)
    ) {
      mPremium=1; //double letter square
    } else {
      mPremium=0; //no special bonuses
    }
  }

  public int getPremium() {
    return mPremium;
  }

  public void setTile(Tile t) {
    mTile=t;
  }

  public Tile getTile() {
    return mTile;
  }

}
