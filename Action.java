import java.awt.*;
	import java.awt.event.*;


	class Action {
	    private static Action d;
	    Action(){
	        Frame f = new Frame();
	        d = new Action(f,"Action Example",true);
	        d.setLayout(new FlowLayout());
	        Button b = new Button("OK");
	        b.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                Action.d.setVisible(false);
	            }
	        });
	        d.add(new Label("Click button to continue"));
	        d.add(b);
	        d.setSize(300,300);
	        d.setVisible(true);
	    }
	    public static void main(String args[]){
	        new Action();
	    }
	}

