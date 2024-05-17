package nisarahmedqae.testComponents;

import java.util.Properties;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Store;
import jakarta.mail.search.SubjectTerm;

public class MailOTPReader {

	public static void main(String[] args) {
		int getOTP = MailOTPReader.getGmailOTP("nisarahmed.qae@gmail.com", "tmqblpomkycyupti");
		System.out.println(getOTP);
	}

	public static int getGmailOTP(String inputUsername, String inputPassword) {
		final String username = inputUsername; // Your Gmail username
		final String password = inputPassword; // Your Gmail password

		// Set the properties for accessing Gmail
		Properties props = new Properties();
		props.put("mail.imap.host", "imap.gmail.com");
		props.put("mail.imap.port", "993");
		props.put("mail.imap.ssl.enable", "true");

		// Get the Session object
		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Connect to the Gmail server
			Store store = session.getStore("imap");
			store.connect();

			// Open the INBOX folder
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			// Search for emails from Amazon
			Message[] messages = inbox.search(new SubjectTerm("Verify your new Amazon account"));

			// Display the OTP from the latest email
			if (messages.length > 0) {
				String content = messages[0].getContent().toString();
				int startIndex = content.indexOf("Your Amazon verification code is ")
						+ "Your Amazon verification code is ".length();
				int endIndex = content.indexOf(".", startIndex);
				String otp = content.substring(startIndex, endIndex);
				System.out.println("Amazon OTP: " + otp);
				// Convert the OTP string to an integer and return
				return Integer.parseInt(otp);
			} else {
				System.out.println("No Amazon OTP found.");
			}

			// Close connections
			inbox.close(false);
			store.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Return -1 if OTP retrieval fails
		return -1;
	}
}
