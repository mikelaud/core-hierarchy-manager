package mikelaud.core.hierarchy;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class HierarchyManagerTest {

	private HierarchyManager mHierarchyManager = null;
	
	@Before
	public void before() {
		mHierarchyManager = new HierarchyManager();
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(mHierarchyManager);
	}

}
