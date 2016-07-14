package course.javafortesters;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySecondTest {
	
	@Test
	public void canSubtractTwoMinusTwo(){
	 int answer = 2-2;
	 assertEquals("2-2=0", 0, answer );
	}
	
	@Test
	public void canDivideFourbyTwo(){
	 int answer = 4/2;
	 assertEquals("4/2=2", 2, answer );
	}
	
	@Test
	public void canMultiplyTwobyTwo(){
	 int answer = 2*2;
	 assertEquals("2*2=4", 4, answer );
	}
	
}