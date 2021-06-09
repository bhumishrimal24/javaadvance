import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.event.*;

public class LookFeel extends JFrame implements ItemListener
{
JButton b;
JCheckBox cb;
JTextField t;
JRadioButton me,mo,wi;
ButtonGroup bg;
Container c;
LookFeel()
{
c=this.getContentPane();
c.setLayout(null);

b=new JButton("Button");
cb=new JCheckBox("CheckBox");
t=new JTextField("TEXT",20);

me=new JRadioButton("Metal");
mo=new JRadioButton("Motif");
wi=new JRadioButton("Windows");

bg=new ButtonGroup();
bg.add(me);
bg.add(mo);
bg.add(wi);

b.setBounds(100,50,75,40);
cb.setBounds(100,100,100,40);
t.setBounds(100,150,100,40);
me.setBounds(50,250,100,30);
mo.setBounds(150,250,100,30);
wi.setBounds(250,250,100,30);

c.add(b);
c.add(cb);
c.add(t);
c.add(me);
c.add(mo);
c.add(wi);

me.addItemListener(this);
mo.addItemListener(this);
wi.addItemListener(this);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void itemStateChanged(ItemEvent IE)
{
try{
if(me.getModel().isSelected())
UIManager.setLookAndFeel("Javax.swing.plaf.metal.MetalLookAndFeel");
if(mo.getModel().isSelected())
UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
if(wi.getModel().isSelected())
UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindpwsLookAndFeel");

SwingUtilities.updateComponentTreeUI(c);

}catch(Exception e){}

}
public static void main(String[] args) 
{
LookFeel lf=new LookFeel();
lf.setTitle("Look and Feel");
lf.setSize(400,400);
lf.setVisible(true);
}
}
