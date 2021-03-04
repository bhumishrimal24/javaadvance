import java.awt.*;  
class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menubar Example");  
         MenuBar ab=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("file 1");  
         MenuItem i2=new MenuItem("file 2");  
         MenuItem i3=new MenuItem("file 3");  
         MenuItem i4=new MenuItem("file 4");  
         MenuItem i5=new MenuItem("file 5");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         ab.add(menu);  
         f.setMenuBar(ab);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  