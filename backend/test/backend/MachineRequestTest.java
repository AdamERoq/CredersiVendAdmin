package backend;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.credersi_vend.backend.routes.nodes.MachineRequest;

public class MachineRequestTest {

	@Test // MR-001
	public void getDirectionsTest() {
		MachineRequest myRequest = new MachineRequest("Left then down the stairs", "By the fire escape", "MR-001");
		assertEquals("Left then down the stairs", myRequest.getDirections());
	}
	
	@Test // MR-002
	public void getDirectionsTest2() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getDirections());
	}
	
	@Test // MR-003
	public void getLocationTest() {
		MachineRequest myRequest = new MachineRequest("Left then down the stairs", "By the fire escape", "MR-003");
		assertEquals("By the fire escape", myRequest.getLocation());
	}
	
	@Test // MR-004
	public void getLocationTest2() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getLocation());
	}
	
	@Test // MR-005
	public void getNameTest() {
		MachineRequest myRequest = new MachineRequest("Left then down the stairs", "By the fire escape", "Test Machine");
		assertEquals("Test Machine", myRequest.getName());
	}
	
	@Test // MR-006
	public void getNameTest2() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getName());
	}
	
	@Test // MR-007
	public void getUUIDTest() {
		String myUUID = "04e165bb-5d2d-4c90-8cbf-3b03c2bc4d74";
		
		MachineRequest myRequest = new MachineRequest("Left then down the stairs", "By the fire escape", "MR-007", UUID.fromString(myUUID));
		assertEquals("04e165bb-5d2d-4c90-8cbf-3b03c2bc4d74", myRequest.getUuid().toString());
	}
	
	@Test // MR-008
	public void getUUIDTest2() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getUuid());
	}
	
	
	@Test // MR-009
	public void setDirectionsTest() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getDirections());
		myRequest.setDirections("right");
		assertEquals("right", myRequest.getDirections());
	}

	@Test // MR-010
	public void setLocationTest() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getLocation());
		myRequest.setLocation("Test");
		assertEquals("Test", myRequest.getLocation());
	}
	
	@Test // MR-011
	public void setNameTest() {
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getName());
		myRequest.setName("Test");
		assertEquals("Test", myRequest.getName());
	}
	
	@Test // MR-012
	public void setUUIDTest() {
		String myUUID = "6788d6cb-ca3a-47d1-ba8e-1935c4c80743";
		
		MachineRequest myRequest = new MachineRequest();
		assertEquals(null, myRequest.getUuid());
		myRequest.setUuid(UUID.fromString(myUUID));
		assertEquals("6788d6cb-ca3a-47d1-ba8e-1935c4c80743", myRequest.getUuid().toString());
	}

}
