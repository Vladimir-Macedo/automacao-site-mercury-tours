package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class RegisterPage extends Base {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	By register_link_ = By.xpath("//a[contains(text(),'REGISTER')]");
	By register_title = By.xpath("//img[@src='images/mast_register.gif']");
	By first_name = By.name("firstName");
	By last_name = By.name("lastName");
	By phone_number = By.name("phone");
	By e_mail = By.id("userName");
	By adress = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postal_code = By.name("postalCode");
	By country = By.name("country");
	By username = By.id("email");
	By password = By.name("password");
	By confirm_password = By.name("confirmPassword");
	By btn_consultar = By.name("submit");

	By registerNote = By.xpath("//b[contains(text(), 'Note: Your user name is ')]");

	// Util util = new Util();

	// Métodos

	public void clicarLinkRegistro() {
		click(register_link_);
	}

	public Boolean verificaSeEstaNaPaginaDeRegistro() {
		return isDisplayed(register_title);
	}

	public void enterFirstName(String firstName) {
		type(firstName, first_name);
	}

	public void enterLastName(String lastName) {
		type(lastName, last_name);
	}

	public void enterPhoneNumber(String phoneNumber) {
		type(phoneNumber, phone_number);
	}

	public void enterEmail(String email) {
		type(email, e_mail);
	}

	public void enterAdress(String adresses) {
		type(adresses, adress);
	}

	public void enterCity(String cities) {
		type(cities, city);
	}

	public void enterState(String states) {
		type(states, state);
	}

	public void enterPostalCode(String postalcode) {
		type(postalcode, postal_code);
	}

	public void enterCountry(String countryes) {
		type(countryes, country);
	}

	public void enterUsename(String user) {
		type(user, username);
	}

	public void enterPassword(String pass) {
		type(pass, password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		type(confirmPassword, confirm_password);
	}

	public void clicarNoBotaoFazerAConsulta() {

		click(btn_consultar);
	}

	public String validaUsuarioRegistradoComSucesso() {
		return getText(registerNote);
	}

}
