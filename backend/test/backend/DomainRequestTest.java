package backend;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.credersi_vend.backend.routes.nodes.DomainRequest;

public class DomainRequestTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test // DR-001
	public void getEnvironmentTest() {
		DomainRequest myRequest = new DomainRequest("1", "DR-001");
		assertEquals("1", myRequest.getEnvironment());
	}
	
	@Test // DR-002
	public void getEnvironmentTest2() {
		DomainRequest myRequest = new DomainRequest();
		assertEquals(null, myRequest.getEnvironment());
	}
	
	@Test // DR-003
	public void getNameTest() {
		DomainRequest myRequest = new DomainRequest("1", "TestDomain");
		assertEquals("TestDomain", myRequest.getName());
	}
	
	@Test // DR-004
	public void getNameTest2() {
		DomainRequest myRequest = new DomainRequest();
		assertEquals(null, myRequest.getName());
	}
	
	@Test // DR-005
	public void setEnvironmentTest() {
		DomainRequest myRequest = new DomainRequest();
		assertEquals(null, myRequest.getEnvironment());
		myRequest.setEnvironment("5");
		
		assertEquals("5", myRequest.getEnvironment());
	}
	
//	@Test(expected = Exception.class) // DR-006
//	public void setEnvironmentTest2() throws Exception {
//		DomainRequest myRequest = new DomainRequest();
//		assertEquals(null, myRequest.getEnvironment());
//		
////		try {
////			myRequest.setEnvironment(5);
////		} catch (Exception e){
////			System.out.println(e.getMessage());
////		}
//		
//		myRequest.setEnvironment(5);
//		assertEquals(5, Integer.parseInt(myRequest.getEnvironment()));
//		
//		
//		
//		//assertThrows(, myRequest.setEnvironment(5));
//	
//
//		// try to set environment to 5
//		// throw
//		// try getting environment to check it
//		
//	}
	
	@Test // DR-007
	public void setNameTest() {
		DomainRequest myRequest = new DomainRequest();
		assertEquals(null, myRequest.getEnvironment());
		myRequest.setName("Test");
		assertEquals("Test", myRequest.getName());
	}
	
	// DR-008

}
