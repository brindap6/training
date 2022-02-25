package calcu;

import static org.junit.Assert.*;

import org.junit.Test;

import CalcuNew.Calcu;

public class CalcuJunit {

	@Test
	public void addtest() {
		Calcu aa = new Calcu();
		int output = aa.add(6, 4);
		assertEquals(10, output);
	}
	@Test
	public void multitest() {
			Calcu aa = new Calcu();
			int output = aa.multi(6, 4);
			assertEquals(24, output);
	
	}
	
	@Test
	public void Divtest() {
			Calcu aa = new Calcu();
			int output = aa.Div(6, 4);
			assertEquals(1,output);
	
	}
	
	@Test
	public void subtest() {
			Calcu aa = new Calcu();
			int result = aa.sub(6, 4);
			assertEquals(2, result);
	
	}
}


