package routes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.credersi_vend.routes.rels.RouteRel;

public class RouteRelTest {

	@Test //RRL-001
	public void getDirectionsTest() {
		RouteRel myRel = new RouteRel();
		assertEquals(null, myRel.getDirections());
	}

	@Test //RRL-002
	public void getDirectionsTest2() {
		RouteRel myRel = new RouteRel();
		myRel.directions("right");
		assertEquals("right", myRel.getDirections());
	}
	
	@Test //RRL-003
	public void getLabelTest() {
		RouteRel myRel = new RouteRel();
		assertEquals("ROUTE", myRel.getLabel());
	}
	
	@Test //RRL-004
	public void setDirectionsTest() {
		RouteRel myRel = new RouteRel();
		assertEquals(null, myRel.getDirections());
		myRel.directions("left");
		assertEquals("left", myRel.getDirections());
	}
	
	@Test //RRL-005
	public void setDirectionsTest2() {
		RouteRel myRel = new RouteRel();
		assertEquals(null, myRel.getDirections());
		myRel.directions("right");
		assertEquals("right", myRel.getDirections());
		myRel.directions("left");
		assertEquals("left", myRel.getDirections());
	}
	
	@Test //RRL-006
	public void setDirectionsTest3() {
		//RouteRel myRel = new RouteRel();
		//assertEquals(null, myRel.getDirections());
		//myRel.directions(1); - THROWS - FINISH TEST
		//assertEquals(1, myRel.getDirections());
	}
	
	@Test // RRL-007
	public void setPropTest() {
		RouteRel myRel = new RouteRel();
		String defaultJson = "{\"label\": \"ROUTE\"}";
		String updatedJson = "{\"label\": \"ROUTE\", \"directions\": \"testValue\"}";
		
		assertEquals(defaultJson, myRel.toJson());
		myRel.setProp("directions", "testValue");
		assertEquals(updatedJson, myRel.toJson());
	}
	
	@Test // RRL-008
	public void setPropTest2() {
		RouteRel myRel = new RouteRel();
		String defaultJson = "{\"label\": \"ROUTE\"}";
		
		assertEquals(defaultJson, myRel.toJson());
		myRel.setProp(null, "testValue");
		assertEquals(defaultJson, myRel.toJson());
	}
	
	
	@Test // RRL-009
	public void setPropTest3() {
		RouteRel myRel = new RouteRel();
		String defaultJson = "{\"label\": \"ROUTE\"}";
		
		assertEquals(defaultJson, myRel.toJson());
		myRel.setProp("notDirections", "testValue");
		assertEquals(defaultJson, myRel.toJson());
	}
	
	@Test // RRL-010
	public void getJsonTest() {
		RouteRel myRel = new RouteRel();
		String defaultJson = "{\"label\": \"ROUTE\"}";
		assertEquals(defaultJson, myRel.toJson());
	}
	
	@Test // RRL-011
	public void getJsonTest2() {
		RouteRel myRel = new RouteRel();
		String defaultJson = "{\"label\": \"ROUTE\"}";
		String updatedJson = "{\"label\": \"ROUTE\", \"directions\": \"testDirections\"}";
		assertEquals(defaultJson, myRel.toJson());
		
		myRel.setProp("directions", "testDirections");
		assertEquals(updatedJson, myRel.toJson());
	}
	
	@Test // RRL-012
	public void getPropsTest() {
		RouteRel myRel = new RouteRel();
		String alias = "testAlias";
		String paramOne = "{\"directions\": \"left\"}";
		String paramTwo = "{\"directions\": \"right\"}";
		
		List<String> params = Arrays.asList(paramOne, paramTwo);
		//myRel.setProp("directions", "testDirections");
		//System.out.println(myRel.toProps(alias, params));
		myRel.toProps(alias, params);
		System.out.println(myRel.toJson());
		
		// COME BACK TO THIS ONE
	}
}
