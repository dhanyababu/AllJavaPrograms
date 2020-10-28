public class Checker{
  public static int fourSymbolCount,winCount;
  static boolean win=false;

  /*checking rows,and if a player gets four in a row then that player will win*/
  public  static void checkRows (char symbol, Board checkBoard){
    for(int i=0;i<checkBoard.rows;i++){
      for(int j=0;j<checkBoard.columns-3;j++){
        fourSymbolCount=0;
        winCount=0;
        int k=j;
  /*In while loop checking four adjacent row elements are same or not*/
        while(fourSymbolCount<4 && k<8){
          if(checkBoard.board[i][k]==symbol){
              winCount++;
              if(winCount==4){
                checkBoard.boardFilled=false;
              win=true;
              break;
            }
          }
          fourSymbolCount++;
          k++;
        }
      }
    }
  }
/*checking columns,and if a player gets four in a column then that player will win*/
  public  static void checkColumns(char symbol, Board checkBoard){
    for(int j=0;j<checkBoard.columns;j++){
      for(int i=0;i<checkBoard.rows-3;i++){
        fourSymbolCount=0;
        winCount=0;
         int k=i;
/*In while loop checking four adjacent column elements are same or not*/
        while(fourSymbolCount<4 && k<6){
          if(checkBoard.board[k][j]==symbol){
            winCount++;
            if(winCount==4){
              checkBoard.boardFilled=false;
              win=true;
              break;
            }
          }
          fourSymbolCount++;
          k++;
        }
      }
    }
  }
/*checking diagonal towards right,and if a player gets four in a diagonal that player will win*/
  public  static void checkDiagonalRight(char symbol, Board checkBoard){
    int n=0;
      for(int j=0;j<checkBoard.columns-3;j++){
        for(int i=0;i<checkBoard.rows-3;i++){
          fourSymbolCount=0;
          winCount=0;
          int k=i;
  /*In while loop checking four adjacent diagonal elements are same or not*/
          while(fourSymbolCount<4 && (k+n)<8){
            if(checkBoard.board[k][k+n]==symbol){
                winCount++;
                if(winCount==4){
                    checkBoard.boardFilled=false;
                    win=true;
                    break;
                }
            }
            fourSymbolCount++;
            k++;
          }
/*Checking diagonal below major right diagonal*/
          if(i==0 && j<checkBoard.columns-5 && j!=0){
            int m=j;
            for(int z=j;z<3;z++){
              int newFourSymbolCount=0;
              int newWinCount=0;
              int p=z;
              while(newFourSymbolCount<4 && p<6){
                if(checkBoard.board[p][p-m]==symbol){
                  newWinCount++;
                  if(newWinCount==4){
                    checkBoard.boardFilled=false;
                    win=true;
                    break;
                  }
                }
              newFourSymbolCount++;
              p++;
            }
          }
        }
      }
      n++;
    }
  }
/*checking diagonal towards left,and if a player gets four in a diagonal that player will win*/
  public static void checkDiagonalLeft(char symbol, Board checkBoard){
    int n=7;
    for(int j=7;j>checkBoard.columns-6;j--){
        for(int i=0;i<checkBoard.rows-3;i++){
          fourSymbolCount=0;
          winCount=0;
          int k=i;
/*In while loop checking four adjacent diagonal elements are same or not*/
          while(fourSymbolCount<4 && (n-k)>=0){
            if(checkBoard.board[k][n-k]==symbol){
                winCount++;
                if(winCount==4){
                    checkBoard.boardFilled=false;
                    win=true;
                    break;
                }
            }
            fourSymbolCount++;
            k++;
          }
/*Checking diagonal below major left diagonal*/
          if(j==7 && i<checkBoard.rows-3 && i!=0){
            int m=j;
            for(int z=i;z<3;z++){
            int newFourSymbolCount=0;
            int newWinCount=0;
            int p=z;
            while(newFourSymbolCount<4 && p<6 && m>2){
              if(checkBoard.board[p][m]==symbol){
                newWinCount++;
                if(newWinCount==4){
                  checkBoard.boardFilled=false;
                  win=true;
                  break;
                }
              }
              newFourSymbolCount++;
              p++;
              m--;
            }
            m=j-1;
          }
        }
      }
      n--;
    }
  }
}
