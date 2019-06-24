class Try{

public static void main(String args[])
{
  Box b=new Box(10,10);
  G[] g=new G[9];
  System.out.println(g[0].counter);
  g[0].addBox(b);
}
}
