

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fairy.core.domain.Role;
import com.fairy.core.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/springContext.xml"})
public class MyTests {
	@Autowired
	private RoleService roleService;
	
	@Test
    public void testGet() {
		Role role = roleService.get(1l);
		Assert.assertTrue(role != null);
    }
	
	@Test
	public void testInsert() {
		try {
			Role role = new Role();
			role.setName("test");
			role.setDescription("test");
			roleService.save(role);
			Assert.assertTrue(role.getId() != null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
