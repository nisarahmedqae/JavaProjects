package day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {

	@Test
	void testGenerateDummyData() {
		Faker faker = new Faker();

		String fullname = faker.name().fullName();
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String username = faker.name().username();

		String password = faker.internet().password();
		String email = faker.internet().safeEmailAddress();

		String phoneno = faker.phoneNumber().cellPhone();

		System.out.println("Full Name: " + fullname);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneno);
	}
}
