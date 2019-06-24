public class G{
  public int[] arrV;
  public Box[] arrB;
  public int counter;
  public int counter2;
    G(){
      counter=0;
      counter2=0;
      arrB=new Box[9];
      arrV=new int[9];
      for(int i=1;i<10;i++)
      arrV[i-1]=i;
    }
    public void addBox(Box b){
      arrB[counter]=b;


      counter++;
    }
    public void update(){
      for(Box b : arrB)
      if(b.getVal()!=0)
      {
        for(int i=0;i<9;i++)
        {
          if(arrV[i]==b.getVal()){arrV[i]=12;
          }
        }
      }
    }

}
