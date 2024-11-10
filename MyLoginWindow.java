

package com.Assiment;

import java.awt.*;
import java.awt.event.*;

public class MyLoginWindow
{
    TextField name,pass;
    Button b1,b2;
    MyLoginWindow()
    {
    	Frame frame1 = new Frame("Kanyapur Polytechnic Student Portal");
		frame1.setSize(400,400);
		frame1.setLayout(null);
		frame1.setVisible(true);


        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("password:",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(20);
        pass.setEchoChar('#');
        b1=new Button("submit");
        b2=new Button("reset");
        frame1.add(n);
        frame1.add(name);
        frame1.add(p);
        frame1.add(pass);
        frame1.add(b1);
        frame1.add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,120,20);
        pass.setBounds(200,140,120,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);



        frame1.addWindowListener(new WindowAdapter() {

        	 @Override
        	public void windowOpened(WindowEvent e) {
        		// TODO Auto-generated method stub
        		//super.windowOpened(e);
        		//System.out.println("My Window is opened");
        	}
        	@Override
        	public void windowClosing(WindowEvent e) {
        		frame1.dispose();
        	}
        });


        b1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	 String userValue = name.getText();        //get user entered username from the textField1
                 String passValue = pass.getText();        //get user entered pasword from the textField2

                 System.out.println(userValue);
                 System.out.println(passValue);
                 //check whether the credentials are authentic or not
                 if (userValue.equals("Ankit") && passValue.equals("admin@123")) {  //if authentic, navigate user to a new page

                	 Frame frame2 = new Frame();
                	 frame1.dispose();
                     frame2.setTitle("Welcome");
                     frame2.setSize(400, 200);

                     frame2.setVisible(true);

                     //create a welcome label and set it to the new page
                     Label wel_label = new Label("Welcome: "+userValue);
                     frame2.add(wel_label);

                     frame2.addWindowListener(new WindowAdapter() {
                     	@Override
                     	public void windowClosing(WindowEvent e) {
                     		frame2.dispose();
                     	}
                     });
                 }
                 else{
                     //show error message
                     System.out.println("Please enter valid username and password");
                 }
             }
            });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	String blank = "";
            	name.setText(blank);
            	pass.setText(blank);
            }
           });
    }
    public static void main(String args[])
    {
        MyLoginWindow ml = new MyLoginWindow();

    }
}




