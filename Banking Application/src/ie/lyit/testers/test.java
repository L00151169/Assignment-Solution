package ie.lyit.testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ie.lyit.bank.*;

public class CurrentTest {
	private Current c1;
	
	@Before
	public void setUp() throws Exception {
		c1=new Current(new Name("Mr","Homer","Simpson"),
				       "Springfield, NYC",5500.00,
				       new Date(1,1,2009), 1000.00);
	}

	@Test
	public void testGetDateOverdraftInvalid() {
		assertEquals(new Date(22,1,2009),c1.getDateOverdraftInvalid(20));
		c1.setDateOpened(new Date(1,1,2009));;
		assertEquals(new Date(1,2,2009),c1.getDateOverdraftInvalid(30));	
		aasertEquals("The value must be something", "something", employee.getSomething())
	}
}