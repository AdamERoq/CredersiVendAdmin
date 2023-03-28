package routes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.routes.nodes.DomainNode;

public class DomainNodeTest {

	@Test // DN-001
	public void getEnvironmentTest() {
		DomainNode myNode = new DomainNode();
		assertEquals(null, myNode.getEnvironment());
	}

	@Test // DN-002
	public void getEnvironmentTest2() {
		DomainNode myNode = new DomainNode();
		assertEquals(null, myNode.getEnvironment());
		myNode.environment("testEnv");
		assertEquals("testEnv", myNode.getEnvironment());
	}
	
	@Test // DN-003
	public void getLabelTest() {
		DomainNode myNode = new DomainNode(); 
		assertEquals("Domain", myNode.getLabel());
	}
	
	@Test // DN-004
	public void setEnvironmentTest() {
		DomainNode myNode = new DomainNode();
		assertEquals(null, myNode.getEnvironment());
		myNode.environment("testEnv");
		assertEquals("testEnv", myNode.getEnvironment());
	}
	
	@Test // DN-005
	public void getNameTest() {
		DomainNode myNode = new DomainNode();
		assertEquals("Credersi-vend", myNode.getName());
	}
	
	@Test // DN-006
	public void getNameTest2() {
		DomainNode myNode = new DomainNode();
		assertEquals("Credersi-vend", myNode.getName());
		myNode.name("testName");
		assertEquals("testName", myNode.getName());
	}
	
	@Test // DN-007
	public void setNameTest() {
		DomainNode myNode = new DomainNode();
		assertEquals("Credersi-vend", myNode.getName());
		myNode.setName("testName");
		assertEquals("testName", myNode.getName());
	}
	
	@Test // DN-008
	public void setNameTest2() {
		DomainNode myNode = new DomainNode();
		assertEquals("Credersi-vend", myNode.getName());
		myNode.setName("testName");
		assertEquals("testName", myNode.getName());
		myNode.setName("newName");
		assertEquals("newName", myNode.getName());
	}
	
	@Test // DN-009
	public void setPropTest() {
		DomainNode myNode = new DomainNode();
		assertEquals(null, myNode.getEnvironment());
		myNode.setProp("environment", "testEnv");
		assertEquals("testEnv", myNode.getEnvironment());
	}
	
	@Test // DN-010
	public void setPropTest2() {
		DomainNode myNode = new DomainNode();
		assertEquals(null, myNode.getEnvironment());
		myNode.setProp(null, "testEnv");
		assertEquals(null, myNode.getEnvironment());
	}
	
	@Test // DN-011
	public void getJsonTest() {
		DomainNode myNode = new DomainNode();
		String myJson = "{\"label\": \"Domain\", \"name\": \"Credersi-vend\"}";
		assertEquals(myJson, myNode.toJson());
	}
	
	@Test // DN-012
	public void getJsonTest2() {
		DomainNode myNode = new DomainNode();
		String myJson = "{\"label\": \"Domain\", \"name\": \"Credersi-vend\"}";
		String updatedJson = "{\"label\": \"Domain\", \"name\": \"testName\"}";
		assertEquals(myJson, myNode.toJson());
		myNode.name("testName");
		assertEquals(updatedJson, myNode.toJson());
	}
	
	
	@Test // DN-013
	public void constructorTest() {
		DomainNode myNode = new DomainNode();
		String myJson = "{\"label\": \"Domain\", \"name\": \"Credersi-vend\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(null, myNode.getUuid());
	}
	
	@Test // DN-014
	public void constructorTest2() {
		String myUUID = "8ba2723b-3939-48c3-b225-07632bcd4085";
		DomainNode myNode = new DomainNode(UUID.fromString(myUUID));
		String myJson = "{\"label\": \"Domain\", \"uuid\": \"8ba2723b-3939-48c3-b225-07632bcd4085\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(myUUID, myNode.getUuid().toString());
	}
	
	@Test // DN-015
	public void anotherTest() {
		String myUUID = "b8d663ce-c0b1-46fd-b823-78176f061f23";
		DomainNode myNode = new DomainNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		DomainNode anotherNode = (DomainNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
	}
	
	@Test // DN-016
	public void anotherTest2() {
		String myUUID = "b8d663ce-c0b1-46fd-b823-78176f061f24";
		DomainNode myNode = new DomainNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		DomainNode anotherNode = (DomainNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
		DomainNode anotherNodeTwo = (DomainNode) myNode.another();
		assertEquals(null, anotherNodeTwo.getUuid());
	}
	
	
}
