package routes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.credersi_vend.routes.rels.OwnsRel;

public class OwnsRelTest {
	
	
	@Test // ORL-001
	public void getLabelTest() {
		OwnsRel myRel = new OwnsRel();
		assertEquals("OWNS", myRel.getLabel());
	}
	
	@Test // ORL-002
	public void getJsonTest() {
		OwnsRel myRel = new OwnsRel();
		assertEquals("", myRel.toJson());
	}
	
	@Test // ORL-003
	public void getPropsTest() {
		String alias = "testAlias";
		List<String> params = Arrays.asList("A", "B", "C");
		OwnsRel myRel = new OwnsRel();
		assertEquals("", myRel.toProps(alias, params));
	}
	

}
