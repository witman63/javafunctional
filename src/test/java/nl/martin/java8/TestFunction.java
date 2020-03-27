package nl.martin.java8;





import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.martin.function._Function;



public class TestFunction {

	@Test
	public void test() {
		_Function f = new _Function();
		int nx=_Function.incrementFunction.apply(3);
		assertEquals(4, nx);
	}
	
//	@Test	
//	public void test2() {
//		_Function fu = new _Function();
//		  int x= fu.increment(5);
//		  assertEquals(6, x);
//	}

}
