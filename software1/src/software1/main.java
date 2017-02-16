package software1;

import software1.controller;
import software1.model;
import software1.view;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
  model MODEL= new model() ;
  view View =new view(MODEL);
  new controller(MODEL,View,0);
  
	
	}

}