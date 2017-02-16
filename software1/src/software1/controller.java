package software1;

import java.awt.Button;
import software1.controller;
import software1.model;
import software1.view;


import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class controller implements java.awt.event.ActionListener {

	model my_model ;
	view my_view ;
      int x;
	
 controller(model m ,view v,int d){
		my_model =m ;
		my_view =v ;
	      x=d;

	  	}
 

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		  
		 if(my_view.getText1().isEmpty()||my_view.getText2().isEmpty())
		  {
			  
			  JOptionPane.showMessageDialog(null, "please fill all data");
		  }
		 else{
			  
		 Double a= Double.parseDouble(my_view.getText1());
		  Double b= Double.parseDouble(my_view.getText2());
			
		// TODO Auto-generated method stub
		 try
		  {
		   //retrieve the input from View
			
			  if(x==1){
		 
				  Double result =my_model.add(a,b);
		   
		   //display result in View(UI)
		   my_view.setText3(""+result);
			}
			else if(x==2)
			{
				Double result=my_model.sub(a,b);
				   
				   //display result in View(UI)
				   my_view.setText3(""+result);
			}
			else if(x==3)
			{
				Double result=my_model.Mull(a,b);
				 
				   my_view.setText3(""+result);
			}
			else if(x==4)
			{
				Double result=my_model.Mod(a,b);
				   
				   //display result in View(UI)
				   my_view.setText3(""+result);
			}
			else if(x==5)
			{
				Double result=my_model.div(a,b);
				   
				   //display result in View(UI)
				   my_view.setText3(""+result);
			}
			else if(x==6){
				
				my_view.setText1("");
				my_view.setText2("");
				my_view.setText3("");
			}
			 }
		   
	
	
		  catch(Exception ee)
		  {
		   ee.printStackTrace();
		  }  
	}
	}
}
	
	
	
	


