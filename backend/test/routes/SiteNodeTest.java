package routes;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.routes.nodes.DomainNode;
import com.credersi_vend.routes.nodes.SiteNode;

public class SiteNodeTest {

	@Test // SN-001
	public void getLabelTest() {
		SiteNode myNode = new SiteNode();
		assertEquals("Site", myNode.getLabel());
	}
	
	@Test // SN-002
	public void getAddressTest() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
	}
	
	@Test // SN-003
	public void getAddressTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
		myNode.address("testAddress");
		assertEquals("testAddress", myNode.getAddress());
	}
	
	@Test // SN-004
	public void getOriginTest() {
		SiteNode myNode = new SiteNode();
		assertEquals(false, myNode.getOrigin());
	}
	
	@Test // SN-005
	public void getOriginTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals(false, myNode.getOrigin());
		myNode.origin();
		assertEquals(true, myNode.getOrigin());
	}
	
	@Test // SN-006
	public void setAddressTest() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
		myNode.address("testAddress");
		assertEquals("testAddress", myNode.getAddress());
	}

	@Test // SN-007
	public void setAddressTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
		myNode.address("testAddress");
		assertEquals("testAddress", myNode.getAddress());
		myNode.address("newAddress");
		assertEquals("newAddress", myNode.getAddress());
	}
	
	@Test // SN-008
	public void setNameTest() {
		SiteNode myNode = new SiteNode();
		assertEquals("", myNode.getName());
		myNode.name("testName");
		assertEquals("testName", myNode.getName());
	}

	@Test // SN-009
	public void setNameTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals("", myNode.getName());
		myNode.name("testName");
		assertEquals("testName", myNode.getName());
		myNode.name("newName");
		assertEquals("newName", myNode.getName());
	}

	@Test // SN-010
	public void setOriginTest() {
		SiteNode myNode = new SiteNode();
		assertEquals(false, myNode.getOrigin());
		myNode.origin();
		assertEquals(true, myNode.getOrigin());
	}
	
	@Test // SN-011
	public void setOriginTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals(false, myNode.getOrigin());
		myNode.origin();
		assertEquals(true, myNode.getOrigin());
		myNode.origin();
		assertEquals(true, myNode.getOrigin());
	}
	
	@Test // SN-012
	public void setPropTest() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
		myNode.setProp("address", "testAddress");
		assertEquals("testAddress", myNode.getAddress());
	}
	
	@Test // SN-013
	public void setPropTest2() {
		SiteNode myNode = new SiteNode();
		assertEquals(null, myNode.getAddress());
		myNode.setProp(null, "testAddress");
		assertEquals(null, myNode.getAddress());
	}
	
	@Test // SN-014
	public void getJsonTest() {
		SiteNode myNode = new SiteNode();
		String myJson = "{\"label\": \"Site\"}";
		assertEquals(myJson, myNode.toJson());
	}
	
	@Test // SN-015
	public void getJsonTest2() {
		SiteNode myNode = new SiteNode();
		String myJson = "{\"label\": \"Site\"}";
		String updatedJson = "{\"label\": \"Site\", \"name\": \"testName\"}";
		assertEquals(myJson, myNode.toJson());
		myNode.name("testName");
		System.out.println(myNode.toJson());
		assertEquals(updatedJson, myNode.toJson());
	}
	
	@Test // SN-016
	public void constructorTest() {
		SiteNode myNode = new SiteNode();
		String myJson = "{\"label\": \"Site\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(null, myNode.getUuid());
	}
	
	
	@Test // SN-017
	public void constructorTest2() {
		String myUUID = "9dcfc8d1-e8dd-4728-854c-dda85a1c142e";
		SiteNode myNode = new SiteNode(UUID.fromString(myUUID));
		String myJson = "{\"label\": \"Site\", \"uuid\": \"9dcfc8d1-e8dd-4728-854c-dda85a1c142e\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(myUUID, myNode.getUuid().toString());
	}
	
	@Test // SN-018
	public void anotherTest() {
		String myUUID = "5be87987-2266-42d1-a832-bdfb32ce68b8";
		SiteNode myNode = new SiteNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		SiteNode anotherNode = (SiteNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
	}
	
	@Test // SN-019
	public void anotherTest2() {
		String myUUID = "92278439-7d4d-42aa-b6ff-a8fd5c01ece7";
		SiteNode myNode = new SiteNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		SiteNode anotherNode = (SiteNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
		SiteNode anotherNodeTwo = (SiteNode) myNode.another();
		assertEquals(null, anotherNodeTwo.getUuid());
	}
}
