import java.awt.*;
import javax.swing.*;

public class FlowLyt
{
JFrame f;
FlowLyt()
{
f=new JFrame();

JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("444444444");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("777777777");
JButton b8=new JButton("8");
JButton b9=new JButton("9");

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);

f.setLayout(new FlowLayout(FlowLayout.LEFT));

f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args)
{
new FlowLyt();
}
}
