package Com.Maven.JUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestToValidateUserLoginTest {

	static JunitTestToValidateUserLoginTest test;
	
	@BeforeClass
	public void init() {

		test = new JunitTestToValidateUserLoginTest();

	}

	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {

		boolean result = test.firstNameValidate("Shilpa");
		Assert.assertTrue(result);

	}

	

	private boolean firstNameValidate(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {

		boolean result = test.firstNameValidate("Shi");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {

		boolean result = test.lastNameValidate("Lpa");
		Assert.assertTrue(result);
	}

	private boolean lastNameValidate(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {

		boolean result = test.lastNameValidate("ppa");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {

		boolean result = test.emailValidate("ABC.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	private boolean emailValidate(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {

		boolean result = test.emailValidate("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {

		boolean result = test.phoneNumberValidate("91 9632444186");
		Assert.assertTrue(result);
	}

	private boolean phoneNumberValidate(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {

		boolean result = test.phoneNumberValidate("9561456789");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {

		boolean result = test.passwordValidate("Xyz12345@");
		Assert.assertTrue(result);
	}

	private boolean passwordValidate(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {

		boolean result = test.passwordValidate("Manu#@");
		Assert.assertFalse(result);
	}
}
