public class Create{
  public void Create(){
    Box[][] B=new Box[9][9];
    for(int i=0;i<9;i++)
    {
      for(int j=0;j<9;j++)
      {B[i][j]=new Box();
     System.out.println(B[i][j].btn);
      }
    }
  }
}
