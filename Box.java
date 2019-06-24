import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Box{
  public JButton btn;
  public int val;
  public int row;
  public int col;
  public int gno;
  public int uniqueId;

  Box(int x,int y){
    val=0;
    btn=new JButton();
    btn.setBounds(x,y,50,50);
    btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){System.out.println(uniqueId);}
    });
    btn.addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent ke){
        val=Character.getNumericValue(ke.getKeyChar());
        reset();
      }
    });
    btn.setVisible(true);
  }
  public void setG(int g){gno=g;}
  public void setVal(int val){
    this.val=val;
    reset();
  }
  public int getVal(){
    return val;
  }
  public int uniqueId(){
    return uniqueId();
  }
  public int getR(){
    return row;
  }
  public int getC(){
    return col;
  }
  public void setUniqueId(int ui){
    uniqueId=ui;
  }
  public void reset(){
    if(val==0)btn.setLabel(null);
  else
    btn.setLabel(Integer.toString(val));
  }
}
