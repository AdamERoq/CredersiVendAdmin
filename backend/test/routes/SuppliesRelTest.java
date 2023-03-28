package routes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.credersi_vend.routes.rels.SuppliesRel;

public class SuppliesRelTest {

	@Test // SRL-001
	public void getLabelTest() {
		SuppliesRel myRel = new SuppliesRel();
		assertEquals("SUPPLIES", myRel.getLabel());
	}
	
	@Test // SRL-002
	public void getJsonTest() {
		SuppliesRel myRel = new SuppliesRel();
		assertEquals("", myRel.toJson());
	}

	@Test // SRL-003
	public void getPropsTest() {
		String alias = "testAlias";
		List<String> params = Arrays.asList("A", "B", "C");
		SuppliesRel myRel = new SuppliesRel();
		assertEquals("", myRel.toProps(alias, params));
	}
}
