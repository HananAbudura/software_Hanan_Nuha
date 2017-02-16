package software1;


import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class Tests {
	model m ;
	view unit ;
	@Before
	public void setUp() throws Exception {
		m = new model();
		 unit =new view(m) ;
	}

	@org.junit.Test
	public void setText1test() {
		unit.setText1("1");
	}
	
	@Test
	public void Addt() {
	double result = m.add(3.5,.5);
	assertEquals(4,result,.0001);
	}
	@Test
	public void Subtest(){
		
		
		double result = m.sub(5.3,2.0);
		assertEquals(3.3,result,.0001);
		
		
		
	}
	
	@Test
	public void mulltest(){
		
		
		double result = m.Mull(5.5,9.2);
		assertEquals(50.6,result,.0001);
		
		
		
	}
@Test
	public void Divtest(){
		
		
		double result =m.div(5.3,2.0);
		assertEquals(2.65,result,0001);
		
		
	}
	@Test(expected= ArithmeticException.class)
	public void DivbyZerotest(){
		
		m.div(5.0,0.0);
		
	    	}

	@Test
	public void Modtest(){
		double result = m.Mod(5.3,2.0);
         assertEquals(1.29,result,0001);}
}



