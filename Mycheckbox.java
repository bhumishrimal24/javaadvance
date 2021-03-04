import java.awt.*;  
public class Mycheckbox  
{  
     Mycheckbox(){  
       Frame a= new Frame("Checkbox Example");  
        Checkbox checkbox1 = new Checkbox("CSE");  
        checkbox1.setBounds(200,200, 80,80);  
        Checkbox checkbox2 = new Checkbox("IT", true);  
        checkbox2.setBounds(200,250, 80,80);  
        a.add(checkbox1);  
        a.add(checkbox2); 		
        a.setSize(600,600);  
        a.setLayout(null);  
        a.setVisible(true);  
     }  
public static void main(String args[])  
{  
    new Mycheckbox();  
}  
}  