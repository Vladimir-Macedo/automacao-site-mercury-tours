package steps;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.RegisterPage;

public class RegisterTest {

	private static WebDriver driver;

	RegisterPage registerPage;

	String first_name = "Jair";
	String last_name = "Nascimento";
	String phone = "11 23561428";
	String email = "vldmacedo@ig.com.br";
	String adress = "Rua Afonso de Albuquerque, 1890";
	String city = "São Bernardo do Campo";
	String state = "São Paulo";
	String postal_code = "09771458";
	String country = "ALGERIA";
	String username = "vlmacedo";
	String password = "123456";
	String confirm_password = password;

	@Before
	public void inicializa() {
		registerPage = new RegisterPage(driver);
		driver = registerPage.geckoDriverConnection();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		registerPage.visit("https://www.demo.guru99.com/test/newtours/");
	}

	@After
	public void finaliza() {
		//driver.quit();
	}

	@Test
	public void registrarUsuario() {

		registerPage.clicarLinkRegistro();
		registerPage.verificaSeEstaNaPaginaDeRegistro();

		registerPage.enterFirstName(first_name);
		registerPage.enterLastName(last_name);
		registerPage.enterPhoneNumber(phone);
		registerPage.enterEmail(email);
		registerPage.enterAdress(adress);
		registerPage.enterCity(city);
		registerPage.enterState(state);
		registerPage.enterPostalCode(postal_code);
		registerPage.enterCountry(country);
		registerPage.enterUsename(username);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(confirm_password);

		registerPage.clicarNoBotaoFazerAConsulta();

		assertEquals("Note: Your user name is " + username + ".", registerPage.validaUsuarioRegistradoComSucesso());

	}

}
