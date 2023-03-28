package backend;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.backend.routes.nodes.SiteRequest;

public class SiteRequestTest {

	@Test // SR-001
	public void getAddressTest() {
		SiteRequest myRequest = new SiteRequest("22 Test Lane", "SR-001");
		assertEquals("22 Test Lane", myRequest.getAddress());
	}
	
	@Test // SR-002
	public void getAddressTest2() {
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getAddress());
	}
	
	@Test // SR-003
	public void getNameTest() {
		SiteRequest myRequest = new SiteRequest("SR-003", "Test Site");
		assertEquals("Test Site", myRequest.getName());
	}
	
	@Test // SR-004
	public void getNameTest2() {
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getName());
	}
	
	
	@Test // SR-005
	public void getUUIDTest() {
		String myUUID = "c2d07b43-73f1-4079-ac8d-b4df68b77712";
		
		SiteRequest myRequest = new SiteRequest("SR-005", "Test Address", UUID.fromString(myUUID));
		assertEquals("c2d07b43-73f1-4079-ac8d-b4df68b77712", myRequest.getUuid().toString());
	}
	
	@Test // SR-006
	public void getUUIDTest2() {
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getUuid());
	}
	
	@Test // SR-007
	public void setAddressTest() {
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getAddress());
		myRequest.setAddress("1 test");
		assertEquals("1 test", myRequest.getAddress());
	}
	
	@Test // SR-008
	public void setNameTest() {
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getName());
		myRequest.setName("Test");
		assertEquals("Test", myRequest.getName());
	}
	
	@Test // SR-09
	public void setUUIDTest() {
		String myUUID = "774bc7a1-0ce0-42ee-8276-5818562ad4a1";
		
		SiteRequest myRequest = new SiteRequest();
		assertEquals(null, myRequest.getUuid());
		myRequest.setUuid(UUID.fromString(myUUID));
		assertEquals("774bc7a1-0ce0-42ee-8276-5818562ad4a1", myRequest.getUuid().toString());
	}


}
