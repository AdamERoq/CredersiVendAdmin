package backend;

import static org.junit.Assert.*;

// route.db.pw=7vXNfKSO85ORF4_5DYHQZCl1ioE32rkJwE6zzjNUvH8 // Component Test password

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.backend.routes.nodes.CustomerRequest;

public class CustomerRequestTest {

	@Test // CR-001	
	public void getNameTest() {
		CustomerRequest myRequest = new CustomerRequest("TestCustomer");
		assertEquals("TestCustomer", myRequest.getName());
	}
	
	
	
	@Test // CR-002	
	public void getNameTest2() {
		CustomerRequest myRequest = new CustomerRequest();
		assertEquals(null, myRequest.getName());
	}
	
	@Test // CR-003
	public void getUUIDTest() {
		String myUUID = "152574f5-675c-4592-b12b-da598abd5f5a";
		
		CustomerRequest myRequest = new CustomerRequest("CR-003", UUID.fromString(myUUID));
		assertEquals("152574f5-675c-4592-b12b-da598abd5f5a", myRequest.getUuid().toString());
	}
	
	@Test // CR-004
	public void getUUIDTest2() {
		CustomerRequest myRequest = new CustomerRequest();
		assertEquals(null, myRequest.getUuid());
	}
	
	@Test // CR-005
	public void setNameTest() {
		CustomerRequest myRequest = new CustomerRequest();
		assertEquals(null, myRequest.getName());
		myRequest.setName("Test");
		assertEquals("Test", myRequest.getName());
	}
	
	@Test // CR-006
	public void setUUIDTest() {
		String myUUID = "774bc7a1-0ce0-42ee-8276-5818562ad4a3";
		
		CustomerRequest myRequest = new CustomerRequest();
		assertEquals(null, myRequest.getUuid());
		myRequest.setUuid(UUID.fromString(myUUID));
		assertEquals("774bc7a1-0ce0-42ee-8276-5818562ad4a3", myRequest.getUuid().toString());
	}
}
