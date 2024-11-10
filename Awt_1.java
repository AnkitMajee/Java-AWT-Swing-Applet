package awtTutorial;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//public class Awt_1 extends Frame {
public class Awt_1 {
	
	public Awt_1() {
		Frame frame1 = new Frame("My First GUI");
		frame1.setSize(800,1000);
		frame1.setLayout(null);
		frame1.setVisible(true);
		
		Button button1 = new Button("Click Me");
		button1.setBounds(20,40,80,30); //x axis,y axis,height,width
		button1.setBackground(Color.red);
		button1.setForeground(Color.blue);
		frame1.add(button1);
		
		Label label1 = new Label("Hello Students");
		label1.setBounds(20, 90, 150, 30);
		frame1.add(label1);
		
		TextField textfield1 = new TextField();
		textfield1.setBounds(20, 120, 150, 30);
		frame1.add(textfield1);
		
		
		Choice c = new Choice();   
		  
        // setting the bounds of choice menu   
        c.setBounds(20, 170, 75, 75);    
  
        // adding items to the choice menu  
        c.add("Item 1");    
        c.add("Item 2");    
        c.add("Item 3");    
        c.add("Item 4");    
        c.add("Item 5");    
  
        // adding choice menu to frame  
        frame1.add(c);    
		
		//Anonymous Classes with argument
		
		frame1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowClosing(e);
				frame1.dispose();
			}
		});
	}
	public static void main(String[] args) {
		//new Awt_1();
		Awt_1 obj1 = new Awt_1();
	}
}
