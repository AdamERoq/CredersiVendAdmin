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
	
	@Test // DR-006
	public void setNameTest() {
		DomainRequest myRequest = new DomainRequest();
		assertEquals(null, myRequest.getEnvironment());
		myRequest.setName("Test");
		assertEquals("Test", myRequest.getName());
	}

}
