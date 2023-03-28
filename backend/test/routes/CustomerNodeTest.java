package routes;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.routes.nodes.CustomerNode;
import com.credersi_vend.routes.nodes.DomainNode;

public class CustomerNodeTest {

	@Test // CN-001
	public void getLabelTest() {
		CustomerNode myNode = new CustomerNode();
		assertEquals("Customer", myNode.getLabel());
	}
	
	@Test // CN-002
	public void setNameTest() {
		CustomerNode myNode = new CustomerNode();
		assertEquals("", myNode.getName());
		myNode.name("testCustomer");
		assertEquals("testCustomer", myNode.getName());
	}
	
	@Test // CN-003
	public void setNameTest2() {
		CustomerNode myNode = new CustomerNode();
		assertEquals("", myNode.getName());
		myNode.name("testCustomer");
		assertEquals("testCustomer", myNode.getName());
		myNode.name("myCustomer");
		assertEquals("myCustomer", myNode.getName());
	}
	
	@Test // CN-004
	public void constructorTest() {
		CustomerNode myNode = new CustomerNode();
		String myJson = "{\"label\": \"Customer\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(null, myNode.getUuid());
	}
	
	@Test // CN-005
	public void constructorTest2() {
		String myUUID = "8ba2723b-3939-48c3-b225-07632bcd4022";
		DomainNode myNode = new DomainNode(UUID.fromString(myUUID));
		String myJson = "{\"label\": \"Domain\", \"uuid\": \"8ba2723b-3939-48c3-b225-07632bcd4022\"}";
		assertEquals(myJson, myNode.toJson());
		assertEquals(myUUID, myNode.getUuid().toString());
	}
	
	@Test // CN-006
	public void anotherTest() {
		String myUUID = "e0b027bc-8710-435b-aa04-831964b70053";
		CustomerNode myNode = new CustomerNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		CustomerNode anotherNode = (CustomerNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
	}
	
	@Test // CN-007
	public void anotherTest2() {
		String myUUID = "816f6128-c746-415c-9b99-8b6dbbf92ac7";
		CustomerNode myNode = new CustomerNode(UUID.fromString(myUUID));
		assertEquals(myUUID, myNode.getUuid().toString());
		CustomerNode anotherNode = (CustomerNode) myNode.another();
		assertEquals(null, anotherNode.getUuid());
		CustomerNode anotherNodeTwo = (CustomerNode) myNode.another();
		assertEquals(null, anotherNodeTwo.getUuid());
	}
}
