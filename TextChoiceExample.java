import java.awt.*;  
class TextChoiceExample 
{  
    Frame f= new Frame("TextField and choice Example"); 	 
	TextChoiceExample()	
	{
	TextField t1,t2;
    t1=new TextField("hello.");  
    t1.setBounds(50,100, 250,30);  
    t2=new TextField("world");  
    t2.setBounds(50,150, 250,30); 
     Choice c=new Choice();  
     c.setBounds(50,200, 250,30);
     c.add("Item 1");  
     c.add("Item 2");  
     c.add("Item 3");  
     c.add("Item 4");  
     c.add("Item 5");
    f.add(c);	 
    f.add(t1); 
	f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);       
    }  
public static void main(String args[])  
{  
   new TextChoiceExample();  
}  
}  	
 