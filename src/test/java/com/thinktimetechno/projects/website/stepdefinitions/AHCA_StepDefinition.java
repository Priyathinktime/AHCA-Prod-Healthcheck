package com.thinktimetechno.projects.website.stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
//import com.thinktimetechno.projects.website.pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AHCA_StepDefinition {

//	DashboardPage dashboardPage;

	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

	public AHCA_StepDefinition(TestContext testContext) {
//		dashboardPage = testContext.getDashboardPage();

	}

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		WebUI.getURL("https://cpraedcourse.com/");
	}

	@When("the user clicks on {string}")
	public void the_user_clicks_on(String linkName) {
		String ID = null;

		if (linkName.equals("Group Login")) {
			ID = "group_login";
		} else if (linkName.equals("Customer Login")) {
			ID = "customer_login";
		}
		WebUI.clickElement(By.id(ID));

	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String buttonName) {

	}

	@Then("the user should be navigated to the Customer Login page")
	public void the_user_should_be_navigated_to_the_customer_login_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Login | User - American Health Care Academy"));

	}

	@Then("the user should be navigated to the Group Login page")
	public void the_user_should_be_navigated_to_the_group_login_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Login | Groupadmin - American Health Care Academy"));

	}

	@When("the user hovers over Course Information")
	public void the_user_hovers_over_Course_Information() {
		WebUI.mouseHover(By.xpath("//li[@class='menu-item-has-children course-info']/a[text()='Course Information']"));
	}

	@When("clicks on {string}")
	public void clicks_on(String courseName) {

		WebUI.clickElementWithJs(By.xpath("//li[@class='menu-item']/a[text()='" + courseName + "']"));

	}

	@Then("the user should be navigated to the Standard First Aid Course page")
	public void the_user_should_be_navigated_to_the_standard_first_aid_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("First Aid Course-First Aid Certification-First Aid Basics"));

	}

	@Then("the user should be navigated to the Bloodborne Pathogens Course page")
	public void the_user_should_be_navigated_to_the_bloodborne_pathogens_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Bloodborne Pathogens Course Online"));

	}

	@Then("the user should be navigated to the CPR AED + First Aid Combo Course page")
	public void the_user_should_be_navigated_to_the_cpr_aed_first_aid_combo_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("online cpr first aid certification | CPR AED First Aid"));

	}

	@Then("the user should be navigated to the Healthcare Provider CPR AED + First Aid Combo - BLS Course page")
	public void the_user_should_be_navigated_to_the_healthcare_provider_cpr_aed_first_aid_combo_bls_course_page() {
		Assert.assertTrue(
				WebUI.verifyPageTitleContains("Healthcare Provider CPR/AED & First Aid Certification Online"));

	}

	@Then("the user should be navigated to the CPR AED Course page")
	public void the_user_should_be_navigated_to_the_cpr_aed_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR AED Certification | CPR Video | cpr aed certificate"));

	}

	@Then("the user should be navigated to the ACLS PALS Course page")
	public void the_user_should_be_navigated_to_the_acls_pals_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("ACLS Course Online | Advanced Life Support Certification"));

	}

	@When("the user clicks on {string} in the footer")
	public void the_user_clicks_on_in_the_footer(String linkText) {
		WebUI.waitForElementVisible(By.id("popup-box"));
		WebUI.clickElementWithJs(By.xpath("//a[@class='reject-lnk']"));
		WebUI.moveToElement(By.xpath("//footer[@class='custom-footer-v2']"));
		//WebUI.clickElement(By.xpath("//a[text()='" + linkText + "']"));
		WebUI.clickElementWithJs(By.xpath("//a[text()='" + linkText + "']"));
	}

	@Then("the user should be navigated to the About Us page")
	public void the_user_should_be_navigated_to_the_about_us_page() {
		Assert.assertTrue(
				WebUI.verifyPageTitleContains("About American Healthcare Academy | CPR Certification Online"));

	}
	@Then("the user should be navigated to the Contact Us page")
	public void the_user_should_be_navigated_to_the_contact_us_page() {
		
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR First Aid Certification Online Registration | CPR Online"));
		


		
	}

	@Then("the user should be navigated to the Careers page")
	public void the_user_should_be_navigated_to_the_careers_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Careers"));
	}

	@Then("the user should be navigated to the Testimonials page")
	public void the_user_should_be_navigated_to_the_testimonials_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR Certification Reviews | American Health Care Academy"));

	}

	@Then("the user should be navigated to the Privacy Policy page")
	public void the_user_should_be_navigated_to_the_privacy_policy_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Privacy Policy - Online CPR Certification"));
	}

	@Then("the user should be navigated to the Money Back Guarantee page")
	public void the_user_should_be_navigated_to_the_money_back_guarantee_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Money Back Guarantee CPR Certification Online | AHCA"));
	}

	@Then("the user should be navigated to the Terms of Service page")
	public void the_user_should_be_navigated_to_the_terms_of_service_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Terms Of Service - American Health Care Academy"));
	}

	@Then("the user should be navigated to the FAQ page")
	public void the_user_should_be_navigated_to_the_faq_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Online CPR Certification Faqs | Official CPR Certification"));
		
	}

	@Then("the user should be navigated to the Blog page")
	public void the_user_should_be_navigated_to_the_blog_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR First Aid BLS Blog | Certifications For Healthcare"));
		
	}

	@Then("the user should be navigated to the Join Our Community page")
	public void the_user_should_be_navigated_to_the_join_our_community_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Join Our Community"));
	}

	@Then("the user should be navigated to the Certification Details page successfully")
	public void the_user_should_be_navigated_to_the_certification_details_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR Certification Card Online | CPR Card On | Standard CPR"));
		
		
		
		
	}

	@Then("the user should be navigated to the Replacement Cards page successfully")
	public void the_user_should_be_navigated_to_the_replacement_cards_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR Certification Card | Replacement Cards"));
		
	}

	@Then("the user should be navigated to the Group Program page successfully")
	public void the_user_should_be_navigated_to_the_group_program_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Group CPR Training | Corporate CPR Training | AHA CPR Course"));
		
	}

	@Then("the user should be navigated to the Industry CPR Training page successfully")
	public void the_user_should_be_navigated_to_the_industry_cpr_training_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Every Industry Needs CPR Certification | AHCA"));
		
	}

	@Then("the user should be navigated to the Accreditation page successfully")
	public void the_user_should_be_navigated_to_the_accreditation_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Accreditation"));
		
		
	}

	@Then("the user should be navigated to the CPR Ratio page successfully")
	public void the_user_should_be_navigated_to_the_cpr_ratio_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR Ratio for Adults, Children, and Infants"));
		
	}

	@Then("the user should be navigated to the Free CPR Class page successfully")
	public void the_user_should_be_navigated_to_the_free_cpr_class_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Free CPR Class Online"));
		
	}

	@Then("the user should be navigated to the Blended Learning page successfully")
	public void the_user_should_be_navigated_to_the_blended_learning_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Blended CPR First Aid Training | Blended CPR Classes"));
		
	}

	@Then("the user should be navigated to the Verify Certificate page successfully")
	public void the_user_should_be_navigated_to_the_verify_certificate_page() {
		WebUI.switchToWindowOrTabByUrl("https://app.cpraedcourse.com/verifycertificate?_gl=1*j1okr5*_gcl_au*MTUzODY3NTE4NC4xNzQ1MzAyNTY2*_ga*MjA5NDgyMzczMy4xNzQ1MzAyNTY2*_ga_BQXRHZVPD0*MTc0NTMwMjU2Ni4xLjAuMTc0NTMwMjU3MC41Ni4wLjA.");
		Assert.assertTrue(WebUI.verifyPageTitleContains("Verifycertificate - American Health Care Academy"));
		
		
	}

	@Then("the user should be navigated to the Renewals page successfully")
	public void the_user_should_be_navigated_to_the_renewals_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Online CPR Renewal | Renew CPR | Renewing CPR Certification"));

	}

	@Then("the user should be navigated to the CPRAED Course Overview page successfully")
	public void the_user_should_be_navigated_to_the_cpr_aed_course_overview_page_successfully() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("CPR For Healthcare Providers | American Healthcare Academy"));
	}

	@Then("the user should be navigated to the BLS Course Overview page successfully")
	public void the_user_should_be_navigated_to_the_bls_course_overview_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Advance Your Career with Online BLS Training"));
	}

	@Then("the user should be navigated to the First Aid Course Overview page successfully")
	public void the_user_should_be_navigated_to_the_first_aid_course_overview_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("First Aid Certification | First Aid Certification Online"));
	}

	@Then("the user should be navigated to the Healthcare Provider Course Overview page successfully")
	public void the_user_should_be_navigated_to_the_healthcare_provider_course_overview_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Healthcare Providers CPR | Healthcare CPR |"));
	}

	@Then("the user should be navigated to the Bloodborne Pathogens Course Overview page successfully")
	public void the_user_should_be_navigated_to_the_bloodborne_pathogens_course_overview_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("bloodborne pathogens certification | Bloodborne"));
	}

	@Then("the user should be navigated to the ACLS Course page successfully")
	public void the_user_should_be_navigated_to_the_acls_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("ACLS Certification | ACLS Online | ACLS Recertification"));
	}

	@Then("the user should be navigated to the PALS Course page successfully")
	public void the_user_should_be_navigated_to_the_pals_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("PALS Certification Online | pals classes online"));
	}

	@Then("the user should be navigated to the HIPAA Course page successfully")
	public void the_user_should_be_navigated_to_the_hipaa_course_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("HIPAA Training Online: Get Certified now for Healthcare Workers"));
	}

	@Then("the user should be navigated to the CPRAED Recertification page successfully")
	public void the_user_should_be_navigated_to_the_cpr_aed_recertification_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Online CPR Renewal: Keep Your Life-Saving Skills Up-to-Date"));
	}

	@Then("the user should be navigated to the BLS Recertification page successfully")
	public void the_user_should_be_navigated_to_the_bls_recertification_page() {
		Assert.assertTrue(WebUI.verifyPageTitleContains("Renew Your BLS Online: Save Time & Get Recertified Today!"));
	}
	


}
