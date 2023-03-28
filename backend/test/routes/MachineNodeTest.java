package routes;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.routes.nodes.MachineNode;
import com.credersi_vend.routes.nodes.SiteNode;

public class MachineNodeTest extends MachineNode {

	@Test  // MN-001
	public void getLabelTest() {
		MachineNode myNode = new MachineNode();
		assertEquals("Machine", myNode.getLabel());
	}
	
	@Test // MN-002
	public void getLocationTest() {
		MachineNode myNode = new MachineNode();
		assertEquals(null, myNode.getLocation());
	}
	
	@Test // MN-003
	public void getLocationTest2() {
		MachineNode myNode = new MachineNode();
		assertEquals(null, myNode.getLocation());
		myNode.location("by the fire exit");
		assertEquals("by the fire exit", myNode.getLocation());
	}
	
	@Test // MN-004
	public void setLocationTest() {
		MachineNode myNode = new MachineNode();
		assertEquals(null, myNode.getLocation());
		myNode.location("testLocation");
		assertEquals("testLocation", myNode.getLocation());
	}
	
	@Test // MN-005
	public void setNameTest() {
		MachineNode myNode = new MachineNode();
		assertEquals("", myNode.getName());
		myNode.name("testName");
		assertEquals("testName", myNode.getName());
	}

	@Test // MN-006
	public void setNameTest2() {
		MachineNode myNode = new MachineNode();
		assertEquals("", myNode.getName());
		myNode.name("testName");
		assertEquals("testName", myNode.getName());
		myNode.name("newName");
		assertEquals("newName", myNode.getName());
	}
	
	@Test // MN-007
	public void constructorTest() { 
		MachineNode myNode = new MachineNode();
		String myJson = "{\"label\": \"Machine\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(null, myNode.getUuid());
	}
	
	@Test // MN-008
	public void constructorTest2() {
		String myUUID = "9dcfc8d1-e8dd-4728-854c-dda85a1c142e";
		MachineNode myNode = new MachineNode(UUID.fromString(myUUID));
		String myJson = "{\"label\": \"Machine\", \"uuid\": \"9dcfc8d1-e8dd-4728-854c-dda85a1c142e\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(myUUID, myNode.getUuid().toString());
	}
	
	@Test // MN-009
	public void anotherTest() {
		String myUUID = "ed60bf63-4b65-45c9-87f2-f206d47654ca";
		MachineNode myNode = new MachineNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		MachineNode anotherNode = (MachineNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
	}
	
	
	
	@Test // MN-010
	public void anotherTest2() {
		String myUUID = "65b79d67-d830-40ac-a135-dd135bf993e5";
		MachineNode myNode = new MachineNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		MachineNode anotherNode = (MachineNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
		MachineNode anotherNodeTwo = (MachineNode) myNode.another();
		assertEquals(null, anotherNodeTwo.getUuid());
	}
	
	@Test // MN-011
	public void setPropTest() {
		MachineNode myNode = new MachineNode();
		assertEquals(null, myNode.getLocation());
		myNode.setProp("location", "testLocation");
		assertEquals("testLocation", myNode.getLocation());
	}
	
	@Test // MN-012
	public void setPropTest2() {
		MachineNode myNode = new MachineNode();
		assertEquals(null, myNode.getLocation());
		myNode.setProp(null, "testLocation");
		assertEquals(null, myNode.getLocation());
	}
	
	@Test // MN-013
	public void getJsonTest() {
		MachineNode myNode = new MachineNode();
		String defaultJson = "{\"label\": \"Machine\"}";
		assertEquals(defaultJson, myNode.toJson());
	}
	
	@Test // MN-014
	public void getJsonTest2() {
		MachineNode myNode = new MachineNode();
		String defaultJson = "{\"label\": \"Machine\"}"; 
		String updatedJson = "{\"label\": \"Machine\", \"location\": \"testLocation\"}";
		assertEquals(defaultJson, myNode.toJson());
		myNode.setProp("location", "testLocation");
		assertEquals(updatedJson, myNode.toJson());
	}
}
