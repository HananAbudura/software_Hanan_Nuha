package software1;

import java.awt.Button;

import software1.controller;

import software1.view;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;

public class model extends java.util.Observable {
	
model(){
	
}

public Double add(Double x,Double y)
{
// int a=Integer.parseInt(x);
 //int b=Integer.parseInt(y);
 Double result=x+y;
 return (result);
}
	
public Double sub(Double x,Double y)
{

	Double result=x-y;
 return (result);
}
public double div(double x,double y)
{

	double result=x/y;
 return (result);
}
public Double Mull(Double x,Double y)
{

Double result=x*y;
 return (result);
}
public Double Mod(Double x,Double y)
{

	Double result=x%y;
 return (result);
}


}


