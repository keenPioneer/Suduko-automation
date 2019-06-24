import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Do{
        JFrame fr;
        Box[][] B;
        Button bt=new Button("ck");
       Button bt2=new Button("reset");
       G[] g;
        Do()
        {B=new Box[9][9];
          g=new G[9];
          for(int i=0;i<9;i++)
          g[i]=new G();
          System.out.print("hello");
        bt.setBounds(10,110,50,50);
        bt2.setBounds(10,60,50,50);

        bt.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){chk();}
        });
        bt2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){reset();}
        });
        bt.setVisible(true);
        bt2.setVisible(true);

        fr=new JFrame();


        int x=50; int y=50;
        for(int i=0;i<9;i++)
        {
          x+=55;
          for(int j=0;j<9;j++)
          {B[i][j]=new Box(x,y);
            y+=55;
         //System.out.println(B[i][j].btn);
       }y=50; }//setting up btns

      /*  for(int i=0;i<9;i++)
          { for(int j=0;j<9;j++)
            {
            } }*/


            int unid=1;int counteree=0;
            for(int i=0;i<9;i++)
                { for(int j=0;j<9;j++,unid++)
                  {
                    fr.add(B[i][j].btn);
                    B[j][i].uniqueId=unid;
                  } }//adding btn to fr
                  fr.add(bt2);
                  fr.add(bt);
                  {
                    fr.setLayout(null);
                    fr.setSize(700,600);
                    fr.setVisible(true);
                  }
                  //for(int i=0;i<9;i++){
                    {int it=0;
                    int I;
                    int J=0;
                    int K=0;
                    int M;
                    for(M=1;M<=3;M++){
                    for(I=1;I<=3;I++,it++){
                      switch(M){
                      case 1:J=0;break;
                      case 2:J=3;break;
                      case 3:J=6;break;
                    }
                    for(;J<M*3;J++){
                      switch(I){
                      case 1:K=0;break;
                      case 2:K=3;break;
                      case 3:K=6;break;
                    }
                    for(;K<I*3;K++){
                    //  System.out.println(J+" "+K);
                    //  System.out.println("i is "+i);
                    //  System.out.println(g[i].counter);
                    g[it].addBox(B[K][J]);
                    B[K][J].setG(it);
                    //System.out.println(it);
                    counteree++;

                    }
                  }//System.out.println();
                    }
                    }
                    }


          //  }

//System.out.println("COunteree is "+counteree);
for(int i=0;i<9;i++){for(int j=0;j<9;j++){
System.out.print(B[j][i].uniqueId+" ");
}
System.out.println();
}
for(int i=0;i<9;i++){for(int j=0;j<9;j++){
System.out.print(B[j][i].gno+" ");
}
System.out.println();
}
}
public void chk(){
  for(int i=0;i<9;i++){
    g[i].update();
  }
System.out.println(g[8].arrV[5]);
  int count=0;
  int cr=0;
  int v=0;
  int m=0;
int n=0;
int I=0;
  for(int i=0;i<9;i++)
      { for(int j=0;j<9;j++)
        {
          if(B[j][i].val==0)
          {
          int  gno  =  B[j][i].gno;  // System.out.println("gno is "+gno);
                      {

                        I=0;
                         //changing this to limited values
                    //      for (v=g[gno].arrV[0];    I<9;      I++,    v=g[gno].arrV[I])
                          while (I<9)  {
                                v=g[gno].arrV[I];
                                I++;

                              // System.out.println("uniqe id -"+B[j][i].uniqueId);
                        if(v!=12){
                          System.out.println("putting "+v+" in "+j+" "+i);
                        for( m=0;m<9;m++)if(B[j][m].val==v){m=11;System.out.println("m"+m);
                        }
                        for( n=0;n<9;n++)if(B[n][i].val==v){n=11;System.out.println("n"+n);
                                                            }


                        if(n==9&&m==9){count++;cr=v;}}                          //System.out.println("here gno and v and i are "+gno+" "+v+" "+I);
                      }if(count==1){B[j][i].setVal(cr);System.out.println("Value satisfied at "+j+" "+i+" >"+v);
                                    }
                      count=0;
                                                                    }
      }
      }



}}
public void reset(){
  for(int i=0;i<9;i++)
        { for(int j=0;j<9;j++)
          {B[j][i].setVal(0);}}
}
}
