import java.util.Arrays;
public class Board{
  int rows,columns,numOfElementsFilled;
  char[][] board=new char[6][8];
  boolean boardFilled=true;


  public Board(int rows,int columns){
    this.rows=rows;
    this.columns=columns;
    this.numOfElementsFilled=0;
    for(int i=0;i<rows;i++)
      Arrays.fill(board[i],' ');
  }
/*Board printing */
  public void show(){
    System.out.println(" Your Board is :");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        System.out.print(" ["+board[i][j]+"] ");
      }
      System.out.println("\n");
    }
  }

  public void set(int a,int b){
      board[a][b]='F';
    }

  public char get(int a,int b){
  return board[a][b];
  }

  public void clear(int a,int b){
    board[a][b]=' ';
  }

  public void dropPiece(char piece, int column){
      if(board[0][column-1]!=' '){
        System.out.println("Column is filled Please select another");
      }
      else{
        for(int i=5;i>=0;i--){
          if(board[i][column-1]==' '){
            board[i][column-1]=piece;
            numOfElementsFilled++;
              if(numOfElementsFilled==rows*columns){
                System.out.println("***Board is filled***");
                boardFilled=false;
                break;
              }
            break;
        }
      }
    }
  }
}
