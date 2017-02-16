package software1;

import java.awt.BorderLayout;

import software1.controller;
import software1.model;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

 class view extends JFrame implements java.util.Observer {
	 private static final String []names={"south" ,"east","west"};
		private BorderLayout layout;
		 JButton [] buttons;
		 private JLabel[] Labels;
		  private JTextField []TextFileds;
		 private String s="" ;
		   private JPanel Keys;
		   private JPanel Keys1;
		   private static final String [] names2 ={"The first number","The second number","The result"};
		  JButton [] buttons1;
		  private static final String [] names1={"Add","Sub","Mull","Mod","Div" ,"Delete"};
		  private static final String [] names3={"Textfileld1","tevtfiled2","textfiled3","textfiled4"};
	  
		  
view(model m){
	System.out.println("view()");
	
	layout =new BorderLayout(5,5);
    setLayout( layout);
    buttons=new JButton[names.length];
    for(int i=0;i<names.length;i++){
 	   buttons[i]=new JButton(names[i]);
    }
	
    
	
    add(buttons[1],BorderLayout.CENTER);
    add(buttons[2],BorderLayout.SOUTH);
    Keys =new JPanel();
  TextFileds  =new JTextField [names3.length];
    Keys.setLayout(new GridLayout(4,2,5,5));
    Labels =new JLabel [names2.length];
    for(int u=0;u<names2.length;u++){
 	   Labels   [u]=new JLabel(names2[u]);
    TextFileds[u]  = new JTextField (10);
 	 Keys.add( Labels[u]);
 	 Keys.add( TextFileds[u]);
 	 
 	Keys1=new JPanel();
    Keys1.setLayout(new FlowLayout());
    buttons1=new JButton[names1.length];
   
   for(int r=0;r<names1.length;r++){
  	  buttons1[r]=new JButton(names1[r]);
  	Keys1.add(buttons1[r]);
  	
   }
  buttons1[0].addActionListener(new controller(m,this,1));
 buttons1[1].addActionListener(new controller(m,this,2));
  buttons1[2].addActionListener(new controller(m,this,3));
   buttons1[3].addActionListener(new controller(m,this,4));
   buttons1[4].addActionListener(new controller(m,this,5));
   buttons1[5].addActionListener(new controller(m,this,6));
   


   add(Keys1,BorderLayout.SOUTH);
     add ( Keys,BorderLayout.CENTER);
   

	
     setVisible(true);
 	setSize(500,250);

	
	
}
    }//end of view
    public static class CloseListener extends WindowAdapter {
    	public void windowClosing(WindowEvent e) {
    		e.getWindow().setVisible(false);
    	
    		System.exit(0);
    	} //windowClosing()
    } //CloseListener

    
	@Override
	//its called ffro model
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	
	} 
	public String getText1()
	{
		s= TextFileds[0].getText();
		return s; 
	}
	public String getText2()
	{
		s= TextFileds[1].getText();
		return s; 
	}
	public String getText3()
	{
		s= TextFileds[2].getText();
		return s; 
	}
	public void setText1(String s1)
	{    s=s1;
		TextFileds[0].setText(s1);	
	}
	public void setText2(String s2)
	{ s=s2;
		TextFileds[1].setText(s2);	
	}
	public void setText3(String s3)
	{ s=s3;
		TextFileds[2].setText(s3);	
	}
	

	
	
	
	
		
		
	//to add the reference to the controller from view
		
}


