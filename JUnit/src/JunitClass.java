import static org.junit.Assert.*;

import org.junit.Test;

public class JunitClass {

	@Test
	public void test() {
		String str= new String("Hello");
		String str1=new String("hello");
		String str2=null;
		String str3="Hello";
		String str4="Hello";
		int val1=5,val2=6;
		String[] expectedArray= {"One","Two","Three"};
		String[]resultArray= {"One","Two","Three"};
		//assertEquals(str3,str4);
		//assertNotEquals(str4,str3);
		//assertTrue(val1>val2);
		//assertTrue(val1<val2);
		//assertFalse(val1>val2);
		//assertFalse(val1<val2);
		//assertNull(str1);
		//assertNotNull(str4);
		assertSame(str,str);
		//assertArrayEquals(expectedArray,resultArray);
	}

}
